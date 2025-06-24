package drai.dev.data.jsonwriters.data;

import com.google.gson.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import org.apache.commons.lang3.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class PokedexEntryAdditionsWriter {
    private static final Map<String, JsonObject> DEX_ADDITIONS = new HashMap<>();
    public static void writeAdditions() {
        Pokemon.ADDITIONAL_FORMS.entrySet().forEach(PokedexEntryAdditionsWriter::writePokedexEntry);
    }
    
    public static void writeMega(MegaEvolution megaEvolution) {
        writePokedexEntry(megaEvolution.getName(), megaEvolution.getMegaAspect());
    }

    public static void finalizeDexEntryAdditions(String resourcesDir) {
        String dir = resourcesDir + "\\data\\gravelmon\\dex_entry_additions\\";
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        DEX_ADDITIONS.forEach((key, value) -> {

            BufferedWriter writer = null;
            try {
                Files.createDirectories(new File(dir).toPath());
                writer = new BufferedWriter(new FileWriter(dir +"\\"+ GravelmonUtils.getCleanName(key) + ".json"));
                writer.write(gson.toJson(value));
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
    }

    private static void writePokedexEntry(String key, String aspect) {
        var json = getOrCreateJson(key);
        var forms = json.getAsJsonArray("forms");
        getAdditionalDexEntry(forms, aspect);
    }

    private static void writePokedexEntry(Map.Entry<String, List<Pokemon>> mapEntry) {
        var json = getOrCreateJson(mapEntry.getKey());
        var forms = json.getAsJsonArray("forms");

        for (Pokemon pokemon : mapEntry.getValue()) {
            getAdditionalDexEntry(forms, pokemon.getAdditionalAspect().name().toLowerCase());
        }
    }

    private static void getAdditionalDexEntry(JsonArray forms, String aspect) {
        var entry = new JsonObject();
        var unlockForms = new JsonArray();
        aspect = StringUtils.capitalize(aspect);
        unlockForms.add(aspect);
        entry.addProperty("displayForm",aspect);
        entry.add("unlockForms", unlockForms);
        forms.add(entry);
    }

    private static JsonObject getOrCreateJson(String key) {
        return DEX_ADDITIONS.computeIfAbsent(key, k -> {
            var fileContents = new JsonObject();
            fileContents.addProperty("entryId","cobblemon:"+GravelmonUtils.getCleanName(key));
            var forms = new JsonArray();
            fileContents.add("forms",forms);
            return fileContents;
        });
    }
}
