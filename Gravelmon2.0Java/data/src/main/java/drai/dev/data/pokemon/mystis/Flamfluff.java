package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flamfluff extends drai.dev.data.pokemon.Pokemon {
    public Flamfluff() {
        super("Flufflame",
                Type.FIRE, Type.FLYING,
                new Stats(55,
                        55,
                        65,
                        90,
                        65,
                        95),
                List.of(Ability.BLAZE), Ability.BOMBARDIER,
                0, 0,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Flufflame");

    }


}
