package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Streuming extends drai.dev.gravelmon.pokemon.Pokemon {
    public Streuming() {
        super("Streuming",
                Type.WATER,Type.ELECTRIC,
                new Stats(40,
                        60,
                        50,
                        60,
                        75,
                        95),
                List.of(Ability.INSOMNIA,Ability.SPEED_BOOST,Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The Gold Stream that brings warmth to Norheim and its surrounding islands are powered up by millions of Streuming. Agile and determined they swim, elegantly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                        new MoveLearnSetEntry(Move.PSYWAVE,6),
                        new MoveLearnSetEntry(Move.YAWN,8),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,14),
                        new MoveLearnSetEntry(Move.AQUA_JET,18),
                        new MoveLearnSetEntry(Move.AGILITY,20),
                        new MoveLearnSetEntry(Move.DISCHARGE,24),
                        new MoveLearnSetEntry(Move.AQUA_RING,28),
                        new MoveLearnSetEntry(Move.WATER_PULSE,32),
                        new MoveLearnSetEntry(Move.FLAIL,38),
                        new MoveLearnSetEntry(Move.LIQUIDATION,48),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,54),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Streuming");

    }


}