package drai.dev.data.jsonwriters.data;

import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

import static drai.dev.data.jsonwriters.data.SpeciesDataJSONWriter.*;
import static drai.dev.data.pokemon.AbstractPokemon.MEGA_EVOLUTIONS;

public class SpeciesAdditionsWriter {
    public static void writeAdditions(String resourcesDir) {
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        Pokemon.ADDITIONAL_FORMS.entrySet().stream()
                .filter(stringListEntry -> !AbstractPokemon.isAnAdditionalForm(stringListEntry.getKey()))
                .forEach(set -> {
            try {
                var dir = resourcesDir + "\\data\\gravelmon\\species_additions\\";
                Files.createDirectories(new File(dir).toPath());
                writePokemon(set, dir, resourcesDir, gson);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        Pokemon.ADDITIONAL_EVOLUTIONS.entrySet().stream().filter(stringListEntry -> !Pokemon.ADDITIONAL_FORMS.containsKey(stringListEntry.getKey()))
                .filter(stringListEntry -> !AbstractPokemon.isAnAdditionalForm(stringListEntry.getKey()))
                .forEach(stringListEntry -> {
            try {
                var dir = resourcesDir + "\\data\\gravelmon\\species_additions\\";
                Files.createDirectories(new File(dir).toPath());
                writeAlternateEvolutions(stringListEntry, dir, gson);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        Pokemon.ADDITIONAL_DROPS.entrySet().stream()
                .filter(stringListEntry -> !Pokemon.ADDITIONAL_FORMS.containsKey(stringListEntry.getKey())
                        && !Pokemon.ADDITIONAL_EVOLUTIONS.containsKey(stringListEntry.getKey()))
                .filter(stringListEntry -> !AbstractPokemon.isAnAdditionalForm(stringListEntry.getKey()))
                .forEach(stringListEntry -> {
                    try {
                        var dir = resourcesDir + "\\data\\gravelmon\\species_additions\\";
                        Files.createDirectories(new File(dir).toPath());
                        writeAlternateDrops(stringListEntry, dir, gson);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        Pokemon.ADDITIONAL_PRE_EVOLUTIONS.entrySet().stream()
                .filter(stringListEntry -> !Pokemon.ADDITIONAL_FORMS.containsKey(stringListEntry.getKey())
                        && !Pokemon.ADDITIONAL_EVOLUTIONS.containsKey(stringListEntry.getKey())
                        && !Pokemon.ADDITIONAL_DROPS.containsKey(stringListEntry.getKey()))
                .filter(stringListEntry -> !AbstractPokemon.isAnAdditionalForm(stringListEntry.getKey()))
                .forEach(stringListEntry -> {
                    try {
                        var dir = resourcesDir + "\\data\\gravelmon\\species_additions\\";
                        Files.createDirectories(new File(dir).toPath());
                        writeAdditionalPreEvolutions(stringListEntry, dir, gson);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        MEGA_EVOLUTIONS.entrySet().stream()
                .filter(stringListEntry -> !Pokemon.ADDITIONAL_FORMS.containsKey(stringListEntry.getKey())
                        && !Pokemon.ADDITIONAL_EVOLUTIONS.containsKey(stringListEntry.getKey())
                        && !Pokemon.ADDITIONAL_DROPS.containsKey(stringListEntry.getKey())
                        && !Pokemon.ADDITIONAL_PRE_EVOLUTIONS.containsKey(stringListEntry.getKey()))
                .filter(stringListEntry -> !AbstractPokemon.isAnAdditionalForm(stringListEntry.getKey()))
                .forEach(stringListEntry -> {
                    try {
                        var dir = resourcesDir + "\\data\\gravelmon\\species_additions\\";
                        Files.createDirectories(new File(dir).toPath());
                        writeMegaEvolution(stringListEntry, dir, gson);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    private static void writeMegaEvolution(Map.Entry<String, List<MegaEvolution>> set, String dir, Gson gson) throws IOException {
        var fileContents = new JsonObject();
        var forms = new JsonArray();
        var features = new JsonArray();
        getMegaEvolutions(forms, MEGA_EVOLUTIONS.get(set.getKey()));
        MegaEvolution.getDistinctMegaNames().forEach(features::add);
        fileContents.add("forms", forms);
        fileContents.add("features", features);
        fileContents.addProperty("target", "cobblemon:" + GravelmonUtils.getCleanName(set.getKey()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + GravelmonUtils.getCleanName(set.getKey()).replaceAll("=false", "") + ".json"));
        writer.write(gson.toJson(fileContents));
        writer.close();
    }

    private static void writeAdditionalPreEvolutions(Map.Entry<String, String> set, String dir, Gson gson) throws IOException {
        var fileContents = new JsonObject();
        if(MEGA_EVOLUTIONS.containsKey(set.getKey())) {
            var forms = new JsonArray();
            var features = new JsonArray();
            getMegaEvolutions(forms, MEGA_EVOLUTIONS.get(set.getKey()));
            MegaEvolution.getDistinctMegaNames().forEach(features::add);
            fileContents.add("forms", forms);
            fileContents.add("features", features);
        }
        fileContents.addProperty("target", "cobblemon:" + GravelmonUtils.getCleanName(set.getKey()));
        fileContents.addProperty("preEvolution", set.getValue());
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + GravelmonUtils.getCleanName(set.getKey()).replaceAll("=false", "") + ".json"));
        writer.write(gson.toJson(fileContents));
        writer.close();
    }

    private synchronized static void writeAlternateDrops(Map.Entry<String, List<ItemDrop>> set, String dir, Gson gson) throws IOException {
        var fileContents = new JsonObject();
        fileContents.addProperty("target", "cobblemon:" + GravelmonUtils.getCleanName(set.getKey()));
        if (Pokemon.ADDITIONAL_PRE_EVOLUTIONS.containsKey(set.getKey())) {
            fileContents.addProperty("preEvolution", Pokemon.ADDITIONAL_PRE_EVOLUTIONS.get(set.getKey()));
        }
        if(MEGA_EVOLUTIONS.containsKey(set.getKey())) {
            var forms = new JsonArray();
            var features = new JsonArray();
            getMegaEvolutions(forms, MEGA_EVOLUTIONS.get(set.getKey()));
            MegaEvolution.getDistinctMegaNames().forEach(features::add);
            fileContents.add("forms", forms);
            fileContents.add("features", features);
        }
        fileContents.add("drops", getDrops(3, set.getValue()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + GravelmonUtils.getCleanName(set.getKey()).replaceAll("=false", "") + ".json"));
        writer.write(gson.toJson(fileContents));
        writer.close();
    }

    private synchronized static void writeAlternateEvolutions(Map.Entry<String, List<EvolutionEntry>> set, String dir, Gson gson) throws IOException {
        var fileContents = new JsonObject();
        fileContents.addProperty("target", "cobblemon:" + GravelmonUtils.getCleanName(set.getKey()));
        if (Pokemon.ADDITIONAL_DROPS.containsKey(set.getKey())) {
            fileContents.add("drops", getDrops(3, Pokemon.ADDITIONAL_DROPS.get(set.getKey())));
        }
        if (Pokemon.ADDITIONAL_PRE_EVOLUTIONS.containsKey(set.getKey())) {
            fileContents.addProperty("preEvolution", Pokemon.ADDITIONAL_PRE_EVOLUTIONS.get(set.getKey()));
        }
        if(MEGA_EVOLUTIONS.containsKey(set.getKey())) {
            var forms = new JsonArray();
            var features = new JsonArray();
            getMegaEvolutions(forms, MEGA_EVOLUTIONS.get(set.getKey()));
            MegaEvolution.getDistinctMegaNames().forEach(features::add);
            fileContents.add("forms", forms);
            fileContents.add("features", features);
        }
        fileContents.add("evolutions", SpeciesDataJSONWriter.getEvolutions(set.getValue(), GravelmonUtils.getCleanName(set.getKey())));
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + GravelmonUtils.getCleanName(set.getKey()).replaceAll("=false", "") + ".json"));
        writer.write(gson.toJson(fileContents));
        writer.close();
    }

    private synchronized static void writePokemon(Map.Entry<String, List<Pokemon>> set, String dir, String resourcesDir, Gson gson) throws IOException {
        var fileContents = new JsonObject();
        fileContents.addProperty("target", "cobblemon:" + GravelmonUtils.getCleanName(set.getKey()));
        if (Pokemon.ADDITIONAL_EVOLUTIONS.containsKey(set.getKey())) {
            fileContents.add("evolutions", SpeciesDataJSONWriter.getEvolutions(Pokemon.ADDITIONAL_EVOLUTIONS.get(set.getKey()), GravelmonUtils.getCleanName(set.getKey())));
        }
        if (Pokemon.ADDITIONAL_DROPS.containsKey(set.getKey())) {
            fileContents.add("drops", getDrops(3, Pokemon.ADDITIONAL_DROPS.get(set.getKey())));
        }
        if (Pokemon.ADDITIONAL_PRE_EVOLUTIONS.containsKey(set.getKey())) {
            fileContents.addProperty("preEvolution", Pokemon.ADDITIONAL_PRE_EVOLUTIONS.get(set.getKey()));
        }
        if (!set.getValue().isEmpty()) {
            var forms = getForms(set.getValue());
            var features = getFeatures(set.getValue());
            if(MEGA_EVOLUTIONS.containsKey(set.getKey())) {
                getMegaEvolutions(forms, MEGA_EVOLUTIONS.get(set.getKey()));
                MegaEvolution.getDistinctMegaNames().forEach(features::add);
            }
            fileContents.add("forms", forms);
            fileContents.add("features", features);
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + GravelmonUtils.getCleanName(set.getKey()).replaceAll("=false", "") + ".json"));
        writer.write(gson.toJson(fileContents));
        writer.close();
    }

    private static void getMegaEvolutions(JsonArray forms, List<MegaEvolution> megaEvolutions) {
        for (var mega : megaEvolutions) {
            forms.add(mega.toJson());
        }
    }
}
