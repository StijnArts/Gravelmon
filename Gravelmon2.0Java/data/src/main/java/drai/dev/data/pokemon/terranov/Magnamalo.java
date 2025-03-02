package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Magnamalo extends drai.dev.data.pokemon.Pokemon {
    public Magnamalo() {
        super("Magnamalo",
                Type.GHOST,
                new Stats(75,
                        92,
                        60,
                        127,
                        92,
                        104),
                List.of(Ability.CURSED_BODY), Ability.CURSED_BODY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Magnamalo");

    }


}
