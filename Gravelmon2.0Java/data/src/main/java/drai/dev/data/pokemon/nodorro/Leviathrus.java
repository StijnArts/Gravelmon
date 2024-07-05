package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Leviathrus extends drai.dev.data.pokemon.Pokemon {
    public Leviathrus() {
        super("Leviathrus",
                Type.WATER, Type.DRAGON,
                new Stats(80,
                        120,
                        100,
                        150,
                        120,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                68, 2600,
                new Stats(0,1,0,2,1,0), 5,
                0.0,
                300, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Leviathrus");

    }


}
