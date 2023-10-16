package com.gravelmon.common.gravelmon.games;

import com.gravelmon.common.gravelmon.pokemon.insurgence.*;

public class Insurgence extends Game{
    public Insurgence() {
        super("insurgence");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new UFI(1100));
    }
}
