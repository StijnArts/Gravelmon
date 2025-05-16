package drai.dev.data.jsonwriters.assets;


import com.google.gson.*;
import drai.dev.data.jsonwriters.data.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

import static drai.dev.gravelmon.mega.GravelmonMegas.MEGA_EVOLUTIONS;


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
        MEGA_EVOLUTIONS.entrySet().forEach(set -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writePokemon(set, dir, resourcesDir, gson);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        ArmoredForm.ARMORED_FORMS.forEach((key, value) -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writePokemon(GravelmonUtils.getCleanName(key), dir, resourcesDir, gson, value, 9999, 0);
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
                writePokemon(GravelmonUtils.getCleanName(set.getKey()), dir, resourcesDir, gson, worldRepresentablePokemon, formCounter, i);
            }
        }
    }

    private static <T extends WorldRepresentablePokemon> void writePokemon(String key, String dir, String resourcesDir,
                                                                           Gson gson, T worldRepresentablePokemon, int formCounter, int i) throws IOException {
        String aspect = "";
        int order = 0;
        if(worldRepresentablePokemon instanceof Pokemon pokemon){
            order = formCounter + Arrays.asList(Aspect.values()).indexOf(pokemon.getAdditionalAspect());
            aspect = getCorrectedAspect(resourcesDir, worldRepresentablePokemon, pokemon);
        } else if(worldRepresentablePokemon instanceof MegaEvolution megaEvolution){
            aspect = megaEvolution.getIndependentMegaAspect();
            order = formCounter + 1000 + i;
        } else if(worldRepresentablePokemon instanceof ArmoredForm armoredForm){
            aspect = armoredForm.getAspectName();
            order = formCounter + 2000 + i;
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + order + "_" + key + "_" + aspect + ".json"));
        writer.write(gson.toJson(worldRepresentablePokemon.getSpeciesFileData().toJsonObject(key, order, List.of(aspect), worldRepresentablePokemon)));
        writer.close();
    }

    private static <T extends WorldRepresentablePokemon> String getCorrectedAspect(String resourcesDir, T worldRepresentablePokemon, Pokemon pokemon) throws IOException {
        String aspect;
//        aspect = pokemon.getAdditionalAspect().getName();
//        if(worldRepresentablePokemon.getName().endsWith("One")) {
//            aspect += "two";
//            SpeciesFeaturesJSONWriter.writeFeature(aspect, resourcesDir);
//        }
//        if(worldRepresentablePokemon.getName().endsWith("Two")) {
//            aspect += "three";
//            SpeciesFeaturesJSONWriter.writeFeature(aspect, resourcesDir);
//        }
//        return aspect;

        aspect = pokemon.getAdditionalAspect().getName();

        String name = worldRepresentablePokemon.getName();

        // Extract trailing number word, case insensitive, from the end of the name
        String trailingNumberWord = null;
        for (String numberWord : numberWordToInt.keySet()) {
            if (name.toLowerCase().endsWith(numberWord)) {
                trailingNumberWord = numberWord;
                break;
            }
        }

        if (trailingNumberWord != null) {
            int currentNumber = numberWordToInt.get(trailingNumberWord);
            int nextNumber = currentNumber + 1;

            // Only proceed if we have a next number mapping
            aspect += EnglishNumberToWords.convert(nextNumber); // append next number word in lowercase
            SpeciesFeaturesJSONWriter.writeFeature(aspect, resourcesDir);
        }

        return aspect;
    }

    // Map from number words to ints
    public static final Map<String, Integer> numberWordToInt = createNumbersMap();

    private static Map<String, Integer> createNumbersMap() {
        var map = new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        map.put("eleven", 11);
        map.put("twelve", 12);

        return map;
    }
}
