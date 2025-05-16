package drai.dev.data.jsonwriters.data;

import com.google.gson.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

import static drai.dev.gravelmon.mega.GravelmonMegas.MEGA_EVOLUTIONS;

public class SpeciesFeaturesJSONWriter {
    public static void writeFeatures(String resourcesDir){
        String dir = resourcesDir+"\\data\\cobblemon\\species_features\\";
        Arrays.stream(Aspect.values()).forEach(aspect -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writeAspect(aspect,dir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        MegaEvolution.getDistinctMegaNames().forEach(megaName -> {
            try {
                writeFeature(megaName, resourcesDir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        try {
            writeFeatureAssignment(MEGA_EVOLUTIONS.keySet(), resourcesDir+"\\data\\gravelmon\\species_feature_assignments");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ArmoredForm.getDistinctArmorNames().forEach(megaName -> {
            try {
                writeFeature(megaName, resourcesDir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void writeFeatureAssignment(Set<String> strings, String dir) throws IOException {
        Files.createDirectories(new File(dir).toPath());
        var gson = new GsonBuilder().setPrettyPrinting().create();
        var fileContents = new JsonObject();
        var pokemon = new JsonArray();
        strings.forEach(pokemon::add);
        fileContents.add("pokemon", pokemon);
        var features = new JsonArray();
        features.add("mega_evolution");
        fileContents.add("features", features);

        BufferedWriter writer = new BufferedWriter(new FileWriter(dir+"\\mega_evolution.json"));
        writer.write(gson.toJson(fileContents));
        writer.close();
    }

    private static void writeAspect(Aspect aspect, String dir) throws IOException {
        if(aspect.isNew()){
            String fileContents = "{\n" +
                    "    \"keys\": [ \""+aspect.name().toLowerCase()+"\" ],\n" +
                    "    \"type\": \"flag\",\n" +
                    "    \"isAspect\": true,\n" +
                    "    \"default\": "+aspect.isDefault()+"\n" +
                    "  }";

            BufferedWriter writer = new BufferedWriter(new FileWriter(dir+aspect.name().toLowerCase()+".json"));
            writer.write(fileContents);
            writer.close();

        }
    }

    public static void writeFeature(String aspect, String resourcesDir) throws IOException {
        String dir = resourcesDir+"\\data\\cobblemon\\species_features\\";
            String fileContents = "{\n" +
                    "    \"keys\": [ \""+aspect.toLowerCase()+"\" ],\n" +
                    "    \"type\": \"flag\",\n" +
                    "    \"isAspect\": true,\n" +
                    "    \"default\": false\n" +
                    "  }";
            Files.createDirectories(new File(dir).toPath());
            BufferedWriter writer = new BufferedWriter(new FileWriter(dir+aspect.toLowerCase()+".json"));
            writer.write(fileContents);
            writer.close();


    }
}
