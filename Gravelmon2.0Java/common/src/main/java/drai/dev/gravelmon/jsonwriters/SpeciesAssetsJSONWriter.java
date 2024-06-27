package drai.dev.gravelmon.jsonwriters;

import com.google.gson.*;
import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
import java.nio.file.*;

public class SpeciesAssetsJSONWriter {

    public static void writeSpecies(Game game, String resourcesDir) {
        String dir = resourcesDir + "\\assets\\cobblemon\\bedrock\\species\\" + game.getName().toLowerCase() + "\\";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        game.getPokemon().forEach(pokemon -> {
            if (!Pokemon.isAnAdditionalForm(pokemon)) {
                try {
                    Files.createDirectories(new File(dir).toPath());
                    writePokemon(pokemon, game, dir, resourcesDir, gson);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    private static void writePokemon(Pokemon pokemon, Game game, String dir, String resourcesDir, Gson gson) throws IOException {
        if (pokemon.isNew() && !pokemon.isModeled()) {
            JsonObject fileContents = new JsonObject();
            fileContents.add("species", new JsonPrimitive("cobblemon:" + pokemon.getCleanName()));
            fileContents.add("order", new JsonPrimitive(1));
            var variations = new JsonArray();
            fileContents.add("variations", variations);
            JsonObject regularVariation = new JsonObject();
            JsonObject shinyVariation = new JsonObject();

            variations.add(regularVariation);
            variations.add(shinyVariation);

            var regularAspects = new JsonArray();
            var shinyAspects = new JsonArray();
            shinyAspects.add("shiny");
            regularVariation.add("aspects", regularAspects);
            shinyVariation.add("aspects", shinyAspects);
            regularVariation.add("model", new JsonPrimitive("cobblemon:cutout_gravelmon.geo"));
            regularVariation.add("poser", new JsonPrimitive("cobblemon:"+game.getName().toLowerCase()+"_"+pokemon.getCleanName().toLowerCase()));
            regularVariation.add("texture", new JsonPrimitive("cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + ".png"));
            shinyVariation.add("texture", new JsonPrimitive("cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_shiny.png"));
            regularVariation.add("layers", new JsonArray(0));
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
                shinyFemaleAspects.add("female");
                shinyFemaleAspects.add("shiny");
                createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), pokemon.getCleanName() + "_female.png", resourcesDir);
                createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), pokemon.getCleanName() + "_female_shiny.png", resourcesDir);
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(dir + "0_" + pokemon.getCleanName() + "_base.json"));
            writer.write(gson.toJson(fileContents));
            writer.close();
            createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), pokemon.getCleanName() + ".png", resourcesDir);
            createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), pokemon.getCleanName() + "_shiny.png", resourcesDir);

        }
        int formCounter = 10;
        for (PokemonForm form : pokemon.getForms()) {
            if (!pokemon.isModeled()) {
                JsonObject fileContents = new JsonObject();
                fileContents.add("species", new JsonPrimitive("cobblemon:" + pokemon.getCleanName()));
                fileContents.add("order", new JsonPrimitive(formCounter));
                formCounter++;
                var variations = new JsonArray();
                fileContents.add("variations", variations);
                JsonObject regularVariation = new JsonObject();
                JsonObject shinyVariation = new JsonObject();

                variations.add(regularVariation);
                variations.add(shinyVariation);

                var basicAspects = new JsonArray();
                for (Aspect aspect : form.getAspects()) {
                    basicAspects.add(aspect.name().toLowerCase());
                }
                var regularAspects = basicAspects.deepCopy();
                var shinyAspects = basicAspects.deepCopy();
                shinyAspects.add("shiny");
                regularVariation.add("aspects", regularAspects);
                shinyVariation.add("aspects", shinyAspects);
                regularVariation.add("model", new JsonPrimitive("cobblemon:cutout_gravelmon.geo"));
                regularVariation.add("texture", new JsonPrimitive("cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + ".png"));
                shinyVariation.add("texture", new JsonPrimitive("cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_shiny.png"));
                regularVariation.add("layers", new JsonArray(0));
                if (pokemon.hasGenderDifferences()) {
                    JsonObject regularFemaleVariation = new JsonObject();
                    JsonObject shinyFemaleVariation = new JsonObject();

                    variations.add(regularFemaleVariation);
                    variations.add(shinyFemaleVariation);
                    var regularFemaleAspects = basicAspects.deepCopy();
                    var shinyFemaleAspects = basicAspects.deepCopy();
                    regularFemaleVariation.add("aspects", regularFemaleAspects);
                    shinyFemaleVariation.add("aspects", shinyFemaleAspects);
                    regularFemaleAspects.add("female");
                    shinyFemaleAspects.add("female");
                    shinyFemaleAspects.add("shiny");
                    createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), form.getCleanName() + "_" + pokemon.getCleanName() + "_female.png", resourcesDir);
                    createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), form.getCleanName() + "_" + pokemon.getCleanName() + "_female_shiny.png", resourcesDir);
                }

                BufferedWriter writer = new BufferedWriter(new FileWriter(dir + formCounter + "_" + pokemon.getCleanName() + "_" + form.getCleanName() + ".json"));
                writer.write(gson.toJson(fileContents));
                writer.close();
                createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), form.getCleanName() + "_" + pokemon.getCleanName() + ".png", resourcesDir);
                createPlaceholderTextureIfNotExists(game.getName().toLowerCase(), form.getCleanName() + "_" + pokemon.getCleanName() + "_shiny.png", resourcesDir);
            }
        }
    }

    public static void createPlaceholderTextureIfNotExists(String game, String filename, String resourcesDir) {
        String textureDir = resourcesDir + "\\assets\\cobblemon\\textures\\pokemon\\";
        File textureLocation = new File(textureDir + game + "\\" + filename);

        if (!textureLocation.exists()) {
            BufferedImage placeholder = new BufferedImage(96, 96, 3);
            try {
                Files.createDirectories(new File(textureDir + game).toPath());
                ImageIO.write(placeholder, "png", textureLocation);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
