package drai.dev.data.jsonwriters;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.io.*;
import java.nio.file.*;

public class PoserJSONWriter {
    public static void writeSpecies(Game game, String resourcesDir){
        String dir = resourcesDir+"\\assets\\cobblemon\\bedrock\\pokemon\\posers\\";
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
                    "  \"portraitScale\": 0.165,\n" +
                    "  \"portraitTranslation\": [0.0, 1.4, 0.0],\n" +
                    "  \"profileScale\": 0.22,\n" +
                    "  \"profileTranslation\": [0.0, 1.55, -20.0],\n" +
                    "  \"poses\": {\n" +
                    "    \"profile\": {\n" +
                    "      \"poseName\": \"profile\",\n" +
                    "      \"poseTypes\": [\"PROFILE\"],\n" +
                    "      \"transformTicks\": 10,\n" +
                    "      \"animations\": [\"bedrock(cutout, pc_fix)\"]\n" +
                    "    },\n" +
                    "    \"portrait\": {\n" +
                    "      \"poseName\": \"portrait\",\n" +
                    "      \"poseTypes\": [\"NONE\",\"PORTRAIT\"],\n" +
                    "      \"transformTicks\": 10,\n" +
                    "      \"animations\": [\"bedrock(cutout, summary_fix)\"]\n" +
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
