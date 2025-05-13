package drai.dev.data.jsonwriters.data;

import com.google.gson.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import org.apache.commons.lang3.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class PokeDexEntryWriter {
    static int order = 10;
    public static void writeMega(MegaEvolution megaEvolution, String resourcesDir) {
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
            try {
                String dir = resourcesDir + "\\data\\cobblemon\\dex_entries\\pokemon\\"+megaEvolution.getGame().getName().toLowerCase()+"\\";
                Files.createDirectories(new File(dir).toPath());
                writePokedexEntry(megaEvolution, dir, gson);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    public static void write(Game game, String resourcesDir) {
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        game.getNewPokemon().forEach(pokemon -> {
                try {
                    String dir = resourcesDir + "\\data\\cobblemon\\dex_entries\\pokemon\\"+game.getName().toLowerCase()+"\\";
                    Files.createDirectories(new File(dir).toPath());
                    writePokedexEntry(pokemon, dir, gson);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        });
    }

    private static void writePokedexEntry(WorldRepresentablePokemon worldRepresentablePokemon, String dir, Gson gson) throws IOException {
        order += 1;
        var fileContents = new JsonObject();
        var speciesId = worldRepresentablePokemon.getCleanName();
        var speciesName = worldRepresentablePokemon.getCleanName();
        var speciesNamespace = "cobblemon";
        var aspects = new ArrayList<String>();
        aspects.add("Normal");
        if(worldRepresentablePokemon instanceof Pokemon pokemon && Pokemon.isAnAdditionalForm(pokemon)) {
            speciesName = Pokemon.getKeysByValue(Pokemon.ADDITIONAL_FORMS, pokemon).stream().findFirst().get();
            speciesId = speciesName + "-" + pokemon.getAdditionalAspect().name().toLowerCase();
            aspects.clear();
            aspects.add(StringUtils.capitalize(GravelmonUtils.getCleanName(pokemon.getAdditionalAspect().name().toLowerCase()).replace("_", "")));
        } else if(worldRepresentablePokemon instanceof MegaEvolution mega) {
            speciesName = mega.getNonMegaCleanName();
            speciesId = speciesName + (mega.getAspect()!=null?"-" + mega.getAspect().name().toLowerCase():"") + "-" + GravelmonUtils.getCleanName(mega.getMegaName());
            aspects.clear();
            aspects.add(mega.getMegaName());
            if(mega.getAspect()!=null) aspects.add(mega.getAspect().name().toLowerCase());
        }

        fileContents.addProperty("id","cobblemon:"+speciesId);
        fileContents.addProperty("speciesId",speciesNamespace+":"+speciesName);
        var unlockForms = new JsonArray();
        aspects.forEach(unlockForms::add);
        fileContents.add("displayAspects", new JsonArray());
        fileContents.add("conditionAspects",new JsonArray());
        var forms = new JsonArray();
        fileContents.add("forms",forms);
        var baseForm = new JsonObject();

        baseForm.addProperty("displayForm", String.join(" ", aspects));
        baseForm.add("unlockForms", unlockForms);
        forms.add(baseForm);
        fileContents.add("conditionAspects",new JsonArray());

        var variations = new JsonArray();

        fileContents.add("variations",variations);

        BufferedWriter writer = new BufferedWriter(new FileWriter(dir +"\\"+ speciesId + ".json"));
        writer.write(gson.toJson(fileContents));
        writer.close();
    }
}
