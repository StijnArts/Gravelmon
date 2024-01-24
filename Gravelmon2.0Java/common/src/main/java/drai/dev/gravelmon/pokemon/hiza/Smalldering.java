package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Smalldering extends drai.dev.gravelmon.pokemon.Pokemon {
    public Smalldering() {
        super("Smalldering",
                Type.FIRE,Type.POISON,
                new Stats(40,
                        44,
                        95,
                        26,
                        85,
                        15),
                List.of(Ability.POISON_POINT), Ability.WATER_ABSORB,
                8, 165,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                61, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Those affected by its poison will feel an intense fever afterwards, however it is not an aggressive Pokemon and won't attack unless its cornered."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Smalldering");

    }


}
