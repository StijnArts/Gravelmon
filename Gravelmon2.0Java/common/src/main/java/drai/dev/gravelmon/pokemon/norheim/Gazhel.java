package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Gazhel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gazhel() {
        super("Gazhel",
                Type.DRAGON,Type.GHOST,
                new Stats(97,
                        117,
                        91,
                        97,
                        97,
                        71),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Gazhel (UB Entity) is an alarmingly grotesque Ultra Beast. It collects souls from different dimensions only to bring them back to its own realm."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CRUNCH,1),
                        new MoveLearnSetEntry(Move.STOMP,8),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,16),
                        new MoveLearnSetEntry(Move.GRUDGE,26),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,34),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,40),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,48),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,58),
                        new MoveLearnSetEntry(Move.HEX,68),
                        new MoveLearnSetEntry(Move.MEGAHORN,78),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,88),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,98)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gazhel");

    }


}
