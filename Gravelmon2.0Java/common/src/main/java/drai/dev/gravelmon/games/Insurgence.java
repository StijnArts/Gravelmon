package drai.dev.gravelmon.games;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.insurgence.*;

public class Insurgence extends Game {
    public Insurgence() {
        super("insurgence");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new UFI());
    }
}
