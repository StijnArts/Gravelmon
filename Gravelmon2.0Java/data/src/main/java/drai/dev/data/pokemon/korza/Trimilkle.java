package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Trimilkle extends drai.dev.data.pokemon.Pokemon {
    public Trimilkle() {
        super("Trimilkle",
                Type.WATER,
                new Stats(23,
                        65,
                        41,
                        32,
                        41,
                        98),
                List.of(Ability.WIMP_OUT,Ability.SWIFT_SWIM), Ability.STICKY_HOLD,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Trimilkle are shy mons, preferring to hide under rocks or in burrows. They're powerful swimmers, aided by the bubbly substance covering their bodies."),
                List.of(),
                List.of(                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Trimilkle");

    }


}