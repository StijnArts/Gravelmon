package drai.dev.data.jsonwriters;


import com.google.gson.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

import static drai.dev.data.jsonwriters.SpeciesAssetsJSONWriter.createPlaceholderTextureIfNotExists;


public class AdditionalFormAssetsJSONWriter {

    public static void writeSpecies(String resourcesDir) {
        String dir = resourcesDir + "\\assets\\cobblemon\\bedrock\\species\\additional_forms\\";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Pokemon.ADDITIONAL_FORMS.entrySet().forEach(set -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writePokemon(set, dir, resourcesDir, gson);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
    }

    private synchronized static void writePokemon(Map.Entry<String, List<Pokemon>> set, String dir, String resourcesDir, Gson gson) throws IOException {
        if (!set.getValue().isEmpty()) {
            int formCounter = 10;

            for (Pokemon pokemon : set.getValue()) {
                if (pokemon.isNew() && !pokemon.isModeled()) {
                    int order = formCounter + java.util.Arrays.asList(Aspect.values()).indexOf(pokemon.getAdditionalAspect());
                    JsonObject fileContents = new JsonObject();
                    fileContents.add("species", new JsonPrimitive("cobblemon:" + GravelmonUtils.getCleanName(set.getKey())));
                    fileContents.add("order", new JsonPrimitive(3));
                    var variations = new JsonArray();
                    fileContents.add("variations", variations);
                    JsonObject regularVariation = new JsonObject();
                    JsonObject shinyVariation = new JsonObject();

                    variations.add(regularVariation);
                    variations.add(shinyVariation);

                    var game = pokemon.getGame();
                    var regularAspects = new JsonArray();
                    var shinyAspects = new JsonArray();
                    var aspect = pokemon.getAdditionalAspect().getName();
                    if(pokemon.getName().endsWith("One")) {
                        aspect += "two";
                        SpeciesFeaturesJSONWriter.writeFeature(aspect, resourcesDir);
                    }
                    if(pokemon.getName().endsWith("Two")) {
                        aspect += "three";
                        SpeciesFeaturesJSONWriter.writeFeature(aspect, resourcesDir);
                    }
                    regularAspects.add(aspect);
                    shinyAspects.add(aspect);
                    shinyAspects.add("shiny");
                    regularVariation.add("aspects", regularAspects);
                    shinyVariation.add("aspects", shinyAspects);
                    regularVariation.add("model", new JsonPrimitive("cobblemon:cutout_gravelmon.geo"));
                    shinyVariation.add("model", new JsonPrimitive("cobblemon:cutout_gravelmon.geo"));
                    regularVariation.add("poser", new JsonPrimitive("cobblemon:"+game.getName().toLowerCase()+"_"+pokemon.getCleanName()));
                    shinyVariation.add("poser", new JsonPrimitive("cobblemon:"+game.getName().toLowerCase()+"_"+pokemon.getCleanName()));
                    regularVariation.add("texture", new JsonPrimitive("cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + ".png"));
                    shinyVariation.add("texture", new JsonPrimitive("cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_shiny.png"));

                    var layers = new JsonArray();
                    var glow = new JsonObject();
                    var flame = new JsonObject();
                    var tail = new JsonObject();
                    var emissive = new JsonObject();
                    var emissive2 = new JsonObject();
                    var transparentEmissive = new JsonObject();
                    glow.add("name", new JsonPrimitive("glow"));
                    flame.add("name", new JsonPrimitive("flame"));
                    tail.add("name", new JsonPrimitive("tail"));
                    emissive.add("name", new JsonPrimitive("emissive"));
                    emissive2.add("name", new JsonPrimitive("emissive2"));
                    transparentEmissive.add("name", new JsonPrimitive("emissive2"));
                    layers.add(glow);
                    layers.add(emissive2);
                    layers.add(emissive);
                    layers.add(transparentEmissive);
                    layers.add(flame);
                    layers.add(tail);

                    regularVariation.add("layers", layers);
                    shinyVariation.add("layers", layers);
                    if (pokemon.hasGenderDifferences()) {
                        JsonObject regularFemaleVariation = new JsonObject();
                        JsonObject shinyFemaleVariation = new JsonObject();

                        variations.add(regularFemaleVariation);
                        variations.add(shinyFemaleVariation);
                        var regularFemaleAspects = new JsonArray();
                        var shinyFemaleAspects = new JsonArray();
                        regularFemaleVariation.add("aspects", regularFemaleAspects);
                        shinyFemaleVariation.add("aspects", shinyFemaleAspects);
                        regularFemaleAspects.add("female");
                        regularFemaleAspects.add(aspect);
                        shinyFemaleAspects.add("female");
                        shinyFemaleAspects.add(aspect);
                        shinyFemaleAspects.add("shiny");
                        regularFemaleVariation.add("model", new JsonPrimitive("cobblemon:cutout_gravelmon.geo"));
                        shinyFemaleVariation.add("model", new JsonPrimitive("cobblemon:cutout_gravelmon.geo"));
                        regularFemaleVariation.add("poser", new JsonPrimitive("cobblemon:"+game.getName().toLowerCase()+"_"+pokemon.getCleanName()));
                        shinyFemaleVariation.add("poser", new JsonPrimitive("cobblemon:"+game.getName().toLowerCase()+"_"+pokemon.getCleanName()));
                        regularFemaleVariation.add("texture", new JsonPrimitive("cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_female.png"));
                        shinyFemaleVariation.add("texture", new JsonPrimitive("cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_female_shiny.png"));
                        regularFemaleVariation.add("layers", new JsonArray(0));
                        shinyFemaleVariation.add("layers", new JsonArray(0));
                        createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), pokemon.getCleanName() + "_female.png", resourcesDir);
                        createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), pokemon.getCleanName() + "_female_shiny.png", resourcesDir);
                    }
//                    for (PokemonForm form : pokemon.getForms()) {
//                        if (!pokemon.isModeled()) {
//
//                            fileContents += "    {\n" +
//                                    "      \"aspects\": [\n";
//                            boolean isFirstFormAspect = true;
//                            for (Aspect aspect : form.getAspects()) {
//                                if (isFirstFormAspect) {
//                                    isFirstFormAspect = false;
//                                } else {
//                                    fileContents += ",\n";
//                                }
//                                fileContents += "        \"" + aspect.name().toLowerCase() + "\"";
//                            }
//                            fileContents += "        \"" + pokemon.getAdditionalAspect().name().toLowerCase() + "\"";
//                            fileContents += "\n     ],\n";
//                            if (form.hasSeparateModel()) {
//                                fileContents += "      \"poser\": \"cobblemon:" + game.getName().toLowerCase() + "/" + form.getCleanName() + "_" + pokemon.getCleanName() + "\",\n";
//                            } else {
//                                fileContents += "      \"poser\": \"cobblemon:" + game.getName().toLowerCase() + "_" + pokemon.getCleanName() + "\",\n";
//                            }
//
//                            fileContents += "      \"model\": \"cobblemon:cutout_gravelmon.geo\",\n" +
//                                    "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + form.getCleanName() + "_" + pokemon.getCleanName() + ".png\",\n" +
//                                    "      \"layers\": []\n" +
//                                    "    },\n" +
//                                    "    {\n" +
//                                    "      \"aspects\": [\n";
//                            for (Aspect aspect : form.getAspects()) {
//                                fileContents += "        \"" + aspect.name().toLowerCase() + "\",\n";
//                            }
//                            fileContents += "        \"shiny\"\n" +
//                                    "      ],\n" +
//                                    "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + form.getCleanName() + "_" + pokemon.getCleanName() + "_shiny.png\"\n" +
//                                    "    }";
//                            if (pokemon.hasGenderDifferences()) {
//                                fileContents += ",\n    {\n" +
//                                        "      \"aspects\": [\n";
//                                for (Aspect aspect : form.getAspects()) {
//                                    fileContents += "        \"" + aspect.name().toLowerCase() + "\",\n";
//                                }
//                                fileContents += "        \"female\"" +
//                                        "\n      ],\n" +
//                                        "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + form.getCleanName() + "_"+ pokemon.getCleanName() + "_female.png\"\n" +
//                                        "    },\n" +
//                                        "    {\n" +
//                                        "      \"aspects\": [\n";
//                                for (Aspect aspect : form.getAspects()) {
//                                    fileContents += "        \"" + aspect.name().toLowerCase() + "\",\n";
//                                }
//                                fileContents += "        \"female\",\n" +
//                                        "        \"shiny\"\n" +
//                                        "      ],\n" +
//                                        "      \"texture\": \"cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + form.getCleanName() + "_"+ pokemon.getCleanName() + "_female_shiny.png\"\n" +
//                                        "    }\n";
//                                createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), form.getCleanName() + "_" + pokemon.getCleanName() + "_female.png", resourcesDir);
//                                createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), form.getCleanName() + "_" + pokemon.getCleanName() + "_female_shiny.png", resourcesDir);
//
//                            BufferedWriter writer = new BufferedWriter(new FileWriter(dir + formCounter + "_" + pokemon.getCleanName() + "_" + pokemon.getAdditionalAspect().getName() + "_" + form.getCleanName() + ".json"));
//                            writer.write(fileContents.toString());
//                            writer.close();
//                            createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), form.getCleanName() + "_" + pokemon.getCleanName() + ".png", resourcesDir);
//                            createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), form.getCleanName() + "_" + pokemon.getCleanName() + "_shiny.png", resourcesDir);
//                        }
//                    }
                    BufferedWriter writer = new BufferedWriter(new FileWriter(dir + order + "_" + GravelmonUtils.getCleanName(set.getKey()) + "_" + aspect + ".json"));
                    writer.write(gson.toJson(fileContents));
                    writer.close();
                    createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), pokemon.getCleanName() + ".png", resourcesDir);
                    createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), pokemon.getCleanName() + "_shiny.png", resourcesDir);

                }
            }
        }
    }
}
