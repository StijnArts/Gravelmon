package com.gravelmon.common.gravelmon.games;

import com.gravelmon.common.gravelmon.pokemon.*;

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

    public List<Pokemon> getPokemon(){
        return pokemon;
    }
}
