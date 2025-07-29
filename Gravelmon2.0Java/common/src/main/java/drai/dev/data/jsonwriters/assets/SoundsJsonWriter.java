package drai.dev.data.jsonwriters.assets;

import com.google.gson.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;

import java.io.*;
import java.nio.file.*;

public class SoundsJsonWriter {
    private static final JsonObject contents = new JsonObject();
    public static void writeCries(Game game, String resourcesDir){
        String dir = resourcesDir + "\\assets\\gravelmon\\sounds\\pokemon\\" + game.getCleanName();
        try {
            Files.createDirectories(new File(dir).toPath());
        } catch (IOException e) {
            System.out.println("failed to create directory: " + e.getMessage());
        }
        game.getNewPokemon().forEach(pokemon -> {
            var isAdditionalForm = Pokemon.isAnAdditionalForm(pokemon);
            String cleanName = pokemon.getCleanName();
            if(isAdditionalForm) cleanName = pokemon.getAdditionalFormKey();

            String soundSource = cleanName;
            if(isAdditionalForm){
                soundSource +="_"+pokemon.getAdditionalAspect().getName().toLowerCase();
            }
            var sound = new JsonObject();
            var sounds = new JsonArray();
            var cry = new JsonObject();

            String soundFilePath = "gravelmon:" + "pokemon/" + game.getCleanName() + "/";
            String soundFileName = soundSource + "_cry";
            if(pokemon.usesDefaultCry()){
                soundFilePath = soundFilePath.replaceAll("gravelmon", "cobblemon").replaceAll(game.getCleanName(), cleanName);
                soundFileName = cleanName + "_cry";
            } else {
                var soundFileExists = new File(dir+"\\" + soundFileName +".ogg").exists();
                if(!soundFileExists && !pokemon.isModeled()) return;
            }
            soundFilePath += soundFileName;
            cry.addProperty("name", soundFilePath);
            cry.addProperty("volume", 0.8d);
            sounds.add(cry);
            sound.add("sounds", sounds);

            contents.add("pokemon."+ soundSource +".cry", sound);
        });
    }

    public static void finalizeSounds(String resourcesDir){
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String dir = resourcesDir + "\\assets\\cobblemon";
        try {
            Files.createDirectories(new File(dir).toPath());
            BufferedWriter writer = new BufferedWriter(new FileWriter(dir+"\\sounds.json"));
            writer.write(gson.toJson(contents));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
