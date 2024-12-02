package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sneacroach extends drai.dev.data.pokemon.Pokemon {
    public Sneacroach() {
        super("Sneacroach",
                Type.DARK, Type.NORMAL,
                new Stats(35,
                        65,
                        65,
                        45,
                        50,
                        85),
                List.of(Ability.RATTLED,Ability.FRISK), Ability.PRANKSTER,
                0, 0,
                new Stats(0,0,0,0,0,1), 120,
                0.5,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sneacroach");

    }


}
