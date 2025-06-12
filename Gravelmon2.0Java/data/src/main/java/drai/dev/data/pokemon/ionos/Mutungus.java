package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mutungus extends drai.dev.data.pokemon.Pokemon {
    public Mutungus(Stats stats) {
        super("Mutungus",
                Type.POISON, Type.GRASS,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When a Mushi evolves into a Mutungus it does so forcefully. This is due to strong levels of radiation. The source of the high levels of radiation are unknown but scientists believe that it comes from outer space. Certain groups of people believe that a very powerful Pokémon is the source of these both invisible and dangerous forces."),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 56, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mutungus");

    }


}
