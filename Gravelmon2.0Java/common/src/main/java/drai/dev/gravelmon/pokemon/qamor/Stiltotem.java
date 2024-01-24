package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Stiltotem extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stiltotem() {
        super("Stiltotem",
                Type.GRASS,
                new Stats(66,
                        92,
                        70,
                        54,
                        90,
                        72),
                List.of(Ability.LONG_REACH), Ability.LONG_REACH,
                8, 165,
                new Stats(0,0,1,0,1,0), 70,
                0.5,
                165, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MINERAL),
                List.of("Stiltotem latch onto tall sugarcane stalks and use them to walk high above others, keeping watchful eyes on the ground below. Native people used this Pokemon to watch over crop fields and villages over night, keeping thieves or predatory Pokemon away."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEAF_BLADE,1)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stiltotem");

    }


}
