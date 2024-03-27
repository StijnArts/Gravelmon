package drai.dev.gravelmon.pokemon.theos;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Tunnoworm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tunnoworm() {
        super("Burroworm",
                Type.BUG,Type.GROUND,
                new Stats(103,
                        92,
                        61,
                        50,
                        61,
                        108),
                List.of(Ability.EARTH_EATER), Ability.REGENERATOR,
                0, 0,
                new Stats(0,0,0,0,0,2), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Burroworm");

    }


}
