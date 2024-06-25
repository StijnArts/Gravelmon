package drai.dev.gravelmon.jsonwriters;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

import static drai.dev.gravelmon.jsonwriters.SpeciesAssetsJSONWriter.createPlaceholderTextureIfNotExists;

public class AdditionalFormAssetsJSONWriter {

    public static void writeSpecies(String resourcesDir){
        String dir = resourcesDir+"\\assets\\gravelmon\\bedrock\\species\\additional_forms";
        Pokemon.ADDITIONAL_FORMS.entrySet().forEach(set -> {
                try {
                    Files.createDirectories(new File(dir).toPath());
                    writePokemon(set, dir, resourcesDir);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

        });
    }

    private static void writePokemon(Map.Entry<String, List<Pokemon>> set, String dir, String resourcesDir) throws IOException {
        if (!set.getValue().isEmpty()) {
            String fileContents =
                    "{\n  \"species\": \"cobblemon:" + Pokemon.getCleanName(set.getKey()) + "\",\n" +
                            "  \"order\": 1,\n";
            var isFirstForm = true;
            int formCounter = 10;
            for (Pokemon pokemon : set.getValue()) {
                formCounter++;
                fileContents += "  \"variations\": [\n";
                if (isFirstForm) {
                    isFirstForm = false;
                } else {
                    fileContents += ",\n";
                }
                if (pokemon.isNew() && !pokemon.isModeled()) {
                    var game = pokemon.getGame();
                    fileContents +=
                            "    {\n" +
                                    "      \"aspects\": [\n";
                    fileContents += "        \"" + pokemon.getAdditionalAspect().name().toLowerCase() + "\"";
                    fileContents += "\n     ],\n";
                    fileContents += "      \"model\": \"cobblemon:cutout_gravelmon.geo\",\n" +
                            "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + ".png\",\n" +
                            "      \"layers\": []\n" +
                            "    },\n" +
                            "    {\n" +
                            "      \"aspects\": [\n";
                    fileContents += "        \"" + pokemon.getAdditionalAspect().name().toLowerCase() + ",\"";
                    fileContents += "        \"shiny\"\n" +
                            "      ],\n" +
                            "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_shiny.png\"\n" +
                            "    }";
                    if (pokemon.hasGenderDifferences()) {
                        fileContents += ",\n    {\n" +
                                "      \"aspects\": [\n";
                        fileContents += "        \"" + pokemon.getAdditionalAspect().name().toLowerCase() + ",\"";
                        fileContents += "        \"female\"" +
                                "\n      ],\n" +
                                "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_female.png\"\n" +
                                "    },\n" +
                                "    {\n" +
                                "      \"aspects\": [\n";
                        fileContents += "        \"" + pokemon.getAdditionalAspect().name().toLowerCase() + ",\"";
                        fileContents += "        \"female\",\n" +
                                "        \"shiny\"\n" +
                                "      ],\n" +
                                "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_female_shiny.png\"\n" +
                                "    }\n";

                    }
                    for (PokemonForm form : pokemon.getForms()) {
                        if (!pokemon.isModeled()) {

                            fileContents += "    {\n" +
                                    "      \"aspects\": [\n";
                            boolean isFirstFormAspect = true;
                            for (Aspect aspect : form.getAspects()) {
                                if (isFirstFormAspect) {
                                    isFirstFormAspect = false;
                                } else {
                                    fileContents += ",\n";
                                }
                                fileContents += "        \"" + aspect.name().toLowerCase() + "\"";
                            }
                            fileContents += "        \"" + pokemon.getAdditionalAspect().name().toLowerCase() + "\"";
                            fileContents += "\n     ],\n";
                            if (form.hasSeparateModel()) {
                                fileContents += "      \"poser\": \"cobblemon:" + game.getName().toLowerCase() + "/" + form.getCleanName() + "_" + pokemon.getCleanName() + "\",\n";
                            } else {
                                fileContents += "      \"poser\": \"cobblemon:" + game.getName().toLowerCase() + "_" + pokemon.getCleanName() + "\",\n";
                            }

                            fileContents += "      \"model\": \"cobblemon:cutout_gravelmon.geo\",\n" +
                                    "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + form.getCleanName() + "_" + pokemon.getCleanName() + ".png\",\n" +
                                    "      \"layers\": []\n" +
                                    "    },\n" +
                                    "    {\n" +
                                    "      \"aspects\": [\n";
                            for (Aspect aspect : form.getAspects()) {
                                fileContents += "        \"" + aspect.name().toLowerCase() + "\",\n";
                            }
                            fileContents += "        \"shiny\"\n" +
                                    "      ],\n" +
                                    "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + form.getCleanName() + "_" + pokemon.getCleanName() + "_shiny.png\"\n" +
                                    "    }";
                            if (pokemon.hasGenderDifferences()) {
                                fileContents += ",\n    {\n" +
                                        "      \"aspects\": [\n";
                                for (Aspect aspect : form.getAspects()) {
                                    fileContents += "        \"" + aspect.name().toLowerCase() + "\",\n";
                                }
                                fileContents += "        \"female\"" +
                                        "\n      ],\n" +
                                        "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + form.getCleanName() + "_"+ pokemon.getCleanName() + "_female.png\"\n" +
                                        "    },\n" +
                                        "    {\n" +
                                        "      \"aspects\": [\n";
                                for (Aspect aspect : form.getAspects()) {
                                    fileContents += "        \"" + aspect.name().toLowerCase() + "\",\n";
                                }
                                fileContents += "        \"female\",\n" +
                                        "        \"shiny\"\n" +
                                        "      ],\n" +
                                        "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + form.getCleanName() + "_"+ pokemon.getCleanName() + "_female_shiny.png\"\n" +
                                        "    }\n";
                                createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), form.getCleanName() + "_" + pokemon.getCleanName() + "_female.png", resourcesDir);
                                createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), form.getCleanName() + "_" + pokemon.getCleanName() + "_female_shiny.png", resourcesDir);
                            }

                            fileContents += "  ]\n" +
                                    "}";
                            BufferedWriter writer = new BufferedWriter(new FileWriter(dir + formCounter + "_" + pokemon.getCleanName() + "_" + pokemon.getAdditionalAspect() + "_" + form.getCleanName() + ".json"));
                            writer.write(fileContents);
                            writer.close();
                            createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), form.getCleanName() + "_" + pokemon.getCleanName() + ".png", resourcesDir);
                            createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), form.getCleanName() + "_" + pokemon.getCleanName() + "_shiny.png", resourcesDir);
                        }
                    }

                    BufferedWriter writer = new BufferedWriter(new FileWriter(dir + formCounter + "_" + pokemon.getCleanName() + "_" + pokemon.getAdditionalAspect() + ".json"));
                    writer.write(fileContents);
                    writer.close();
                    createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), pokemon.getCleanName() + ".png", resourcesDir);
                    createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), pokemon.getCleanName() + "_shiny.png", resourcesDir);
                }
            }
        }
    }
}
