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
        game.getNewPokemon().forEach(pokemon -> {
            try {
                Files.createDirectories(new File(getDir(resourcesDir)).toPath());
                writePokemon(pokemon, game, resourcesDir, gson);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void writePokemon(Pokemon pokemon, Game game, String resourcesDir, Gson gson) throws IOException {
        if(pokemon.isModeled()) createPoserFile(pokemon.getPosingFileData(),game.getName().toLowerCase() + "_" + pokemon.getCleanName(), resourcesDir, gson);
        for(PokemonForm form: pokemon.getForms()){
            if(!form.isModeled()) continue;
            createPoserFile(form.getPosingFileData(), game.getName().toLowerCase() + "_" +form.getCleanName()+"_"+pokemon.getCleanName(), resourcesDir, gson);
        }
    }

    public static void createPoserFile(PosingFileData posingFileData, String name, String resourcesDir, Gson gson) throws IOException {
        var poserJson = posingFileData.getPosesJson();
        BufferedWriter writer = new BufferedWriter(new FileWriter(getDir(resourcesDir) + name + ".json"));
        writer.write(gson.toJson(poserJson));
        writer.close();
    }

    public static String getDir(String resourcesDir){
        return resourcesDir+"\\assets\\cobblemon\\bedrock\\pokemon\\posers\\";
    }
}
