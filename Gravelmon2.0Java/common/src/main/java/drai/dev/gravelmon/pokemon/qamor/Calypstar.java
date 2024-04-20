package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Calypstar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Calypstar() {
        super("Calypstar",
                Type.GROUND, Type.WATER,
                new Stats(112,
                        72,
                        72,
                        72,
                        72,
                        52),
                List.of(Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                6, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                158, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of("As Calypstar grow, their durable and colorful shells start losing pigment and decalcifies, causing them to become brittle and dull in color. Their discarded shells make very popular souvenirs, a Calypstar shell is so iconic to the region that Qamor's coin currencies contain the depiction of Calypstar's titular star."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LIQUEFACTION,1),
                        new MoveLearnSetEntry(Move.TICKLE,5),
                        new MoveLearnSetEntry(Move.WATER_GUN,9),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,12),
                        new MoveLearnSetEntry(Move.BUG_BITE,16),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.MUD_BOMB,26),
                        new MoveLearnSetEntry(Move.PAY_DAY,30),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,36),
                        new MoveLearnSetEntry(Move.DIG,39),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,43),
                        new MoveLearnSetEntry(Move.LIQUIDATION,47),
                        new MoveLearnSetEntry(Move.LIQUEFACTION,50),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,53),
                        new MoveLearnSetEntry(Move.ME_FIRST,58),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,60),
                        new MoveLearnSetEntry(Move.FISSURE,63),
                        new MoveLearnSetEntry(Move.BOMBSHELL,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 9, 34, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
