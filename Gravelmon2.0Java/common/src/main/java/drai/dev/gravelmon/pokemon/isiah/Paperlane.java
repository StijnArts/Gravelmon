package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Paperlane extends drai.dev.gravelmon.pokemon.Pokemon {
    public Paperlane() {
        super("Paperlane",
                Type.NORMAL,Type.FLYING,
                new Stats(50,
                        80,
                        30,
                        45,
                        40,
                        95),
                List.of(Ability.HYPER_CUTTER), Ability.STEADFAST,
                8, 165,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                119, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Paperlane");

    }


}
