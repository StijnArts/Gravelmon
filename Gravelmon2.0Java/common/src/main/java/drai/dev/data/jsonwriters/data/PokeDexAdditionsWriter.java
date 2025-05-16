package drai.dev.data.jsonwriters.data;

import com.google.gson.*;
import drai.dev.data.games.registry.*;
import drai.dev.gravelmon.*;

import java.io.*;
import java.nio.file.*;

public class PokeDexAdditionsWriter {
    public static void write(Game game, String resourcesDir) {
        String dir = resourcesDir + "\\data\\gravelmon\\dex_additions";
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        try {
            Files.createDirectories(new File(dir).toPath());
            writePokedex(game, dir, gson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writePokedex(Game game, String dir, Gson gson) throws IOException {
        if(game.getAdditionalPokedex().isEmpty()) return;
        var fileContents = new JsonObject();
        fileContents.addProperty("dexId", (game.getName().toLowerCase().contains("generation")? "cobblemon" : "gravelmon")+":"+game.getName());

        var entries = new JsonArray();
        for (int i = 0; i < game.getAdditionalPokedex().size(); i++) {
            var pokemon = game.getAdditionalPokedex().get(i);

            entries.add(pokemon);
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir +"\\" + GravelmonUtils.getCleanName(game.getName()) + ".json"));
        writer.write(gson.toJson(fileContents));
        writer.close();
    }
}
