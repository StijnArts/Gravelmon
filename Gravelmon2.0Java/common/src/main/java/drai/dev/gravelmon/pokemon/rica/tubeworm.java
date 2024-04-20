package drai.dev.gravelmon.pokemon.rica;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class tubeworm extends drai.dev.gravelmon.pokemon.Pokemon {
    public tubeworm() {
        super("tubeworm",
                Type.FIRE, Type.GHOST,
                new Stats(40,
                        40,
                        110,
                        150,
                        90,
                        20),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                8, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                158, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.WATER_3),
                List.of("- SingeSTAB Fire - Withdraw Water 8 Poison Gas Poison 13 Spite Ghost 17 Will-O-Wisp Fire 21 Phantom ForceSTAB Ghost 25 Confuse Ray Ghost 29 Lava PlumeSTAB Fire 34 Destiny Bond Ghost 39 Scald Water 43 Shadow BallSTAB Ghost 48 Poison Burst Poison 54 OverheatSTAB Fire 59 Gravity Psychic 66 EruptionSTAB Fire"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,8),
                        new MoveLearnSetEntry(Move.SPITE,13),
                        new MoveLearnSetEntry(Move.WILLOWISP,17),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,21),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,25),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,29),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,34),
                        new MoveLearnSetEntry(Move.SCALD,39),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,43),
                        new MoveLearnSetEntry(Move.POISONBURST,48),
                        new MoveLearnSetEntry(Move.OVERHEAT,54),
                        new MoveLearnSetEntry(Move.GRAVITY,59),
                        new MoveLearnSetEntry(Move.ERUPTION,66)                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("tubeworm");

    }


}
