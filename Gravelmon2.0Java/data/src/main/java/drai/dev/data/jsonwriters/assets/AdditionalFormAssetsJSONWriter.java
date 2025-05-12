package drai.dev.data.jsonwriters.assets;


import com.google.gson.*;
import drai.dev.data.jsonwriters.data.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;


public class AdditionalFormAssetsJSONWriter {

    public static void writeSpecies(String resourcesDir) {
        String dir = resourcesDir + "\\assets\\cobblemon\\bedrock\\species\\additional_forms\\";
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
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
                var aspect = pokemon.getAdditionalAspect().getName();
                if(pokemon.getName().endsWith("One")) {
                    aspect += "two";
                    SpeciesFeaturesJSONWriter.writeFeature(aspect, resourcesDir);
                }
                if(pokemon.getName().endsWith("Two")) {
                    aspect += "three";
                    SpeciesFeaturesJSONWriter.writeFeature(aspect, resourcesDir);
                }
                int order = formCounter + java.util.Arrays.asList(Aspect.values()).indexOf(pokemon.getAdditionalAspect());
                BufferedWriter writer = new BufferedWriter(new FileWriter(dir + order + "_" + GravelmonUtils.getCleanName(set.getKey()) + "_" + aspect + ".json"));
                writer.write(gson.toJson(pokemon.getSpeciesFileData().toJsonObject(GravelmonUtils.getCleanName(set.getKey()), order, List.of(aspect), pokemon)));
                writer.close();
            }
        }
    }
}
