package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Skitter extends drai.dev.data.pokemon.Pokemon {
    public Skitter() {
        super("Skitter",
                Type.GROUND,
                new Stats(48,
                        53,
                        41,
                        30,
                        30,
                        70),
                List.of(Ability.SAND_VEIL,Ability.DRY_SKIN), Ability.SAND_FORCE,
                3, 45,
                new Stats(0,0,0,0,0,1), 220,
                0.5,
                54, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Skitter's tail can detach, distracting predators as it runs away; the tail grows back fast. As it moves, it bobs its body up and down, shaking the clods stored in its body."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FISSURE,1),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,1)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Skitter");

    }


}
