package drai.dev.data.jsonwriters.assets;

import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;

import java.io.*;
import java.nio.file.*;

public class PoserJSONWriter {
    public static void writeSpecies(Game game, String resourcesDir){
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String dir = resourcesDir+"\\assets\\cobblemon\\bedrock\\pokemon\\posers\\";
        game.getNewPokemon().forEach(pokemon -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writePokemon(pokemon, game, dir, gson);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void writePokemon(Pokemon pokemon, Game game, String dir, Gson gson) throws IOException {
        createPoserFile(pokemon.getPosingFileData(), pokemon.getCleanName(), game, dir, gson);
        for(PokemonForm form: pokemon.getForms()){
            createPoserFile(form.getPosingFileData(), form.getCleanName()+"_"+pokemon.getCleanName(), game, dir, gson);
        }
    }

    private static void createPoserFile(PosingFileData posingFileData, String name, Game game, String dir, Gson gson) throws IOException {
        var poserJson = posingFileData.getPosesJson();
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + game.getName().toLowerCase() + "_" + name + ".json"));
        writer.write(gson.toJson(poserJson));
        writer.close();
    }
}
