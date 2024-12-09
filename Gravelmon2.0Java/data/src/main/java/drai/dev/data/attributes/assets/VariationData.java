package drai.dev.data.attributes.assets;

import com.google.gson.*;
import drai.dev.data.pokemon.*;

import java.util.*;

import static drai.dev.data.pokemon.WorldRepresentablePokemon.getGame;

public class VariationData {
    String model, poser, textureName;
    List<BasicLayerData> layers = new ArrayList<>();

    public VariationData(String model, String poser, String textureName, List<BasicLayerData> layers) {
        this.model = model;
        this.poser = poser;
        this.textureName = textureName;
        this.layers.addAll(layers);
    }

    public static VariationData fromPokemon(AbstractPokemon abstractPokemon, List<BasicLayerData> layers){
        var game = getGame(abstractPokemon);
        var identifier = game.getCleanName()+"_"+abstractPokemon.getCleanName();
        var model = abstractPokemon.isModeled() ? identifier : abstractPokemon.getPlaceholderModelName();
        return new VariationData(model, identifier, abstractPokemon.getCleanName(), layers);
    }

    public JsonObject toJsonObject(List<String> aspects, AbstractPokemon abstractPokemon) {
        return toJsonObject(aspects, abstractPokemon, false, false);
    }

    public JsonObject toJsonObject(List<String> aspects, AbstractPokemon abstractPokemon, boolean isShiny, boolean isFemale) {
        if(!abstractPokemon.isModeled()) {
            layers.add(new BasicLayerData("glow"));
            layers.add(new BasicLayerData("emissive2"));
            layers.add(new BasicLayerData("emissive"));
            layers.add(new BasicLayerData("transparentEmissive"));
            layers.add(new BasicLayerData("flame"));
            layers.add(new BasicLayerData("tail"));
        }
        var jsonObject = new JsonObject();
        var aspectsArray = new JsonArray();
        aspects.forEach(aspectsArray::add);
        var hasGenderDifferences = false;
        if(abstractPokemon instanceof Pokemon pokemon) hasGenderDifferences = pokemon.hasGenderDifferences();
        var model = abstractPokemon.isModeled() && isFemale && hasGenderDifferences ? abstractPokemon.getFemalePlaceholderModelName() : this.model;
        jsonObject.add("aspects", aspectsArray);
        jsonObject.addProperty("model", "cobblemon:"+ model+".geo");
        jsonObject.addProperty("poser", "cobblemon:"+ poser);
        jsonObject.addProperty("textureName", BasicLayerData.getTextureLocation(textureName, abstractPokemon, isShiny, isFemale));
        var layerArray = new JsonArray();
        layers.forEach(layer -> layerArray.add(layer.toJsonObject()));
        jsonObject.add("layers", layerArray);
        return jsonObject;
    }
}
