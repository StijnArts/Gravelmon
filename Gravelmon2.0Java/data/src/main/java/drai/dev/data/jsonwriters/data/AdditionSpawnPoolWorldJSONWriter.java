package drai.dev.data.jsonwriters.data;

import com.google.gson.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

import static drai.dev.data.jsonwriters.data.SpawnPoolWorldJSONWriter.createSpawnPoolJson;

public class AdditionSpawnPoolWorldJSONWriter {

    public static void writeSpawns(String resourcesDir) {
        String dir = resourcesDir + "\\data\\gravelmon\\spawn_pool_world\\";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Pokemon.ADDITIONAL_FORMS.entrySet().forEach(set -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writeSpawn(set, dir, gson);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private synchronized static void writeSpawn(Map.Entry<String, List<Pokemon>> set, String dir, Gson gson) throws IOException {
        var spawnPool = createSpawnPoolJson();
        JsonArray spawns = spawnPool.getAsJsonArray("spawns");
        if (!set.getValue().isEmpty()) {
            for (Pokemon pokemon : set.getValue()) {
                if (Pokemon.FOSSIL_POKEMON.contains(pokemon)) continue;
                SpawnPoolWorldJSONWriter.createSpawnJson(spawns, set.getKey(), pokemon.getAdditionalAspect().name().toLowerCase(), pokemon.getSpawnData());
                for (PokemonForm form : pokemon.getForms()) {
                    if (form.isBattleOnly()) continue;
                    SpawnPoolWorldJSONWriter.createSpawnJson(spawns, set.getKey(), form.getFormName(), pokemon.getSpawnData());
                }
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + GravelmonUtils.getCleanName(set.getKey()) + ".json"));
        writer.write(gson.toJson(spawnPool));
        writer.close();
    }
}
