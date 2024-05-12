package drai.dev.gravelmon.games;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.daybreak.*;
import drai.dev.gravelmon.pokemon.daybreak.regional.*;

public class Daybreak extends Game {
    public Daybreak() {
        super("Daybreak");
    }

    @Override
    public void registerPokemon() {
        var sandridger = new Sandridger();
        pokemon.add(sandridger);
        pokemon.add(new AlolanSandridger(sandridger.getPokedexNumber()));
    }
}
