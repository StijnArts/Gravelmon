package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flamino extends drai.dev.data.pokemon.Pokemon {
    public Flamino() {
        super("Flamino",
                Type.FIRE, Type.STEEL,
                new Stats(65,
                        80,
                        85,
                        15,
                        35,
                        30),
                List.of(Ability.BLAZE), Ability.BLAZE,
                7, 194,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Flamino");

    }


}
