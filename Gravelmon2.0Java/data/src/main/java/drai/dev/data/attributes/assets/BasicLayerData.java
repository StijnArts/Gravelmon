package drai.dev.data.attributes.assets;

import com.google.gson.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class BasicLayerData {
    String name;
    Optional<Boolean> emissive = Optional.empty();
    Optional<Boolean> translucent = Optional.empty();
    boolean considerGender = false;
    boolean considerShiny = false;

    public BasicLayerData(String name) {
        this.name = name;
    }

    public BasicLayerData(String name, Optional<Boolean> emissive, Optional<Boolean> translucent, boolean considerGender, boolean considerShiny) {
        this.name = name;
        this.emissive = emissive;
        this.translucent = translucent;
        this.considerGender = considerGender;
        this.considerShiny = considerShiny;
    }

    public JsonObject toJsonObject() {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", name);
        emissive.ifPresent(aBoolean -> jsonObject.addProperty("emissive", aBoolean));
        translucent.ifPresent(aBoolean -> jsonObject.addProperty("translucent", aBoolean));
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
