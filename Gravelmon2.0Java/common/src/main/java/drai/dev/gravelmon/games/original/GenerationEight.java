package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;

public class GenerationEight extends Original {
    public GenerationEight() {
        super("generation8");
    }

    @Override
    public void registerPokemon() {
          //Pokemon Blazing Emerald
        pokemon.add(new HoennianDreepy(885));
        pokemon.add(new HoennianDrakloak(886));
        pokemon.add(new HoennianDragapult(887));

        //Radical Red
        pokemon.add(new SeviianSizzlipede(850));
        pokemon.add(new SeviianCentiskorch(851));

    }
}
