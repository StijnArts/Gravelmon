package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Crasquidor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crasquidor() {
        super("Crasquidor",
                Type.WATER, Type.GHOST,
                new Stats(70,
                        85,
                        60,
                        105,
                        70,
                        95),
                List.of(Ability.SWIFT_SWIM), Ability.LIMBER,
                14, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                170, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LICK,2),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,4),
                        new MoveLearnSetEntry(Move.WATER_PULSE,7),
                        new MoveLearnSetEntry(Move.HYPNOSIS,11),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,22),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,29),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,37),
                        new MoveLearnSetEntry(Move.RECOVER,46),
                        new MoveLearnSetEntry(Move.CRUNCH,50),
                        new MoveLearnSetEntry(Move.SOULCHOMP,56)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 35, 54, .04, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF, SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
        setCanSwim(true);
           setLangFileName("Crasquidor");

    }


}
