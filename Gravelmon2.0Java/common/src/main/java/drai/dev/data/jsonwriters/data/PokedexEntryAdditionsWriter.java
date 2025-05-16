package drai.dev.data.jsonwriters.data;

import com.google.gson.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import org.apache.commons.lang3.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class PokedexEntryAdditionsWriter {
    public static void writeAdditions(String resourcesDir) {
        String dir = resourcesDir + "\\data\\gravelmon\\dex_entry_additions\\";
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        Pokemon.ADDITIONAL_FORMS.entrySet().forEach(mapEntry -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writePokedexEntry(mapEntry, dir, gson);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void writePokedexEntry(Map.Entry<String, List<Pokemon>> mapEntry, String dir, Gson gson) throws IOException {
        var fileContents = new JsonObject();
        fileContents.addProperty("entryId","cobblemon:"+GravelmonUtils.getCleanName(mapEntry.getKey()));
        var forms = new JsonArray();
        fileContents.add("forms",forms);

        for (Pokemon pokemon : mapEntry.getValue()) {
            if(AbstractPokemon.isAnAdditionalForm(pokemon)) continue;
            var entry = new JsonObject();
            var unlockForms = new JsonArray();
            var aspect = StringUtils.capitalize(GravelmonUtils.getCleanName(pokemon.getAdditionalAspect().name().toLowerCase())
                    .replace("_", ""));
            unlockForms.add(aspect);
            entry.addProperty("displayForm",aspect);
            entry.add("unlockForms", unlockForms);
            forms.add(entry);
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir +"\\"+ GravelmonUtils.getCleanName(mapEntry.getKey()) + ".json"));
        writer.write(gson.toJson(fileContents));
        writer.close();
    }
}
