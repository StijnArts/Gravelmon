package drai.dev.data.attributes.assets;

import com.google.gson.*;
import drai.dev.data.pokemon.*;

import java.util.*;
import java.util.function.*;

public class VariationData {
    Supplier<String> model, poser;
    String textureName;
    Map<String, BasicLayerData> layers = new HashMap<>();

    public VariationData(Supplier<String> model, Supplier<String> poser, String textureName, List<BasicLayerData> layers) {
        this.model = model;
        this.poser = poser;
        this.textureName = textureName;
        addLayers(layers);
    }

    private VariationData addLayers(List<BasicLayerData> layers) {
        for (BasicLayerData layer : layers) {
            addLayer(layer);
        }
        return this;
    }

    public VariationData addLayer(BasicLayerData layer) {
        if (this.layers.containsKey(layer.name)) return this;
        this.layers.put(layer.name, layer);
        return this;
    }

    public static VariationData fromPokemon(AbstractPokemon abstractPokemon, List<BasicLayerData> layers) {
        Supplier<String> identifier = () -> abstractPokemon.getGame().getCleanName() + "_" + abstractPokemon.getCleanName();
        Supplier<String> model = () -> abstractPokemon.isModeled() ? identifier.get() : abstractPokemon.getPlaceholderModelName(abstractPokemon);
        return new VariationData(model, identifier, abstractPokemon.getCleanName(), layers);
    }

    public JsonObject toJsonObject(List<String> aspects, AbstractPokemon abstractPokemon) {
        return toJsonObject(aspects, abstractPokemon, false, false);
    }

    public JsonObject toJsonObject(List<String> aspects, AbstractPokemon abstractPokemon, boolean isShiny, boolean isFemale) {
        addLayer(new BasicLayerData("glow"));
        addLayer(new BasicLayerData("emissive2"));
        addLayer(new BasicLayerData("emissive"));
        addLayer(new BasicLayerData("transparentEmissive"));
        addLayer(new BasicLayerData("transparent_emissive"));
        addLayer(new BasicLayerData("flame"));
        addLayer(new BasicLayerData("tail"));

        var jsonObject = new JsonObject();
        var aspectsArray = new JsonArray();
        aspects.forEach(aspectsArray::add);
        var hasGenderDifferences = false;
        if (abstractPokemon instanceof Pokemon pokemon) hasGenderDifferences = pokemon.hasGenderDifferences();
        var model = isFemale && hasGenderDifferences
                ? (!abstractPokemon.isModeled() ? abstractPokemon.getFemalePlaceholderModelName(abstractPokemon) : this.model.get())
                : this.model.get();
        jsonObject.add("aspects", aspectsArray);
        jsonObject.addProperty("model", "cobblemon:" + model + ".geo");
        jsonObject.addProperty("poser", "cobblemon:" + (abstractPokemon.isModeled() ? poser.get() : abstractPokemon.getPlaceholderModelName(abstractPokemon)));
        jsonObject.addProperty("texture", BasicLayerData.getTextureLocation(textureName, abstractPokemon, isShiny, isFemale));
        var layerArray = new JsonArray();
        layers.forEach((key, value) -> {
            if(value instanceof AnimatedLayerData animatedLayerData) {
                layerArray.add(animatedLayerData.toJsonObject(abstractPokemon, isShiny, isFemale));
                return;
            }
            if(value instanceof SimpleTextureLayerData simpleTextureLayerData) {
                layerArray.add(simpleTextureLayerData.toJsonObject(abstractPokemon, isShiny, isFemale));
                return;
            }
             layerArray.add(value.toJsonObject());
        });
        jsonObject.add("layers", layerArray);
        return jsonObject;
    }
}
