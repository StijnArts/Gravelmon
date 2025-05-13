package drai.dev.data.jsonwriters.assets;


import com.google.gson.*;
import drai.dev.data.jsonwriters.data.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import org.apache.poi.ss.formula.functions.*;

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
        Pokemon.MEGA_EVOLUTIONS.entrySet().forEach(set -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writePokemon(set, dir, resourcesDir, gson);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
    }

    private synchronized static <T extends WorldRepresentablePokemon> void writePokemon(Map.Entry<String, List<T>> set, String dir, String resourcesDir, Gson gson) throws IOException {
        if (!set.getValue().isEmpty()) {
            int formCounter = 10;
            for (int i = 0; i < set.getValue().size(); i++) {
                var worldRepresentablePokemon = set.getValue().get(i);
                String aspect = "";
                int order = 0;
                if(worldRepresentablePokemon instanceof Pokemon pokemon){
                    order = formCounter + Arrays.asList(Aspect.values()).indexOf(pokemon.getAdditionalAspect());
                    aspect = pokemon.getAdditionalAspect().getName();
                    if(worldRepresentablePokemon.getName().endsWith("One")) {
                        aspect += "two";
                        SpeciesFeaturesJSONWriter.writeFeature(aspect, resourcesDir);
                    }
                    if(worldRepresentablePokemon.getName().endsWith("Two")) {
                        aspect += "three";
                        SpeciesFeaturesJSONWriter.writeFeature(aspect, resourcesDir);
                    }
                } else if(worldRepresentablePokemon instanceof MegaEvolution megaEvolution){
                    var megaAspect = megaEvolution.getAspect();
                    int megaAspectIndex = 0;
                    if(megaAspect!=null) Arrays.asList(Aspect.values()).indexOf(megaAspect);
                    order = formCounter + 1000 + i + megaAspectIndex;
                }


                BufferedWriter writer = new BufferedWriter(new FileWriter(dir + order + "_" + GravelmonUtils.getCleanName(set.getKey()) + "_" + aspect + ".json"));
                writer.write(gson.toJson(worldRepresentablePokemon.getSpeciesFileData().toJsonObject(GravelmonUtils.getCleanName(set.getKey()), order, List.of(aspect), worldRepresentablePokemon)));
                writer.close();
            }
        }
    }
}
