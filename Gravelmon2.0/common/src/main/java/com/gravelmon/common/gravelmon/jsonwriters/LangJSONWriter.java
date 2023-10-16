package com.gravelmon.common.gravelmon.jsonwriters;

import com.gravelmon.common.gravelmon.games.*;
import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;

import java.io.*;
import java.nio.file.*;

public class LangJSONWriter {
    private static String contents ="{\n";
    private static boolean isFirst=true;
    private static String dir = "C:\\Users\\Stijn\\Desktop\\Gravelmon\\packaging\\assets\\cobblemon\\lang\\";
    public static void writeLang(Game game) {
        game.getPokemon().forEach(pokemon -> {writePokemon(pokemon);});
    }

    public static void writePlaceholder(){
        EghoPokemon.placeholders.forEach(pokemon -> {writePokemon(pokemon);});
    }

    private static void writePokemon(Pokemon pokemon) {
        int dexEntryCounter = 1;
        if(pokemon.isNew()) {
            if (isFirst) {
                isFirst = false;
            } else {
                contents += ",\n";
            }
            if (pokemon.getLangFileName() != null) {
                contents += "    \"cobblemon.species." + pokemon.getCleanName() + ".name\": \"" + pokemon.getLangFileName() + "\",\n";
            } else {
                contents += "    \"cobblemon.species." + pokemon.getCleanName() + ".name\": \"" + pokemon.getName() + "\",\n";
            }

            for (String entry : pokemon.getDexEntries()) {
                contents += "    \"cobblemon.species." + pokemon.getCleanName() + ".desc" + dexEntryCounter + "\": \"" + entry + "\"";
                dexEntryCounter++;
            }
        }
        for (PokemonForm form : pokemon.getForms()){
            if (isFirst) {
                isFirst = false;
            } else {
                contents += ",\n";
            }
            contents+="    \"cobblemon.species."+form.getCleanName()+"_"+pokemon.getCleanName()+".name\": \""+pokemon.getName()+"\"";
            dexEntryCounter = 1;
            for (String entry : form.getDexEntries()){
                contents += ",\n    \"cobblemon.species."+form.getCleanName()+"_"+pokemon.getCleanName()+".desc"+dexEntryCounter+"\": \""+entry+"\"";
                dexEntryCounter++;
            }
        }
    }

    public static void finalizeLang(){
        contents+="\n}";
        try {
            Files.createDirectories(new File(dir).toPath());
            BufferedWriter writer = new BufferedWriter(new FileWriter(dir+"en_us.json"));
            writer.write(contents);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
