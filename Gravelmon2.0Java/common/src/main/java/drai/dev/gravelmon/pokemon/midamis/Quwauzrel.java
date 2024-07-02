package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Quwauzrel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Quwauzrel() {
        super("Quwauzrel",
                Type.FLYING,
                new Stats(100,
                        75,
                        75,
                        75,
                        75,
                        75),
                List.of(Ability.MOODY), Ability.UNAWARE,
                16, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Even more bizarre than Kwauwk, this Pokemon is found rarely in the wild, racing across the land emitting unsettling cries. It’s said to wildly change type when startled."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NATURE_POWER,1),
                        new MoveLearnSetEntry(Move.SKETCH,7),
                        new MoveLearnSetEntry(Move.ASSIST,12),
                        new MoveLearnSetEntry(Move.MIMIC,17),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,22),
                        new MoveLearnSetEntry(Move.SECRET_POWER,27),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,37),
                        new MoveLearnSetEntry(Move.METRONOME,42),
                        new MoveLearnSetEntry(Move.LAST_RESORT,48),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,51),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 34, 56, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Quwauzrel");

    }


}
