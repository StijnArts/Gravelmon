package drai.dev.data.jsonwriters.data;

import com.google.gson.*;
import drai.dev.data.games.registry.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.attributes.*;
import org.jetbrains.annotations.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SpawnPoolWorldJSONWriter {

    public static void writeSpawns(Game game, String resourcesDir){
        String dir = resourcesDir+"\\data\\cobblemon\\spawn_pool_world\\";
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        game.getNewPokemon().forEach(pokemon -> {
            if(!Pokemon.isAnAdditionalForm(pokemon)) {
                try {
                    Files.createDirectories(new File(dir).toPath());
                    writeSpawn(pokemon, dir, gson);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    private static void writeSpawn(Pokemon pokemon, String dir, Gson gson) throws IOException {
        if(!pokemon.isNew() || Pokemon.FOSSIL_POKEMON.contains(pokemon)) return;
        var spawnPool = createSpawnPoolJson();
        JsonArray spawns = spawnPool.getAsJsonArray("spawns");
        createSpawnJson(spawns, pokemon.getCleanName(), null, pokemon.getSpawnData());
        for (PokemonForm form :pokemon.getForms()) {
            if(form.isBattleOnly()) continue;
            createSpawnJson(spawns, pokemon.getCleanName(), form.getFormName(), pokemon.getSpawnData());
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir+pokemon.getCleanName()+".json"));
        writer.write(gson.toJson(spawnPool));
        writer.close();

    }

    public static JsonObject createSpawnPoolJson(){
        JsonObject spawnPoolJson = new JsonObject();
        spawnPoolJson.addProperty("enabled", true);
        spawnPoolJson.add("neededInstalledMods", new JsonArray());
        spawnPoolJson.add("neededUninstalledMods", new JsonArray());
        var spawns = new JsonArray();
        spawnPoolJson.add("spawns", spawns);
        return spawnPoolJson;
    }

    public static void createSpawnJson(JsonArray spawns, String pokemonName, @Nullable String formName, List<PokemonSpawnData> spawnData){
        for (int i = 0; i < spawnData.size(); i++) {
            var pokemonSpawnData = spawnData.get(i);
            JsonObject spawnJson = new JsonObject();
            spawnJson.addProperty("id", (formName!=null ? formName.toLowerCase() + "_": "") + pokemonName + "-"+i+1);
            spawnJson.addProperty("pokemon", pokemonName + (formName!=null ? " " + formName.toLowerCase() : ""));
            if(!pokemonSpawnData.spawnPresets().isEmpty()){
                var presets = new JsonArray();
                spawnJson.add("presets", presets);
                for(SpawnPreset spawnPreset : pokemonSpawnData.spawnPresets()){
                    presets.add(spawnPreset.getName().toLowerCase());
                }
            }
            spawnJson.addProperty("type", "pokemon");
            spawnJson.addProperty("context", pokemonSpawnData.spawnContext().getName());
            spawnJson.addProperty("bucket", pokemonSpawnData.spawnPool().getName());
            spawnJson.addProperty("level", pokemonSpawnData.minSpawnLevel()+"-"+pokemonSpawnData.maxSpawnLevel());
            spawnJson.addProperty("weight", pokemonSpawnData.spawnWeight());
            if(!pokemonSpawnData.spawnConditions().isEmpty()){
                var condition = new JsonObject();
                spawnJson.add("condition", condition);
                pokemonSpawnData.spawnConditions().forEach(spawnCondition -> processCondition(condition, spawnCondition));
            }
            if(!pokemonSpawnData.spawnAntiConditions().isEmpty()) {
                var antiCondition = new JsonObject();
                spawnJson.add("anticondition", antiCondition);
                pokemonSpawnData.spawnAntiConditions().forEach(spawnCondition -> processCondition(antiCondition, spawnCondition));
            }
            if(!pokemonSpawnData.preferredBlocks().isEmpty()){
                var weightMultiplier = new JsonObject();
                spawnJson.add("weightMultiplier", weightMultiplier);
                weightMultiplier.addProperty("multiplier", 5.0f);
                var condition = new JsonObject();
                weightMultiplier.add("condition", condition);
                if(!pokemonSpawnData.preferredBlocks().isEmpty()) {
                    var neededNearbyBlocks = new JsonArray();
                    condition.add("neededNearbyBlocks", neededNearbyBlocks);
                    pokemonSpawnData.preferredBlocks().forEach(neededNearbyBlocks::add);
                }
            }
            spawns.add(spawnJson);
        }
    }

    public static void processCondition(JsonObject condition, SpawnCondition spawnCondition) {
        if(spawnCondition instanceof BiomeSpawnCondition biomeSpawnCondition){
            var biomeSpawnConditionsArray = new JsonArray();
            biomeSpawnCondition.getBiomes().forEach(biome -> biomeSpawnConditionsArray.add(biome.getId()+":"+biome.getName()));
            condition.add("biomes", biomeSpawnConditionsArray);
        }
        else if(spawnCondition.getConditionKind().getName().equalsIgnoreCase("canSeeSky")){
            var minLight = 8;
            var maxLight = 15;
            if(!Boolean.parseBoolean(spawnCondition.getCondition())) {
                minLight = 0;
                maxLight = 7;
            }
            condition.addProperty("minSkyLight", minLight);
            condition.addProperty("maxSkyLight", maxLight);
        }
        else {
            if(spawnCondition.getConditionKind().getValueType().equals("boolean")){
                condition.addProperty(spawnCondition.getConditionKind().getName(), Boolean.parseBoolean(spawnCondition.getCondition()));
            } else{
                try {
                    condition.addProperty(spawnCondition.getConditionKind().getName(),Integer.parseInt(spawnCondition.getCondition()));
                } catch (NumberFormatException e) {
                    condition.addProperty(spawnCondition.getConditionKind().getName(), spawnCondition.getCondition());
                }
            }
        }
    }
}
