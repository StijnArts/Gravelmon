package drai.dev.data.jsonwriters.data;

import com.google.gson.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.jsonwriters.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;

import java.io.*;
import java.nio.file.*;

public class PokeDexWriter {
    private static int order = 10;
    private static final JsonArray dexes = new JsonArray();
    public static void write(Game game, String resourcesDir) {
        String dir = resourcesDir + "\\data\\gravelmon\\dexes";

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            Files.createDirectories(new File(dir).toPath());
            writePokedex(game, dir, gson);
            LangJSONWriter.writePokedexRegion(game);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void finalizeDexes(String resourcesDir){
        String dir = resourcesDir + "\\data\\gravelmon\\dex_additions";
        var fileContents = new JsonObject();
        fileContents.addProperty("dexId","cobblemon:national");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        fileContents.add("entries", dexes);
        try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir +"\\national.json"));

            writer.write(gson.toJson(fileContents));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writePokedex(Game game, String dir, Gson gson) throws IOException {
        if(game.getName().toLowerCase().contains("generation")) return;
        order += 1;
        dexes.add("gravelmon:"+GravelmonUtils.getCleanName(game.getName()));
        var fileContents = new JsonObject();
        fileContents.addProperty("type","cobblemon:simple_pokedex_def");
        fileContents.addProperty("sortOrder",order);
        fileContents.addProperty("id","gravelmon:"+GravelmonUtils.getCleanName(game.getName()));

        var entries = new JsonArray();
        for (int i = 0; i < game.getPokedex().size(); i++) {
            var pokemon = game.getPokedex().get(i);
            entries.add(pokemon);
        }
        fileContents.add("entries", entries);
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir +"\\"+ GravelmonUtils.getCleanName(game.getName()) + ".json"));
        writer.write(gson.toJson(fileContents));
        writer.close();
    }
}
