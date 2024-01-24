package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Disgaze extends drai.dev.gravelmon.pokemon.Pokemon {
    public Disgaze() {
        super("Disgaze",
                Type.GROUND,Type.POISON,
                new Stats(51,
                        61,
                        35,
                        37,
                        71,
                        45),
                List.of(Ability.SHED_SKIN), Ability.MOLD_BREAKER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Disgaze trick and catch prey by swinging it's spider-like tail high in the air, baiting bird-Pokemon to swoop down while striking them at the last second."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Disgaze");

    }


}
