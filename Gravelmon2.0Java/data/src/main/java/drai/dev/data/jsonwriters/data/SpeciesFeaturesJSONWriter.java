package drai.dev.data.jsonwriters.data;

import drai.dev.gravelmon.pokemon.attributes.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

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

            BufferedWriter writer = new BufferedWriter(new FileWriter(dir+aspect.toLowerCase()+".json"));
            writer.write(fileContents);
            writer.close();


    }
}
