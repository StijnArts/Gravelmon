package drai.dev.data.games.og;

import drai.dev.data.games.registry.*;
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
