package drai.dev.gravelmon.jsonwriters;

import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
import java.nio.file.*;

public class SpeciesAssetsJSONWriter {


    public static void writeSpecies(Game game, String resourcesDir){
        String dir = resourcesDir+"\\assets\\cobblemon\\bedrock\\species\\"+game.getName().toLowerCase()+"\\";

        game.getPokemon().forEach(pokemon -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writePokemon(pokemon, game,dir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void writePokemon(Pokemon pokemon, Game game, String dir) throws IOException {

        if(pokemon.isNew()&&!pokemon.isModeled()) {
            String fileContents =
                    "{\n  \"species\": \"cobblemon:" + pokemon.getCleanName() + "\",\n" +
                            "  \"order\": 0,\n" +
                            "  \"variations\": [\n" +
                            "    {\n" +
                            "      \"aspects\": [],\n" +
                            "      \"poser\": \"cobblemon:" + game.getName().toLowerCase() + "_" + pokemon.getCleanName() + "\",\n" +
                            "      \"model\": \"cobblemon:cutout_gravelmon.geo\",\n" +
                            "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + ".png\",\n" +
                            "      \"layers\": []\n" +
                            "    },\n" +
                            "    {\n" +
                            "      \"aspects\": [\n" +
                            "        \"shiny\"\n" +
                            "      ],\n" +
                            "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_shiny.png\"\n" +
                            "    }";
            if (pokemon.hasGenderDifferences()) {
                fileContents += ",\n    {\n" +
                        "      \"aspects\": [\n" +
                        "        \"female\"" +
                        "\n      ],\n" +
                        "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_female.png\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"aspects\": [\n" +
                        "        \"female\",\n" +
                        "        \"shiny\"\n" +
                        "      ],\n" +
                        "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_female_shiny.png\"\n" +
                        "    }\n";
                createPlaceholderTextureIfNotExists(game.getName().toLowerCase() + "\\" + pokemon.getCleanName() + "_female.png");
                createPlaceholderTextureIfNotExists(game.getName().toLowerCase() + "\\" + pokemon.getCleanName() + "_female_shiny.png");
            }
                fileContents += "  ]\n" +
                        "}";
                BufferedWriter writer = new BufferedWriter(new FileWriter(dir + "0_" + pokemon.getCleanName() + "_base.json"));
                writer.write(fileContents);
                writer.close();
                createPlaceholderTextureIfNotExists(game.getName().toLowerCase() + "\\" + pokemon.getCleanName() + ".png");
                createPlaceholderTextureIfNotExists(game.getName().toLowerCase() + "\\" + pokemon.getCleanName() + "_shiny.png");

        }
        int formCounter = 10;
            for (PokemonForm form : pokemon.getForms()) {
                if(!pokemon.isModeled()){
                    String fileContents =
                            "{\n  \"species\": \"cobblemon:" + pokemon.getCleanName() + "\",\n" +
                                    "  \"order\": "+formCounter+",\n" +
                                    "  \"variations\": [\n" +
                                    "    {\n" +
                                    "      \"aspects\": [\n";
                    boolean isFirstAspect = true;
                    for (Aspect aspect : form.getAspects()){
                        if(isFirstAspect){
                            isFirstAspect = false;
                        } else {
                            fileContents += ",\n";
                        }
                        fileContents += "        \""+aspect.name().toLowerCase()+"\"";
                    }
                    fileContents += "\n     ],\n";
                    if(form.hasSeparateModel()){
                        fileContents += "      \"poser\": \"cobblemon:"+game.getName().toLowerCase()+"/"+form.getCleanName()+"_"+pokemon.getCleanName()+"\",\n";
                    } else {
                        fileContents +="      \"poser\": \"cobblemon:" + game.getName().toLowerCase() + "_" + pokemon.getCleanName() + "\",\n";
                    }

                    fileContents += "      \"model\": \"cobblemon:cutout_gravelmon.geo\",\n" +
                            "      \"texture\": \"cobblemon:textures/pokemon/"+game.getName().toLowerCase()+"/"+form.getCleanName()+"_"+pokemon.getCleanName()+".png\",\n" +
                            "      \"layers\": []\n" +
                            "    },\n" +
                            "    {\n" +
                            "      \"aspects\": [\n";
                    for (Aspect aspect : form.getAspects()){
                        fileContents += "        \""+aspect.name().toLowerCase()+"\",\n";
                    }
                    fileContents += "        \"shiny\"\n" +
                            "      ],\n" +
                            "      \"texture\": \"cobblemon:textures/pokemon/"+game.getName().toLowerCase()+"/"+form.getCleanName()+"_"+pokemon.getCleanName()+"_shiny.png\"\n" +
                            "    }";
                    if (pokemon.hasGenderDifferences()) {
                        fileContents += ",\n    {\n" +
                                "      \"aspects\": [\n";
                        for (Aspect aspect : form.getAspects()){
                            fileContents += "        \""+aspect.name().toLowerCase()+"\",\n";
                        }
                        fileContents += "        \"female\"" +
                                "\n      ],\n" +
                                "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_female.png\"\n" +
                                "    },\n" +
                                "    {\n" +
                                "      \"aspects\": [\n";
                        for (Aspect aspect : form.getAspects()){
                            fileContents += "        \""+aspect.name().toLowerCase()+"\",\n";
                        }
                        fileContents += "        \"female\",\n" +
                                "        \"shiny\"\n" +
                                "      ],\n" +
                                "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_female_shiny.png\"\n" +
                                "    }\n";
                        createPlaceholderTextureIfNotExists(game.getName().toLowerCase() + "\\" +form.getCleanName()+"_"+ pokemon.getCleanName() + "_female.png");
                        createPlaceholderTextureIfNotExists(game.getName().toLowerCase() + "\\" +form.getCleanName()+"_"+ pokemon.getCleanName() + "_female_shiny.png");
                    }

                    fileContents += "  ]\n" +
                            "}";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(dir + formCounter+"_" + pokemon.getCleanName() + "_"+form.getCleanName()+".json"));
                    writer.write(fileContents);
                    writer.close();
                    createPlaceholderTextureIfNotExists(game.getName().toLowerCase()+"\\"+form.getCleanName()+"_"+pokemon.getCleanName()+".png");
                    createPlaceholderTextureIfNotExists(game.getName().toLowerCase()+"\\"+form.getCleanName()+"_"+pokemon.getCleanName()+"_shiny.png");
                }
            }
        }




    private static void createPlaceholderTextureIfNotExists(String filename) {
        String textureDir = "C:\\Users\\Stijn\\Desktop\\Gravelmon\\packaging\\assets\\cobblemon\\textures\\pokemon\\";
        File textureLocation = new File(textureDir+filename);
        if(!textureLocation.exists()){
            BufferedImage placeholder = new BufferedImage(128,128,3);
            try {
                ImageIO.write(placeholder, "png",textureLocation);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
