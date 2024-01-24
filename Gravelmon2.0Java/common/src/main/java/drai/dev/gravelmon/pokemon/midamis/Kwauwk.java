package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Kwauwk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kwauwk() {
        super("Kwauwk",
                Type.FLYING,
                new Stats(50,
                        50,
                        50,
                        50,
                        50,
                        50),
                List.of(Ability.MOODY), Ability.UNAWARE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("These Pokemon are well-known for their odd assortment of attack types. Kwauwk is said to shift type entirely when they lose focus, but this has been unproven."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NATURE_POWER,1),
                        new MoveLearnSetEntry(Move.SKETCH,7),
                        new MoveLearnSetEntry(Move.ASSIST,12),
                        new MoveLearnSetEntry(Move.MIMIC,17),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,22),
                        new MoveLearnSetEntry(Move.SECRET_POWER,27),
                        new MoveLearnSetEntry(Move.PSYCH_UP,32),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,37),
                        new MoveLearnSetEntry(Move.METRONOME,42),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kwauwk");

    }


}
