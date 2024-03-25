package drai.dev.gravelmon.pokemon.otopo;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Smokwi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Smokwi() {
        super("Smokwi",
                Type.FIRE,
                new Stats(50,
                        58,
                        68,
                        74,
                        46,
                        104),
                List.of(Ability.CUTE_CHARM), Ability.BIG_PECKS,
                6, 103,
                new Stats(0,0,0,1,0,0), 160,
                0.5,
                72, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("Found in grassy areas surrounding volcanoes, Smokwi hunt and forrage for small bug-type Pokemon. It's long beak is sharp enough to pierce even the most dessicated earth."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Smokwi");

    }


}
