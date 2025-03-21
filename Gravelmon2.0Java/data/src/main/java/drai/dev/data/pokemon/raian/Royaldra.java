package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Royaldra extends drai.dev.data.pokemon.Pokemon {
    public Royaldra(Stats stats) {
        super("Rh5royaldra",
                Type.WATER,Type.FAIRY,
                stats,
                List.of(Ability.ROYALBLOOD), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Rh5royaldra");

    }


}
