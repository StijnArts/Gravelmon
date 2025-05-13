package drai.dev.data.jsonwriters.assets;

import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;

import java.io.*;
import java.nio.file.*;

import static drai.dev.data.pokemon.AbstractPokemon.MEGA_EVOLUTIONS;

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

    public static void writeMegas(String resourcesDir){
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        MEGA_EVOLUTIONS.values().forEach(megas -> {
            try {
            Files.createDirectories(new File(getDir(resourcesDir)).toPath());
            megas.forEach(mega -> {
                try {
                    writePokemon(mega, mega.getGame(), resourcesDir, gson);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void writePokemon(WorldRepresentablePokemon worldRepresentablePokemon, Game game, String resourcesDir, Gson gson) throws IOException {
        if(worldRepresentablePokemon.isModeled()) createPoserFile(worldRepresentablePokemon.getPosingFileData(),game.getName().toLowerCase() + "_" + worldRepresentablePokemon.getCleanName(), resourcesDir, gson);
        if(worldRepresentablePokemon instanceof Pokemon pokemon){
            for(PokemonForm form: pokemon.getForms()){
                if(!form.isModeled()) continue;
                createPoserFile(form.getPosingFileData(), game.getName().toLowerCase() + "_" +form.getCleanName()+"_"+worldRepresentablePokemon.getCleanName(), resourcesDir, gson);
            }
        }

    }

    public static void createPoserFile(PosingFileData posingFileData, String name, String resourcesDir, Gson gson) throws IOException {
        var poserJson = posingFileData.getPosesJson();
        Files.createDirectories(new File(getDir(resourcesDir)).toPath());
        BufferedWriter writer = new BufferedWriter(new FileWriter(getDir(resourcesDir) + name + ".json"));
        writer.write(gson.toJson(poserJson));
        writer.close();
    }

    public static String getDir(String resourcesDir){
        return resourcesDir+"\\assets\\cobblemon\\bedrock\\pokemon\\posers\\";
    }
}
