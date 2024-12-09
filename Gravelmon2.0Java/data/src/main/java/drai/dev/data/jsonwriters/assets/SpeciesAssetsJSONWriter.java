package drai.dev.data.jsonwriters.assets;

import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.attributes.*;
import org.jetbrains.annotations.*;

import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SpeciesAssetsJSONWriter {

    public static void writeSpecies(Game game, String resourcesDir) {
        String dir = getDirectory(game, resourcesDir);
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

        game.getNewPokemon().forEach(pokemon -> {
            if (!Pokemon.isAnAdditionalForm(pokemon)) {
                try {
                    Files.createDirectories(new File(dir).toPath());
                    writePokemon(pokemon, dir, gson);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public static @NotNull String getDirectory(Game game, String resourcesDir) {
        return resourcesDir + "\\assets\\cobblemon\\bedrock\\species\\" + game.getName().toLowerCase() + "\\";
    }

    private static void writePokemon(Pokemon pokemon, String dir, Gson gson) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + "0_" + pokemon.getCleanName() + "_base.json"));
        writer.write(gson.toJson(pokemon.getSpeciesFileData().toJsonObject(pokemon.getCleanName(), 0, List.of(), pokemon)));
        writer.close();
        /*if (pokemon.isNew() && !pokemon.isModeled()) {
            JsonObject fileContents = new JsonObject();
            fileContents.add("species", new JsonPrimitive("cobblemon:" + pokemon.getCleanName()));
            fileContents.add("order", new JsonPrimitive(0));
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
            regularVariation.add("poser", new JsonPrimitive( isReplacement ? "cobblemon:replacement_poser" : "cobblemon:"+game.getName().toLowerCase()+"_"+pokemon.getCleanName().toLowerCase()));
            regularVariation.add("texture", new JsonPrimitive(isReplacement ? "cobblemon:textures/pokemon/evolve_me.png" : "cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + ".png"));
            shinyVariation.add("texture", new JsonPrimitive(isReplacement ? "cobblemon:textures/pokemon/evolve_me.png" : "cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + ".png"));
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

                regularFemaleVariation.add("texture", new JsonPrimitive(isReplacement ? "cobblemon:textures/pokemon/evolve_me.png" : "cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_female.png"));
                shinyFemaleVariation.add("texture", new JsonPrimitive(isReplacement ? "cobblemon:textures/pokemon/evolve_me.png" : "cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + "_female.png"));
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(dir + "0_" + pokemon.getCleanName() + "_base.json"));
            writer.write(gson.toJson(fileContents));
            writer.close();
        }*/
        int formCounter = 10;
        for (PokemonForm form : pokemon.getForms()) {
            var aspects = new ArrayList<String>();
            for (Aspect aspect : form.getAspects()) {
                aspects.add(aspect.name().toLowerCase());
            }
            BufferedWriter formWriter = new BufferedWriter(new FileWriter(dir + formCounter + "_" + pokemon.getCleanName() + "_" + form.getCleanName() + ".json"));
            formWriter.write(gson.toJson(form.getSpeciesFileData().toJsonObject("cobblemon:" + pokemon.getCleanName(), formCounter, aspects, form)));
            formWriter.close();
        }
        /*
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
                regularVariation.add("texture", new JsonPrimitive(isReplacement ? "cobblemon:textures/pokemon/evolve_me.png" : "cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + ".png"));
                shinyVariation.add("texture", new JsonPrimitive(isReplacement ? "cobblemon:textures/pokemon/evolve_me.png" : "cobblemon:textures/pokemon/" + game.getName().toLowerCase() + "/" + pokemon.getCleanName() + ".png"));
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
                }

                BufferedWriter writer = new BufferedWriter(new FileWriter(dir + formCounter + "_" + pokemon.getCleanName() + "_" + form.getCleanName() + ".json"));
                writer.write(gson.toJson(fileContents));
                writer.close();
            }
        }*/
    }
}
