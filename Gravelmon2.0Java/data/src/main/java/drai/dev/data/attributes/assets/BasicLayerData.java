package drai.dev.data.attributes.assets;

import com.google.gson.*;
import drai.dev.data.pokemon.*;

public class BasicLayerData {
    String name;
    boolean emissive = false;
    boolean translucent = false;
    boolean considerGender = false;
    boolean considerShiny = false;

    public BasicLayerData(String name) {
        this.name = name;
    }

    public BasicLayerData(String name, boolean emissive, boolean translucent, boolean considerGender, boolean considerShiny) {
        this.name = name;
        this.emissive = emissive;
        this.translucent = translucent;
        this.considerGender = considerGender;
        this.considerShiny = considerShiny;
    }

    public JsonObject toJsonObject() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("emissive", emissive);
        jsonObject.addProperty("translucent", translucent);
        return jsonObject;
    }

    public static String getTextureLocation(String textureName, AbstractPokemon abstractPokemon) {
        return getTextureLocation(textureName, abstractPokemon, false, false, false, false);
    }

    public static String getTextureLocation(String textureName, AbstractPokemon abstractPokemon, boolean isShiny, boolean isFemale) {
        return getTextureLocation(textureName, abstractPokemon, true, true, isShiny, isFemale);
    }

    public static String getTextureLocation(String textureName, AbstractPokemon abstractPokemon,
                                            boolean considerShiny, boolean considerGender, boolean isShiny, boolean isFemale) {
        return "cobblemon:textures/pokemon/" + abstractPokemon.getGame().getCleanName() +
                "/" + (abstractPokemon.isModeled() ? abstractPokemon.getCleanName()+"/" : "") + textureName + getAffixes(considerGender, considerShiny, isShiny, isFemale) + ".png";
    }

    private static String getAffixes(boolean considerGender, boolean considerShiny, boolean shiny, boolean female) {
        String affixes = "";
        if(considerGender && female)  affixes += "_female";
        if(considerShiny && shiny)  affixes += "_shiny";
        return affixes;
    }
}
