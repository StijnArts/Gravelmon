package drai.dev.gravelmon.games.registry;

import drai.dev.gravelmon.pokemon.*;

import java.util.*;

public abstract class Game {
    protected String name;
    protected List<Pokemon> pokemon = new ArrayList<>();
    public Game(String name){
        this.name = name;
        registerPokemon();
    }
    public abstract void registerPokemon();

    public String getName(){
        return name;
    }

    private boolean isInit = false;
    public List<Pokemon> getPokemon(){
        if(!isInit){
            pokemon.forEach(pokemon1 -> pokemon1.setGame(this));
        }
        return pokemon;
    }
}
