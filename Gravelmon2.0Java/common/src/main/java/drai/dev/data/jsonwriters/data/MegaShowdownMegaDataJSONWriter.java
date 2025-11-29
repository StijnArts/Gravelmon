package drai.dev.data.jsonwriters.data;

import com.google.gson.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.mega.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

import static drai.dev.data.jsonwriters.assets.LanguageGenerator.capitalizeWords;

public class MegaShowdownMegaDataJSONWriter {
    public static void writeMegaEntries(String resourcesDir) {
        Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
        String dir = resourcesDir + "\\data\\gravelmon\\mega_showdown\\mega\\";
        GravelmonMegas.MEGA_EVOLUTIONS.entrySet().forEach(entry -> {
            JsonObject contents = new JsonObject();
            var megaPokemon = entry.getKey();
            entry.getValue().forEach(megaEvolution -> {
                String megaStoneName = megaEvolution.getMegaStoneName(null).toLowerCase();
                var showdownName = getShowdownItemId(megaStoneName);
                var aspectObject = new JsonObject();
                var pokemons = new JsonArray();
                pokemons.add(megaPokemon);
                contents.addProperty("showdown_id", showdownName);
                contents.add("pokemons", pokemons);
                contents.add("aspect", aspectObject);
                aspectObject.addProperty("apply_aspect", "mega_evolution=" + megaEvolution.getMegaAspect());
                aspectObject.addProperty("revert_aspect", "mega_evolution=" + (megaEvolution.getAspect()==null?"none":megaEvolution.getAspect()));
                var blackListMegaEvolutionAspects = new JsonArray();
                new HashSet<>(Pokemon.ADDITIONAL_SPECIES_ASPECTS).stream()
                        .filter(aspect -> !aspect.getName().equalsIgnoreCase(megaEvolution.getAspect()))
                        .sorted()
                        .forEach(aspect -> {
                    blackListMegaEvolutionAspects.add(aspect.getName());
                });
                var blacklistAspects = new JsonArray();
                blacklistAspects.add(blackListMegaEvolutionAspects);
                aspectObject.add("blacklist_aspects", blacklistAspects);
                try {
                    Files.createDirectories(new File(dir).toPath());
                    BufferedWriter writer = new BufferedWriter(new FileWriter(dir + "\\" + GravelmonUtils.getCleanName(showdownName) + ".json"));
                    writer.write(gson.toJson(contents));
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        });
    }

    public static String getShowdownItemId(String megaStoneName) {
        return megaStoneName.toLowerCase().replaceAll("_", "").replaceAll(" ", "");
    }
}
