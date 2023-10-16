package com.gravelmon.common.gravelmon.jsonwriters;

import com.gravelmon.common.gravelmon.games.*;
import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;

import java.io.*;
import java.nio.file.*;

public class PoserJSONWriter {
    public static void writeSpecies(Game game){
        String dir = "C:\\Users\\Stijn\\Desktop\\Gravelmon\\packaging\\assets\\cobblemon\\bedrock\\pokemon\\posers\\";
        game.getPokemon().forEach(pokemon -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writePokemon(pokemon, game, dir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void writePokemon(Pokemon pokemon, Game game, String dir) throws IOException {
        if(pokemon.isNew()&&!pokemon.isModeled()) {
            String fileContents = "{\n" +
                    "  \"portraitScale\": " + pokemon.getPortraitScale() + ",\n" +
                    "  \"portraitTranslation\": [" + pokemon.getPortraitTranslationX() + ", " + pokemon.getPortraitTranslationY() + ", " + pokemon.getPortraitTranslationZ() + "],\n" +
                    "  \"profileScale\": " + pokemon.getPortraitScale() + ",\n" +
                    "  \"profileTranslation\": [" + pokemon.getPortraitTranslationX() + ", " + pokemon.getPortraitTranslationY() + ", " + pokemon.getPortraitTranslationZ() + "],\n" +
                    "  \"poses\": {\n" +
                    "    \"standing\": {\n" +
                    "      \"poseName\": \"standing\",\n" +
                    "      \"transformTicks\": 10,\n" +
                    "      \"allPoseTypes\": true,\n" +
                    "      \"animations\": []\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
            BufferedWriter writer = new BufferedWriter(new FileWriter(dir + game.getName().toLowerCase() + "_" + pokemon.getCleanName() + ".json"));
            writer.write(fileContents);
            writer.close();
        }
        for(PokemonForm form: pokemon.getForms()){
            if(!pokemon.isModeled()){
                String formFileContents = "{\n" +
                        "  \"portraitScale\": "+form.getPortraitScale()+",\n" +
                        "  \"portraitTranslation\": ["+form.getPortraitTranslationX()+", "+form.getPortraitTranslationY()+", "+form.getPortraitTranslationZ()+"],\n" +
                        "  \"profileScale\": "+form.getPortraitScale()+",\n" +
                        "  \"profileTranslation\": ["+form.getPortraitTranslationX()+", "+form.getPortraitTranslationY()+", "+form.getPortraitTranslationZ()+"],\n" +
                        "  \"poses\": {\n" +
                        "    \"standing\": {\n" +
                        "      \"poseName\": \"standing\",\n" +
                        "      \"transformTicks\": 10,\n" +
                        "      \"allPoseTypes\": true,\n" +
                        "      \"animations\": []\n" +
                        "    }\n" +
                        "  }\n" +
                        "}";
                BufferedWriter formWriter = new BufferedWriter(new FileWriter(dir+game.getName().toLowerCase()+"_"+form.getCleanName()+"_"+pokemon.getCleanName()+".json"));
                formWriter.write(formFileContents);
                formWriter.close();
            }

        }

    }
}
