package drai.dev.data.attributes.assets;

import com.google.gson.*;
import drai.dev.data.pokemon.*;

public class SimpleTextureLayerData extends BasicLayerData {
    String textureName;

    public SimpleTextureLayerData(String name, String textureName) {
        super(name);
        this.textureName = textureName;
    }

    public SimpleTextureLayerData(String name, String textureName, boolean emissive, boolean translucent, boolean considerGender, boolean considerShiny) {
        super(name, emissive, translucent, considerGender, considerShiny);
        this.textureName = textureName;
    }

    public static BasicLayerData glowLayer(AbstractPokemon abstractPokemon) {
        return new SimpleTextureLayerData("glow", abstractPokemon.getCleanName()+"_emissive",
                true, true, false, true);
    }

    public JsonObject toJsonObject(AbstractPokemon abstractPokemon){
        return toJsonObject(abstractPokemon, false);
    }

    public JsonObject toJsonObject(AbstractPokemon abstractPokemon, boolean isShiny){
        return toJsonObject(abstractPokemon, isShiny, false);
    }

    public JsonObject toJsonObject(AbstractPokemon abstractPokemon, boolean isShiny, boolean isFemale){
        var json = super.toJsonObject();
        json.addProperty("texture", getTextureLocation(textureName, abstractPokemon, considerShiny, considerGender, isShiny, isFemale));
        return json;
    }
}
