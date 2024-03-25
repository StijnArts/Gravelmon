package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Flintlaw extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flintlaw() {
        super("Flintlaw",
                Type.FIRE,Type.WATER,
                new Stats(40,
                        70,
                        60,
                        95,
                        55,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 357,
                new Stats(0,0,0,2,0,0), 90,
                0.5,
                130, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flintlaw");

    }


}
