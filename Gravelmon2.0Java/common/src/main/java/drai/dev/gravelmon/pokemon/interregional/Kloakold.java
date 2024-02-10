package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Kloakold extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kloakold() {
        super("Kloakold",
                Type.ICE,Type.FAIRY,
                new Stats(60,
                        60,
                        80,
                        110,
                        85,
                        90),
                List.of(Ability.TEARYEYED), Ability.INSOMNIA,
                14, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.DISABLE,4),
                        new MoveLearnSetEntry(Move.ICE_SHARD,8),
                        new MoveLearnSetEntry(Move.SPITE,12),
                        new MoveLearnSetEntry(Move.ICY_WIND,16),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,20),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,24),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,28),
                        new MoveLearnSetEntry(Move.ICE_BEAM,32),
                        new MoveLearnSetEntry(Move.IMPRISON,36),
                        new MoveLearnSetEntry(Move.MIST,40),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,44),
                        new MoveLearnSetEntry(Move.FREEZEDRY,48),
                        new MoveLearnSetEntry(Move.BLIZZARD,52)
                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 42, 58, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.IS_RAINING,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kloakold");

    }


}
