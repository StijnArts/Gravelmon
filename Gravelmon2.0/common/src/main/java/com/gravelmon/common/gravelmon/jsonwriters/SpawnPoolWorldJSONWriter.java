package com.gravelmon.common.gravelmon.jsonwriters;

import com.gravelmon.common.gravelmon.games.*;
import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.io.*;
import java.nio.file.*;

public class SpawnPoolWorldJSONWriter {

    public static void writeSpawns(Game game){
        String dir = "C:\\Users\\Stijn\\Desktop\\Gravelmon\\packaging\\data\\cobblemon\\spawn_pool_world\\";
        game.getPokemon().forEach(pokemon -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writeSpawn(pokemon, dir, game);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void writeSpawn(Pokemon pokemon, String dir, Game game) throws IOException {
        if(pokemon.isNew()){
            String fileContents = "{\n" +
                    "  \"enabled\": true,\n" +
                    "  \"neededInstalledMods\": [],\n" +
                    "  \"neededUninstalledMods\": [],\n" +
                    "  \"spawns\": [\n" +
                    "    {\n" +
                    "      \"id\": \""+pokemon.getCleanName()+"-1\",\n" +
                    "      \"pokemon\": \""+pokemon.getCleanName()+"\",\n" +
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
            fileContents+="    }\n" +
                    "  ]\n" +
                    "}";

            BufferedWriter writer = new BufferedWriter(new FileWriter(dir+pokemon.getCleanName()+".json"));
            writer.write(fileContents);
            writer.close();
            if(pokemon.isModeled()){
                String modelledDir = "C:\\Users\\Stijn\\Desktop\\Gravelmon\\packaging\\model release\\data\\cobblemon\\spawn_pool_world\\";
                BufferedWriter writerModeled = new BufferedWriter(new FileWriter(modelledDir+pokemon.getCleanName()+".json"));
                writerModeled.write(fileContents);
                writerModeled.close();
            }
        }
        for (PokemonForm form :pokemon.getForms()) {
            if(!form.isBattleOnly()){
                String fileContents = "{\n" +
                        "  \"enabled\": true,\n" +
                        "  \"neededInstalledMods\": [],\n" +
                        "  \"neededUninstalledMods\": [],\n" +
                        "  \"spawns\": [\n" +
                        "    {\n" +
                        "      \"id\": \""+form.getCleanName()+"_"+pokemon.getCleanName()+"-1\",\n" +
                        "      \"pokemon\": \""+pokemon.getCleanName()+" "+form.getCleanName()+"\",\n" +
                        "      \"presets\": [ ";
                boolean isFirstSpawnPreset = true;
                for(SpawnPreset spawnPreset : form.getSpawnPresets()){
                    if(isFirstSpawnPreset){
                        isFirstSpawnPreset=false;
                    } else {
                        fileContents+=",\n          ";
                    }
                    fileContents +="\""+spawnPreset.getName().toLowerCase()+"\"";
                }

                fileContents +="],\n" +
                        "      \"type\": \"pokemon\",\n" +
                        "      \"context\": \""+form.getSpawnContext().name().toLowerCase()+"\",\n" +
                        "      \"bucket\": \""+form.getSpawnPool().getName()+"\",\n" +
                        "      \"level\": \""+form.getMinSpawnLevel()+"-"+form.getMaxSpawnLevel()+"\",\n" +
                        "      \"weight\": "+form.getSpawnWeight()+",\n" +
                        "      \"condition\": {\n";
                boolean isFirstSpawnCondition = true;
                for (SpawnCondition spawnCondition : form.getSpawnConditions()) {
                    if(isFirstSpawnCondition){
                        isFirstSpawnCondition = false;
                    } else {
                        fileContents+=",\n";
                    }
                    fileContents = conditionsToString(fileContents, spawnCondition);

                }
                if(form.getSpawnAntiConditions().isEmpty()){
                    fileContents+="\n      }\n";
                } else {
                    fileContents+="\n      },\n" +
                            "      \"anticondition\": {\n";
                    for (SpawnCondition spawnCondition : form.getSpawnAntiConditions()) {
                        fileContents = conditionsToString(fileContents, spawnCondition);
                    }
                    fileContents+= "    }\n";
                }
                fileContents+="    }\n" +
                        "  ]\n" +
                        "}";

                BufferedWriter writer = new BufferedWriter(new FileWriter(dir+form.getCleanName()+"_"+pokemon.getCleanName()+".json"));
                writer.write(fileContents);
                writer.close();
                if(pokemon.isModeled()){
                    String modelledDir = "C:\\Users\\Stijn\\Desktop\\Gravelmon\\packaging\\model release\\data\\cobblemon\\spawn_pool_world\\";
                    BufferedWriter writerModeled = new BufferedWriter(new FileWriter(modelledDir+pokemon.getCleanName()+".json"));
                    writerModeled.write(fileContents);
                    writerModeled.close();
                }
            }
        }
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
                fileContents += "\"#"+biome.getId()+":"+biome.getName()+"\"";
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
