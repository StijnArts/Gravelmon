package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Sharcleave extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sharcleave() {
        super("Sharcleave",
                Type.GRASS,Type.STEEL,
                new Stats(82,
                        130,
                        71,
                        61,
                        84,
                        102),
                List.of(Ability.OVERGROW), Ability.SHARPNESS,
                19, 440,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Its large dorsal fin is its main weapon, and grows sharper and sturdier with sunlight. It is an apex predator capable of stalking and hunting its prey even in water and treetops."),
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
           setLangFileName("Sharcleave");

    }


}
