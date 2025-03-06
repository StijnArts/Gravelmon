package drai.dev.data.pokemon.fabel;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ironcauldron extends drai.dev.data.pokemon.Pokemon {
    public Ironcauldron() {
        super("Ironcauldron",
                Type.GRASS,Type.FIRE,
                new Stats(152,
                        43,
                        67,
                        67,
                        204,
                        24),
                List.of(Ability.QUARK_DRIVE), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FABEL),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Iron cauldron");

    }


}
