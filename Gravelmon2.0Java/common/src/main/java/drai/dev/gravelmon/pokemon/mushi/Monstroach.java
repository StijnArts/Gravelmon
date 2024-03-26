package drai.dev.gravelmon.pokemon.mushi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Monstroach extends drai.dev.gravelmon.pokemon.Pokemon {
    public Monstroach() {
        super("Monstroach",
                Type.DARK,Type.NORMAL,
                new Stats(77,
                        90,
                        105,
                        50,
                        63,
                        115),
                List.of(Ability.RATTLED,Ability.FRISK), Ability.PRANKSTER,
                0, 0,
                new Stats(0,0,1,0,0,2), 30,
                0.5,
                177, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Monstroach");

    }


}
