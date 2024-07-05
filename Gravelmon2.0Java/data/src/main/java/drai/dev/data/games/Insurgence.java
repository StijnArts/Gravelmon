package drai.dev.data.games;

import drai.dev.data.games.registry.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.insurgence.*;

public class Insurgence extends Game {
    public Insurgence() {
        super("insurgence");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new UFI());
    }
}
