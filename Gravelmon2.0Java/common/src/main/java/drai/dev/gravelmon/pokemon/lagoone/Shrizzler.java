package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Shrizzler extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shrizzler() {
        super("Shrizzler",
                Type.FIRE,Type.WATER,
                new Stats(35,
                        50,
                        44,
                        69,
                        42,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 122,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                55, ExperienceGroup.MEDIUM_SLOW,
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
           setLangFileName("Shrizzler");

    }


}
