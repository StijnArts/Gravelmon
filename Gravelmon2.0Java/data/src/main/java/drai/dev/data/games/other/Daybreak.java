package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.daybreak.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Daybreak extends Game {
    public Daybreak() {
        super("Daybreak");
    }

    @Override
    public void registerPokemon() {
        var sandridger = new Sandridger();
        pokemon.add(sandridger);
        pokemon.add(new AlolanSandridger("", Aspect.ALOLAN));
    }
}
