package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rebone extends drai.dev.data.pokemon.Pokemon {
    public Rebone() {
        super("Rebone",
                Type.DRAGON, Type.GHOST,
                new Stats(70,
                        95,
                        50,
                        35,
                        50,
                        50),
                List.of(Ability.CURSED_BODY), Ability.CURSED_BODY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Reborn+Bone"),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Rebone");

    }


}
