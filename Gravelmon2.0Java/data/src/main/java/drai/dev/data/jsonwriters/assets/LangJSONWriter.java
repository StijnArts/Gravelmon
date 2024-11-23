package drai.dev.data.jsonwriters.assets;

import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import org.apache.commons.lang3.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class LangJSONWriter {
    private static JsonObject contents = new JsonObject();
    private static String dir = "";
    public static void writeLang(Game game, String resourcesDir) {
        dir = resourcesDir;
        game.getNewPokemon().forEach(pokemon -> {writePokemon(pokemon);});
    }

    public static void writeStarterCategories(){
        GravelmonStarters.LANG_ENTRIES.forEach(LangJSONWriter::writeTranslationKey);
    }

    public static void writeTranslationKey(String key, String text){
        contents.addProperty(key,text);
    }

    public static void writePokedexRegion(Game game){
        contents.addProperty("cobblemon.ui.pokedex.region."+ GravelmonUtils.getCleanName(game.getName()),getNameForLang(game.getName()));
    }

    private static String getNameForLang(String name) {
        var splitName = name.split("(?=\\p{Upper})");
        StringBuilder builder = new StringBuilder();
        for(var split : splitName){
            builder.append(StringUtils.capitalize(split)).append(" ");
        }
        return builder.toString().trim();
    }

    public static void writeForm(Aspect aspect){
        var specialAspects = new HashMap<Aspect, String>();
        specialAspects.put(Aspect.MALE_X, "X (Male)");
        specialAspects.put(Aspect.FEMALE_X, "X (Female)");
        specialAspects.put(Aspect.CEFIRAN_ELECTRIC, "Cefiran (Electric)");
        specialAspects.put(Aspect.CEFIRAN_FIRE, "Cefiran (Fire)");
        specialAspects.put(Aspect.CEFIRAN_ICE, "Cefiran (Ice)");
        specialAspects.put(Aspect.DELTA_BERRY, "Delta (Berry)");
        specialAspects.put(Aspect.DELTA_CAKE, "Delta (Cake)");
        specialAspects.put(Aspect.DELTA_RUIN, "Delta (Ruin)");
        specialAspects.put(Aspect.DELTA_WATER, "Delta (Water)");
        specialAspects.put(Aspect.DELTA_SPIDER,  "Delta (Spider)");
        specialAspects.put(Aspect.DELTA_FAIRY,  "Delta (Fairy)");
        specialAspects.put(Aspect.DELTA_UNLEASHED,  "Delta (Unleashed)");
        specialAspects.put(Aspect.ALTERAN_SUMMER_COAT, "Alteran (Summer Coat");
        specialAspects.put(Aspect.ALTERAN_WINTER_COAT, "Alteran (Winter Coat");
        var name = specialAspects.containsKey(aspect) ? specialAspects.get(aspect) : StringUtils.capitalize(aspect.getName());
        contents.addProperty("cobblemon.ui.pokedex.info.form."+ GravelmonUtils.getCleanName(aspect.getName()),name);
    }

    private static void writePokemon(Pokemon pokemon) {
        int dexEntryCounter = 1;
        if(pokemon.isNew()) {

            if (pokemon.getLangFileName() != null) {
                contents.addProperty("cobblemon.species." + pokemon.getCleanName() + ".name", pokemon.getLangFileName());
            } else {
                contents.addProperty("cobblemon.species." + pokemon.getCleanName() + ".name", pokemon.getName());
            }

            if(!pokemon.getDexEntries().isEmpty()){
                for (String entry : pokemon.getDexEntries()) {
                    contents.addProperty("cobblemon.species." + pokemon.getCleanName() + ".desc", entry);
                    dexEntryCounter++;
                }
            }

        }
        for (PokemonForm form : pokemon.getForms()){
            contents.addProperty("cobblemon.species."+form.getCleanName()+"_"+pokemon.getCleanName()+".name", pokemon.getName());
            dexEntryCounter = 1;
            if(pokemon.getDexEntries().size() > 0) {
                for (String entry : form.getDexEntries()) {
                    contents.addProperty("cobblemon.species." + form.getCleanName() + "_" + pokemon.getCleanName() + ".desc" + dexEntryCounter, entry);
                    dexEntryCounter++;
                }
            }
        }
    }

    public static void finalizeLang(String resourcesDir){
        for (var aspect : Aspect.values()) writeForm(aspect);
        try {
            Files.createDirectories(new File(resourcesDir+"\\assets\\cobblemon\\lang").toPath());
            var gson = new GsonBuilder().setPrettyPrinting().create();
            BufferedWriter writer = new BufferedWriter(new FileWriter(resourcesDir+"\\assets\\cobblemon\\lang\\en_us.json"));
            writer.write(gson.toJson(contents));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
