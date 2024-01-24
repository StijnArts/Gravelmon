package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Snowool extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snowool() {
        super("Snowool",
                Type.ICE,Type.NORMAL,
                new Stats(70,
                        61,
                        110,
                        70,
                        50,
                        40),
                List.of(Ability.SNOW_CLOAK,Ability.EARLY_BIRD,Ability.FUR_COAT), Ability.FUR_COAT,
                8, 165,
                new Stats(0,0,2,0,0,0), 78,
                0.5,
                122, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Snowool are treasured by the trainers who manage to raise them in the harsh climates. The scarf from Snowool is said to warm up anyone, regardless of how cold they were prior."),
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
           setLangFileName("Snowool");

    }


}
