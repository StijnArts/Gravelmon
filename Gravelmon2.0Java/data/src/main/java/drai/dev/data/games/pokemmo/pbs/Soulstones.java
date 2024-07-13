package drai.dev.data.games.pokemmo.pbs;


import drai.dev.data.pokemon.soulstones.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

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
