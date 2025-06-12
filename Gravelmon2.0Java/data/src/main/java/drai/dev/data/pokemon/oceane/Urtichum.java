package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Urtichum extends drai.dev.data.pokemon.Pokemon {
    public Urtichum() {
        super("Urtichum",
                Type.POISON,
                new Stats(72,
                        88,
                        115,
                        54,
                        85,
                        34),
                List.of(Ability.POISON_POINT), Ability.POISON_POINT,
                5, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                157, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("If all its spines are broken off, it can release a cloud of poison from its posterior."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EXPLOSION,1),
                        new MoveLearnSetEntry(Move.GYRO_BALL,1),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,1),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 19, 32, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN, Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
