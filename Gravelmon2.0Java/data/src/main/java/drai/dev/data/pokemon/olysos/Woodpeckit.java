package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Woodpeckit extends drai.dev.data.pokemon.Pokemon {
    public Woodpeckit() {
        super("Woodpeckit",
                Type.NORMAL, Type.FLYING,
                new Stats(35,
                        60,
                        40,
                        30,
                        30,
                        60),
                List.of(Ability.KEEN_EYE,Ability.RIVALRY), Ability.SNIPER,
                4, 22,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                50, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Their nests consist mainly of nutshells. These are stuffed then with soft leaves for a comfortable hatching place."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Woodpeckit");

    }


}
