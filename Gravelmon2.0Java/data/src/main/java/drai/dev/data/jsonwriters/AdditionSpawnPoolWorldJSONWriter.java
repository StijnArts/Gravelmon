package drai.dev.data.jsonwriters;

import drai.dev.data.games.registry.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

import static drai.dev.data.pokemon.Pokemon.ADDITIONAL_FORMS;
import static drai.dev.data.pokemon.Pokemon.getKeysByValue;

public class AdditionSpawnPoolWorldJSONWriter {

    public static void writeSpawns(String resourcesDir){
        String dir = resourcesDir+"\\data\\gravelmon\\spawn_pool_world\\";
        Pokemon.ADDITIONAL_FORMS.entrySet().forEach(set -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writeSpawn(set, dir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private synchronized static void writeSpawn(Map.Entry<String, List<Pokemon>> set, String dir) throws IOException {
        String fileContents = "{\n" +
                "  \"enabled\": true,\n" +
                "  \"neededInstalledMods\": [],\n" +
                "  \"neededUninstalledMods\": [],\n" +
                "  \"spawns\": [\n";
        if(!set.getValue().isEmpty()){
            var isFirstForm = true;
            for(Pokemon pokemon : set.getValue()){
                if(isFirstForm){
                    isFirstForm = false;
                } else {
                    fileContents += ",\n";
                }
                fileContents +=         "    {\n" +
                        "      \"id\": \""+pokemon.getCleanName()+"-1\",\n" +
                        "      \"pokemon\": \""+ Pokemon.getKeysByValue(Pokemon.ADDITIONAL_FORMS, pokemon).stream().findFirst().get() +
                        " "+pokemon.getAdditionalAspect().name().toLowerCase()+"\",\n" +
                        "      \"presets\": [\n          ";

            boolean isFirstSpawnPreset = true;
            for(SpawnPreset spawnPreset : pokemon.getSpawnPresets()){
                if(isFirstSpawnPreset){
                    isFirstSpawnPreset=false;
                } else {
                    fileContents+=",\n          ";
                }
                fileContents +="\""+spawnPreset.getName().toLowerCase()+"\"";
            }
            fileContents +="\n      ],\n" +
                    "      \"type\": \"pokemon\",\n" +
                    "      \"context\": \""+pokemon.getSpawnContext().getName()+"\",\n" +
                    "      \"bucket\": \""+pokemon.getSpawnPool().getName()+"\",\n" +
                    "      \"level\": \""+pokemon.getMinSpawnLevel()+"-"+pokemon.getMaxSpawnLevel()+"\",\n" +
                    "      \"weight\": "+pokemon.getSpawnWeight()+",\n" +
                    "      \"condition\": {\n";
            boolean isFirstSpawnCondition = true;
            for (SpawnCondition spawnCondition : pokemon.getSpawnConditions()) {
                if(isFirstSpawnCondition){
                    isFirstSpawnCondition = false;
                } else {
                    fileContents+=",\n";
                }
                fileContents = conditionsToString(fileContents, spawnCondition);

            }
            if(pokemon.getSpawnAntiConditions().isEmpty()){
                fileContents+="\n      }\n";
            } else {
                fileContents+="\n      },\n" +
                        "      \"anticondition\": {\n";
                for (SpawnCondition spawnCondition : pokemon.getSpawnAntiConditions()) {
                    fileContents = conditionsToString(fileContents, spawnCondition);
                }
                fileContents+= "    }\n";
            }
            fileContents+="    }\n";



            /*if(pokemon.isModeled()){
                String modelledDir = "C:\\Users\\Stijn\\Desktop\\Gravelmon\\packaging\\model release\\data\\cobblemon\\spawn_pool_world\\";
                BufferedWriter writerModeled = new BufferedWriter(new FileWriter(modelledDir+pokemon.getCleanName()+".json"));
                writerModeled.write(fileContents);
                writerModeled.close();
            }*/
        for (PokemonForm form :pokemon.getForms()) {
            if (!form.isBattleOnly()) {
                fileContents +=
                        "    {\n" +
                                "      \"id\": \"" + form.getCleanName() + "_" + pokemon.getCleanName() + "-1\",\n" +
                                "      \"pokemon\": \""+ Pokemon.getKeysByValue(Pokemon.ADDITIONAL_FORMS, pokemon).stream().findFirst()+
                                " "+pokemon.getAdditionalAspect().name().toLowerCase()+"\",\n" +
                                "      \"presets\": [ ";
                boolean isFirstFormSpawnPreset = true;
                for (SpawnPreset spawnPreset : form.getSpawnPresets()) {
                    if (isFirstFormSpawnPreset) {
                        isFirstFormSpawnPreset = false;
                    } else {
                        fileContents += ",\n          ";
                    }
                    fileContents += "\"" + spawnPreset.getName().toLowerCase() + "\"";
                }

                fileContents += "],\n" +
                        "      \"type\": \"pokemon\",\n" +
                        "      \"context\": \"" + form.getSpawnContext().name().toLowerCase() + "\",\n" +
                        "      \"bucket\": \"" + form.getSpawnPool().getName() + "\",\n" +
                        "      \"level\": \"" + form.getMinSpawnLevel() + "-" + form.getMaxSpawnLevel() + "\",\n" +
                        "      \"weight\": " + form.getSpawnWeight() + ",\n" +
                        "      \"condition\": {\n";
                boolean isFirstFormSpawnCondition = true;
                for (SpawnCondition spawnCondition : form.getSpawnConditions()) {
                    if (isFirstFormSpawnCondition) {
                        isFirstFormSpawnCondition = false;
                    } else {
                        fileContents += ",\n";
                    }
                    fileContents = conditionsToString(fileContents, spawnCondition);

                }
                if (form.getSpawnAntiConditions().isEmpty()) {
                    fileContents += "\n      }\n";
                } else {
                    fileContents += "\n      },\n" +
                            "      \"anticondition\": {\n";
                    for (SpawnCondition spawnCondition : form.getSpawnAntiConditions()) {
                        fileContents = conditionsToString(fileContents, spawnCondition);
                    }
                    fileContents += "    }\n";
                }
                fileContents += "    }\n";
            }
        }
        }
            }
        fileContents += "\n]\n}";
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir+ GravelmonUtils.getCleanName(set.getKey())+".json"));
        writer.write(fileContents);
        writer.close();
    }

    private static String conditionsToString(String fileContents, SpawnCondition spawnCondition) {
        if(spawnCondition instanceof BiomeSpawnCondition){
            fileContents+="\""+spawnCondition.getConditionKind().getName()+"\": [ ";
            boolean isFirstBiomeCondition = true;
            for(Biome biome:((BiomeSpawnCondition) spawnCondition).getBiomes()){
                if(isFirstBiomeCondition){
                    isFirstBiomeCondition = false;
                } else {
                    fileContents += ",\n";
                }
                fileContents += "\""+biome.getId()+":"+biome.getName()+"\"";
            }
            fileContents+=" ]";
        } else {
            if(spawnCondition.getConditionKind().getValueType().equals("boolean")){
                fileContents+="        \""+spawnCondition.getConditionKind().getName()+"\": "+spawnCondition.getCondition();
            } else{
                fileContents+="        \""+spawnCondition.getConditionKind().getName()+"\": \""+spawnCondition.getCondition()+"\"";
            }

        }
        return fileContents;
    }
}
