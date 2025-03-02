package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Charnosaur extends drai.dev.data.pokemon.Pokemon {
    public Charnosaur() {
        super("Charnosaur",
                Type.ROCK, Type.FIRE,
                new Stats(60,
                        110,
                        77,
                        106,
                        72,
                        96),
                List.of(Ability.BATTLE_ARMOR), Ability.WHITE_SMOKE,
                8, 165,
                new Stats(0,2,0,1,0,0), 45,
                0.875,
                182, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Charnosaur's smoke is as hot as fire itself. It can spew red-hot magma from its maw for self-defense."),
                List.of(),
                List.of(),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Charnosaur");

    }


}
