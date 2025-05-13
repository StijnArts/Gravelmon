package drai.dev.data.attributes.assets;

import com.google.gson.*;
import drai.dev.data.pokemon.*;

import java.util.*;

import static drai.dev.data.pokemon.AbstractPokemon.MEGA_EVOLUTIONS;

public class SpeciesFileData {
    public List<VariationData> variations = new ArrayList<>();

    public JsonObject toJsonObject(String species, int order, List<String> aspects, WorldRepresentablePokemon abstractPokemon){
        var jsonObject = new JsonObject();
        jsonObject.addProperty("species", "cobblemon:" + species);
        jsonObject.addProperty("order", order);
        var variationsArray = new JsonArray();
        variations.forEach((variation) -> {
            variationsArray.add(variation.toJsonObject(aspects, abstractPokemon));
            if(abstractPokemon.isModeled()){
                var shinyAspects = new ArrayList<>(aspects);
                shinyAspects.add("shiny");
                variationsArray.add(variation.toJsonObject(shinyAspects, abstractPokemon, true, false));
            }

            if(abstractPokemon instanceof Pokemon pokemon && pokemon.hasGenderDifferences()) {
                var femaleAspects = new ArrayList<>(aspects);
                femaleAspects.add("female");
                variationsArray.add(variation.toJsonObject(femaleAspects, abstractPokemon, false, true));
                if(abstractPokemon.isModeled()){
                    var femaleShinyAspects = new ArrayList<>(aspects);
                    femaleShinyAspects.add("female");
                    femaleShinyAspects.add("shiny");
                    variationsArray.add(variation.toJsonObject(femaleShinyAspects, abstractPokemon, true, true));
                }
            }
        });


        jsonObject.add("variations", variationsArray);
        return jsonObject;
    }

    public VariationData addBasicVariation(AbstractPokemon abstractPokemon) {
        var variation = VariationData.fromPokemon(abstractPokemon, List.of());
        variations.add(variation);
        return variation;
    }
}
