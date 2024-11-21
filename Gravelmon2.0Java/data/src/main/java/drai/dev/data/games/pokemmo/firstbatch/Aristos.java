package drai.dev.data.games.pokemmo.firstbatch;

import drai.dev.data.pokemon.aristos.*;

public class Aristos extends drai.dev.data.games.registry.Game {
    public Aristos() {
        super("Aristos");
    }

    @Override
    public void registerPokemon() {


        addNewPokemon(new Lanidos());
        addNewPokemon(new Ramvolt());
//        pokemon.add(new Tuckle()); Missing Art
        addNewPokemon(new Achiefd());
//        pokemon.add(new Probotheos()); Missing Art
        addNewPokemon(new Kamurados());
        addNewPokemon(new Weeduza());
        addNewPokemon(new Tangorgon());
//        pokemon.add(new Soulix()); Missing Art
//        pokemon.add(new Fledjed()); Missing Art
        addNewPokemon(new Kangazad());
//        pokemon.add(new Paloarmo()); Missing Art Renamed from Pharoar
        addNewPokemon(new EPP_v11());
//        pokemon.add(new Cactrian()); Missing Art
//        pokemon.add(new Spiribloom()); Missing Art
//        pokemon.add(new Zoongus()); Missing Art
        addNewPokemon(new Kvadract());
        addNewPokemon(new Navatoria());
        addNewPokemon(new Sabroast());
    }

}
