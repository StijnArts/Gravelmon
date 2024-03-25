package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Psyclaw extends drai.dev.gravelmon.pokemon.Pokemon {
    public Psyclaw() {
        super("Psyclaw",
                Type.PSYCHIC,
                new Stats(50,
                        60,
                        65,
                        90,
                        60,
                        50),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                131, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Psyclaw");

    }


}
