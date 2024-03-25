package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Burnslinger extends drai.dev.gravelmon.pokemon.Pokemon {
    public Burnslinger() {
        super("Burnslinger",
                Type.FIRE,Type.WATER,
                new Stats(60,
                        90,
                        90,
                        127,
                        71,
                        92),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 630,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                234, ExperienceGroup.MEDIUM_SLOW,
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
           setLangFileName("Burnslinger");

    }


}
