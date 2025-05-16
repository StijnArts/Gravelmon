package drai.dev.data.jsonwriters.data;

import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import org.jetbrains.annotations.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

import static drai.dev.data.jsonwriters.data.SpeciesDataJSONWriter.*;
import static drai.dev.gravelmon.mega.GravelmonMegas.MEGA_EVOLUTIONS;

public class SpeciesAdditionsWriter {
    private static final Map<String, JsonObject> SPECIES_ADDITIONS = new HashMap<>();

    public static void writeAdditions(String resourcesDir) {
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        Pokemon.ADDITIONAL_FORMS.entrySet().stream()
                .filter(stringListEntry -> !AbstractPokemon.isAnAdditionalForm(stringListEntry.getKey()))
                .forEach(SpeciesAdditionsWriter::writePokemon);
        Pokemon.ADDITIONAL_EVOLUTIONS.entrySet().stream()
                .filter(stringListEntry -> !AbstractPokemon.isAnAdditionalForm(stringListEntry.getKey()))
                .forEach(SpeciesAdditionsWriter::writeAlternateEvolutions);
        Pokemon.ADDITIONAL_DROPS.entrySet().stream()
                .filter(stringListEntry -> !AbstractPokemon.isAnAdditionalForm(stringListEntry.getKey()))
                .forEach(SpeciesAdditionsWriter::writeAlternateDrops);
        Pokemon.ADDITIONAL_PRE_EVOLUTIONS.entrySet().stream()
                .filter(stringListEntry -> !AbstractPokemon.isAnAdditionalForm(stringListEntry.getKey()))
                .forEach(SpeciesAdditionsWriter::writeAdditionalPreEvolutions);
        MEGA_EVOLUTIONS.entrySet().stream()
                .filter(stringListEntry -> !AbstractPokemon.isAnAdditionalForm(stringListEntry.getKey()))
                .forEach(SpeciesAdditionsWriter::writeMegaEvolution);
        ArmoredForm.ARMORED_FORMS.entrySet().stream()
                .filter(stringListEntry -> !AbstractPokemon.isAnAdditionalForm(stringListEntry.getKey()))
                .forEach(SpeciesAdditionsWriter::writeArmoredForm);

        writeJson(resourcesDir, gson);
    }

    private static void writeJson(String resourcesDir, Gson gson) {
        var dir = resourcesDir + "\\data\\gravelmon\\species_additions\\";
        SPECIES_ADDITIONS.forEach((key, value) -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                BufferedWriter writer = new BufferedWriter(new FileWriter(dir + getKey(key) + ".json"));
                writer.write(gson.toJson(value));
                writer.close();
            } catch (IOException e) {
                System.out.println("error writing additions for " + key);
            }
        });
    }

    private static void writeAdditionalPreEvolutions(Map.Entry<String, String> set){
        if(Pokemon.isAnAdditionalForm(set.getKey())) return;
        var fileContents = getSpeciesAddition(getKey(set.getKey()));
        fileContents.addProperty("preEvolution", set.getValue());
    }

    private synchronized static void writeAlternateDrops(Map.Entry<String, List<ItemDrop>> set) {
        var fileContents = getSpeciesAddition(getKey(set.getKey()));
        fileContents.add("drops", getDrops(3, set.getValue()));

    }

    private synchronized static void writeAlternateEvolutions(Map.Entry<String, List<EvolutionEntry>> set) {
        var fileContents = getSpeciesAddition(getKey(set.getKey()));
        addOrCreateJsonArray(fileContents, "evolutions", SpeciesDataJSONWriter.getEvolutions(set.getValue(), getKey(set.getKey())));

    }

    private synchronized static void writePokemon(Map.Entry<String, List<Pokemon>> set) {
        var fileContents = getSpeciesAddition(getKey(set.getKey()));
        if (!set.getValue().isEmpty()) {
            var forms = getForms(set.getValue());
            var features = getFeatures(set.getValue());
            addOrCreateJsonArray(fileContents, "forms", forms);
            addOrCreateJsonArray(fileContents, "features", features);
        }
    }

    public static void addOrCreateJsonArray(JsonObject fileContents, String propertyName, JsonElement item) {
        var array = new JsonArray();
        if(fileContents.has(propertyName)) array = fileContents.getAsJsonArray(propertyName);
        if(item instanceof JsonArray items) {
            items.forEach(array::add);
        } else {
            array.add(item);
        }
        fileContents.add(propertyName, array);
    }

    private static void getMegaEvolutions(JsonArray forms, List<MegaEvolution> megaEvolutions) {
        for (var mega : megaEvolutions) {
            forms.add(mega.toJson());
        }
    }

    private static JsonObject getSpeciesAddition(String pokemonId) {
        return SPECIES_ADDITIONS.computeIfAbsent(pokemonId, k-> {
            var json = new JsonObject();
            json.addProperty("target", "cobblemon:" + pokemonId);
            return json;
        });
    }

    private static void writeMegaEvolution(Map.Entry<String, List<MegaEvolution>> set) {
        String key = getKey(set.getKey());
        var fileContents = getSpeciesAddition(key);
        var forms = new JsonArray();
        var features = new JsonArray();
        getMegaEvolutions(forms, MEGA_EVOLUTIONS.get(key));
        MegaEvolution.getDistinctMegaNames(key).forEach(features::add);
        addOrCreateJsonArray(fileContents, "forms", forms);
        addOrCreateJsonArray(fileContents, "features", features);

    }

    private static void writeArmoredForm(Map.Entry<String, ArmoredForm> set) {
        String key = getKey(set.getKey());
        var fileContents = getSpeciesAddition(key);
        var forms = new JsonArray();
        var features = new JsonArray();
        features.add(set.getValue().getAspectName());
        forms.add(set.getValue().toJson());
        addOrCreateJsonArray(fileContents, "forms", forms);
        addOrCreateJsonArray(fileContents, "features", features);
    }

    private static @NotNull String getKey(String set) {
        return GravelmonUtils.getCleanName(set).replaceAll("=false", "");
    }
}
