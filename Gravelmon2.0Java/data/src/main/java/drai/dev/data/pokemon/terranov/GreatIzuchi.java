package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class GreatIzuchi extends drai.dev.data.pokemon.Pokemon {
    public GreatIzuchi() {
        super("GreatIzuchi",
                Type.STEEL,
                new Stats(65,
                        90,
                        75,
                        60,
                        75,
                        100),
                List.of(Ability.INNER_FOCUS), Ability.INNER_FOCUS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They live in small groups, leading three other Izuchi. They are extremely intelligent and organized while hunting as they can perfectly coordenate their movement and attacks with each other."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Great Izuchi");

    }


}
