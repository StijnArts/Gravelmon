package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Anu extends drai.dev.data.pokemon.Pokemon {
    public Anu(Stats stats) {
        super("Anu",
                Type.DARK, Type.PSYCHIC,
                stats,
                List.of(Ability.QUICK_FEET), Ability.QUICK_FEET,
                4, 14,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Concept, design, sprite, type, and dex flavor by Princess-Phoenix Name by Dawn23 This fakemon originates from Princess-Phoenix's 'Project Freemon' on DeviantArt. Evo line: Incomplete"),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Anu");

    }


}
