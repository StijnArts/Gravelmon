package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tolore extends drai.dev.data.pokemon.Pokemon {
    public Tolore() {
        super("Tolore",
                Type.DRAGON,Type.ELECTRIC,
                new Stats(45,
                        30,
                        45,
                        65,
                        60,
                        55),
                List.of(Ability.LIGHTNING_ROD,Ability.CLOUD_NINE), Ability.CUTE_CHARM,
                5, 70,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Dolls of this mon are a common children's toy. Tolore are nearly impossible to find in the wild, only observed during exceptionally powerful thunderstorms, playing in the downpour."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tolore");

    }


}
