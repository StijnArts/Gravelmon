package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stonk extends drai.dev.data.pokemon.Pokemon {
    public Stonk() {
        super("Stonk",
                Type.ROCK,Type.POISON,
                new Stats(35,
                        32,
                        126,
                        47,
                        42,
                        13),
                List.of(Ability.WHITE_SMOKE,Ability.OVERCOAT), Ability.STURDY,
                5, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                59, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Stonk emits a strong-smelling, poisonous fume from the top of its shell, which deters predators. Its shell is very sturdy and able to take a lot of hits."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Stonk");

    }


}
