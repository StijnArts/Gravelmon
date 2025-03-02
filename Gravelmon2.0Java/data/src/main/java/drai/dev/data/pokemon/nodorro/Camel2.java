package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Camel2 extends drai.dev.data.pokemon.Pokemon {
    public Camel2() {
        super("Camel2",
                Type.GROUND, Type.GRASS,
                new Stats(100,
                        75,
                        100,
                        61,
                        130,
                        34),
                List.of(Ability.WATER_ABSORB,Ability.SAND_VEIL), Ability.CHLOROPHYLL,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Camel 2");

    }


}
