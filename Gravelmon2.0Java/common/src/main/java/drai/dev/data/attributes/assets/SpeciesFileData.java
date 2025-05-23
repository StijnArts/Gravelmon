package drai.dev.data.attributes.assets;

import com.google.gson.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class SpeciesFileData {
    WorldRepresentablePokemon pokemon;
    public List<VariationData> variations = new ArrayList<>();

    public SpeciesFileData(WorldRepresentablePokemon pokemon) {
        this.pokemon = pokemon;
    }

    public JsonObject toJsonObject(String species, int order, List<String> aspects, WorldRepresentablePokemon abstractPokemon){
        var jsonObject = new JsonObject();
        jsonObject.addProperty("species", "cobblemon:" + species);
        jsonObject.addProperty("order", order);
        var variationsArray = new JsonArray();
        variations.forEach((variation) -> {
            variationsArray.add(variation.toJsonObject(aspects));
            if(abstractPokemon.isModeled()){
                var shinyAspects = new ArrayList<>(aspects);
                shinyAspects.add("shiny");
                variationsArray.add(variation.toJsonObject(shinyAspects, true, false));
            }

            if(abstractPokemon instanceof Pokemon pokemon && pokemon.hasGenderDifferences()) {
                var femaleAspects = new ArrayList<>(aspects);
                femaleAspects.add("female");
                variationsArray.add(variation.toJsonObject(femaleAspects, false, true));
                if(abstractPokemon.isModeled()){
                    var femaleShinyAspects = new ArrayList<>(aspects);
                    femaleShinyAspects.add("female");
                    femaleShinyAspects.add("shiny");
                    variationsArray.add(variation.toJsonObject(femaleShinyAspects, true, true));
                }
            }
        });


        jsonObject.add("variations", variationsArray);
        return jsonObject;
    }

    public VariationData addBasicVariation(String modelers) {
        return addBasicVariation(modelers, modelers);
    }

    public VariationData addBasicVariation(String modelers, String textureArtist) {
        this.pokemon.markReady();
        var variation = VariationData.fromPokemon(pokemon, List.of());
        variations.add(variation);
        pokemon.getModelMetaData().getModelers().add(modelers);
        pokemon.getModelMetaData().getTextureArtists().add(textureArtist);
        return variation;
    }
}
