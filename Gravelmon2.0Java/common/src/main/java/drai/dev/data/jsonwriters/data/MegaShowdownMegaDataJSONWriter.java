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
    public static int num = 10000;
    public static void writeMegaEntries(String resourcesDir) {
        Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
        String dir = resourcesDir + "\\data\\gravelmon\\mega_showdown\\";
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
                String megaAspect = megaEvolution.getMegaAspect();

                String itemCode = buildShowdownItemTemplate(megaPokemon, megaEvolution.getAspect(), megaAspect, showdownName);
                try {
                    Files.createDirectories(new File(dir+ "mega\\").toPath());
                    BufferedWriter writer = new BufferedWriter(new FileWriter(dir + "mega\\" + megaStoneName + ".json"));
                    writer.write(gson.toJson(contents));
                    writer.close();
                    String heldItemsFolder = resourcesDir + "\\data\\mega_showdown\\showdown\\held_items";
                    Files.createDirectories(new File(heldItemsFolder).toPath());
                    writer = new BufferedWriter(new FileWriter(heldItemsFolder + showdownName + ".js"));
                    writer.write(itemCode);
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

    private static String buildShowdownItemTemplate(String baseSpecies,
                                                    String form,
                                                    String megaAspect,
                                                    String megaStoneName) {

        String displayName = capitalize(megaStoneName);
        String megaForm = baseSpecies + "-" + megaAspect;

        String template = """
            {
                name: "%DISPLAY%",
                spritenum: 620,
                megaStone: "%MEGAFORM%",
                megaEvolves: "%BASE%",
                itemUser: ["%BASE%"],
                onTakeItem(item, source) {
                  if (source.baseSpecies.forme !== %FORM%)
                    return true;
                  if (item.megaEvolves === source.baseSpecies.baseSpecies)
                    return false;
                  return true;
                },
                %NUM%: 760,
                gen: 6,
                isNonstandard: "Past"
            }
            """;

        return template
                .replace("%NUM%", num+++"")
                .replace("%DISPLAY%", displayName)
                .replace("%MEGAFORM%", megaForm)
                .replace("%BASE%", baseSpecies)
                .replace("%FORM%", form == null ? "\"\"" : form);
    }

    private static String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
