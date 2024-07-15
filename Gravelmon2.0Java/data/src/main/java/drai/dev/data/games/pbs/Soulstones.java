package drai.dev.data.games.pbs;


import drai.dev.data.pokemon.soulstones.*;

public class Soulstones extends drai.dev.data.games.registry.Game {
    public Soulstones() {
        super("Soulstones");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Galaxeon());
        pokemon.add(new Prismeon());
        pokemon.add(new Octaveon());
    }

}
