package drai.dev.data.jsonwriters.assets;

import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import org.jetbrains.annotations.*;

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
        var json = pokemon.getSpeciesFileData().toJsonObject(pokemon.getCleanName(), 0, List.of(), pokemon);

        writer.write(gson.toJson(json));
        writer.close();
        int formCounter = 10;
        for (PokemonForm form : pokemon.getForms()) {
            var aspects = new ArrayList<String>();
            for (Aspect aspect : form.getAspects()) {
                aspects.add(aspect.name().toLowerCase());
            }
            BufferedWriter formWriter = new BufferedWriter(new FileWriter(dir + formCounter + "_" + pokemon.getCleanName() + "_" + form.getCleanName() + ".json"));
            formWriter.write(gson.toJson(form.getSpeciesFileData().toJsonObject(pokemon.getCleanName(), formCounter, aspects, form)));
            formWriter.close();
        }
    }
}
