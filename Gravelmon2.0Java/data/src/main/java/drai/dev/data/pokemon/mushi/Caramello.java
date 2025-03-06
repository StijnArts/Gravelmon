package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Caramello extends drai.dev.data.pokemon.Pokemon {
    public Caramello() {
        super("Caramello",
                Type.FAIRY,
                new Stats(71,
                        60,
                        86,
                        60,
                        90,
                        23),
                List.of(Ability.GOOEY,Ability.STICKY_HOLD), Ability.UNAWARE,
                0, 0,
                new Stats(0,0,0,0,1,0), 120,
                0.5,
                138, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Caramello");

    }


}
