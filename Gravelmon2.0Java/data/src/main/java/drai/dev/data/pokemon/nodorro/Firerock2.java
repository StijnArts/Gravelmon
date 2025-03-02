package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Firerock2 extends drai.dev.data.pokemon.Pokemon {
    public Firerock2() {
        super("Firerock2",
                Type.ROCK, Type.FIRE,
                new Stats(75,
                        115,
                        125,
                        90,
                        100,
                        45),
                List.of(Ability.EVAPORATION), Ability.FIREPROOF,
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
           setLangFileName("Fire rock 2");

    }


}
