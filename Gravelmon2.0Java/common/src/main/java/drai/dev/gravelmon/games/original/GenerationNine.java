package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.xenoverse.regional.*;

public class GenerationNine extends Original {
    public GenerationNine() {
        super("generation9");
    }

    @Override
    public void registerPokemon() {
        //Radical Red
        pokemon.add(new SeviianNymble(919));
        pokemon.add(new SeviianLokix(920));
    }
}
