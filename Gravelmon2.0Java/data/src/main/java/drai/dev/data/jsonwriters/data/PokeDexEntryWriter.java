package drai.dev.data.jsonwriters.data;

import com.cobblemon.mod.relocations.oracle.truffle.regex.tregex.util.json.*;
import com.google.gson.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelsextendedbattles.*;
import drai.dev.gravelsextendedbattles.resorting.*;
import org.apache.commons.lang3.*;

import java.io.*;
import java.nio.file.*;

public class PokeDexEntryWriter {
    static int order = 10;
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

    private static void writePokedexEntry(Pokemon pokemon, String dir, Gson gson) throws IOException {
        order += 1;
        var fileContents = new JsonObject();
        var speciesId = pokemon.getCleanName();
        var speciesName = pokemon.getCleanName();
        var speciesNamespace = "cobblemon";
        var aspect = "Normal";
        if(Pokemon.isAnAdditionalForm(pokemon)) {
            speciesName = Pokemon.getKeysByValue(Pokemon.ADDITIONAL_FORMS, pokemon).stream().findFirst().get();
            speciesId = speciesName + "-" + pokemon.getAdditionalAspect().name().toLowerCase();
            aspect = StringUtils.capitalize(GravelmonUtils.getCleanName(pokemon.getAdditionalAspect().name().toLowerCase()).replace("_", ""));
        }
        fileContents.addProperty("id","cobblemon:"+speciesId);
        fileContents.addProperty("speciesId",speciesNamespace+":"+speciesName);
        fileContents.add("displayAspects",new JsonArray());
        fileContents.add("conditionAspects",new JsonArray());
        var forms = new JsonArray();
        fileContents.add("forms",forms);
        var unlockForms = new JsonArray();
        unlockForms.add(aspect);
        var baseForm = new JsonObject();

        baseForm.addProperty("displayForm", aspect);
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
