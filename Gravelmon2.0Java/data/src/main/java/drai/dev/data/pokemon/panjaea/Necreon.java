package drai.dev.data.pokemon.panjaea;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Necreon extends drai.dev.data.pokemon.Pokemon {
    public Necreon() {
        super("Necreon",
                Type.GHOST,
                new Stats(130,
                        60,
                        65,
                        95,
                        65,
                        110),
                List.of(Ability.SHADOW_TAG), Ability.REGENERATOR,
                10, 240,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PANJAEA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Necreon");

    }


}
