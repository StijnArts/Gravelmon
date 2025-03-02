package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cragrub extends drai.dev.data.pokemon.Pokemon {
    public Cragrub() {
        super("Cragrub",
                Type.BUG, Type.ROCK,
                new Stats(50,
                        30,
                        80,
                        10,
                        20,
                        10),
                List.of(Ability.ROCK_HEAD), Ability.SWARM,
                5, 113,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                40, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Cragrub");

    }


}
