package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Therasloth extends drai.dev.gravelmon.pokemon.Pokemon {
    public Therasloth() {
        super("Therasloth",
                Type.ROCK,Type.NORMAL,
                new Stats(77,
                        68,
                        57,
                        51,
                        57,
                        40),
                List.of(Ability.TOUGH_CLAWS,Ability.RUN_AWAY,Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                8, 165,
                new Stats(1,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Therasloth are awfully lazy, and never lift a finger unless their life is threatened. They can sleep for an upwards of 20 hours. With their tough claws, they hallow out trees to store their food in preparation for scarce winters."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Therasloth");

    }


}
