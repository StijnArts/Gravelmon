package drai.dev.data.games.registry;

import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;

import java.util.*;

public abstract class Game {
    protected String name;
    protected List<Pokemon> newPokemon = new ArrayList<>();
    protected List<String> pokedex = new ArrayList<>();
    protected List<String> additionalPokedexPokemon = new ArrayList<>();
    public Game(String name){
        this.name = name;
        registerPokemon();
    }
    public abstract void registerPokemon();
    public String getName(){
        return name;
    }

    public List<Pokemon> getNewPokemon(){
        return newPokemon;
    }
    public List<String> getPokedex(){
        return pokedex;
    }

    public void init(String resourcesDir) {
        newPokemon.forEach(pokemon -> {
                    pokemon.setGameName(this.getName());
                });
    }
    public void addNewPokemon(Pokemon pokemon){
        newPokemon.add(pokemon);
        if(Pokemon.isAnAdditionalForm(pokemon)) {
            pokedex.add("cobblemon:"+Pokemon.getKeysByValue(Pokemon.ADDITIONAL_FORMS, pokemon).stream().findFirst().get()+
                    "-"+pokemon.getAdditionalAspect().name().toLowerCase());
            return;
        }
        pokedex.add("cobblemon:"+pokemon.getCleanName());
    }

    public List<String> getAdditionalPokedex() {
        return additionalPokedexPokemon;
    }

    public void addPokedexPokemon(String... pokemonNames){
        for (int i = 0; i < pokemonNames.length; i++) {
            var name = pokemonNames[i];
            if(!name.contains(",")) pokedex.add("cobblemon:"+ name.trim());
            else {
                var splitEntries = name.split(",");
                for (int j = 0; j < splitEntries.length; j++) {
                    pokedex.add("cobblemon:"+ splitEntries[j].trim());
                }
            }
        }
    }

    public void removePokedexPokemon(String pokemonName) {
        pokedex.remove("cobblemon:"+pokemonName.toLowerCase().trim());
    }

    public String getCleanName(){
        return GravelmonUtils.getCleanName(name);
    }
}
