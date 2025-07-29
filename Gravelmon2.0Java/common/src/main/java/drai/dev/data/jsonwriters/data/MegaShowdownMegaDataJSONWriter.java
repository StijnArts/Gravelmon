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
        var blackListMegaEvolutionAspects = new JsonArray();
        new HashSet<>(Pokemon.ADDITIONAL_SPECIES_ASPECTS).forEach(aspect -> {
            blackListMegaEvolutionAspects.add(aspect.getName());
        });
        GravelmonMegas.MEGA_EVOLUTIONS.entrySet().forEach(entry -> {
            JsonObject contents = new JsonObject();
            var megaPokemon = entry.getKey();
            entry.getValue().forEach(megaEvolution -> {
                String megaStoneName = megaEvolution.getMegaStoneName(null).toLowerCase();
                var showdownName = getShowdownItemId(megaStoneName);
                var megaSource = (megaEvolution.getAspect() != null ? megaEvolution.getAspect().toLowerCase() + " " : "") + megaPokemon;
                megaSource = capitalizeWords(megaSource.replaceAll("_", " ").toLowerCase().trim());
                String megaSuffix = megaEvolution.getMegaSuffix();
                var tooltip = "Allows "+megaSource+" to Mega Evolve into Mega "+megaSource + (megaSuffix.isEmpty()?"":" "+capitalizeWords(megaSuffix));
                contents.addProperty("msd_id", showdownName);
                contents.addProperty("showdown_id", showdownName);
                contents.addProperty("item_id", "gravelmon:"+ megaStoneName);
                contents.addProperty("item_name", capitalizeWords(megaStoneName.replaceAll("_", " ")));
                contents.addProperty("pokemon", megaPokemon);
                contents.addProperty("apply_aspect", megaEvolution.getMegaAspect());
                var tooltips = new JsonArray();
                tooltips.add(tooltip);
                contents.add("itemDescription", tooltips);
                if(megaEvolution.getAspect() != null) {
                    var requiredAspects = new JsonArray();
                    var megaEvolutionAspects = new JsonArray();
                    megaEvolutionAspects.add(megaEvolution.getAspect());
                    requiredAspects.add(megaEvolutionAspects);
                    contents.add("requiredAspects", requiredAspects);
                } else {
                    var blacklistAspects = new JsonArray();
                    blacklistAspects.add(blackListMegaEvolutionAspects);
                    contents.add("blacklist_aspects", blacklistAspects);
                }
                try {
                    Files.createDirectories(new File(dir).toPath());
                    BufferedWriter writer = new BufferedWriter(new FileWriter(dir +"\\"+ GravelmonUtils.getCleanName(showdownName) + ".json"));
                    writer.write(gson.toJson(contents));
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        });
    }

    public static String getShowdownItemId(String megaStoneName) {
        return megaStoneName.toLowerCase().replaceAll("_","").replaceAll(" ","");
    }
}
