package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Icheon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Icheon() {
        super("Icheon",
                Type.SOUND,
                new Stats(110,
                        65,
                        60,
                        130,
                        95,
                        65),
                List.of(Ability.CACOPHONY,Ability.CUTE_CHARM), Ability.REVERB,
                10, 224,
                new Stats(0,0,0,2,0,0), 45,
                0.125,
                187, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Different parts of Icheon's body make different noises. This allows them to imitate almost any sound it has ever heard, including entire songs."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Icheon");

    }


}
