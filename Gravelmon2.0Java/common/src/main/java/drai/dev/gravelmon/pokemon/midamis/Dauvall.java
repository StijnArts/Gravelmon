package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Dauvall extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dauvall() {
        super("Dauvall",
                Type.DARK,
                new Stats(70,
                        70,
                        70,
                        70,
                        70,
                        70),
                List.of(Ability.PRANKSTER), Ability.PRANKSTER,
                6, 165,
                new Stats(0,1,0,1,0,1), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("An extremely strange Pokemon that has an attack of almost every type. Unfortunately they are probably the most annoying attacks and so that's how Dauvall got its classification."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_KISS,1),
                        new MoveLearnSetEntry(Move.ENCORE,1),
                        new MoveLearnSetEntry(Move.WILLOWISP,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.WHIRLWIND,5),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,10),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,13),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,18),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,21),
                        new MoveLearnSetEntry(Move.DETECT,26),
                        new MoveLearnSetEntry(Move.GYRO_BALL,29),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,34),
                        new MoveLearnSetEntry(Move.SAND_TOMB,37),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,42),
                        new MoveLearnSetEntry(Move.SANDSTORM,45),
                        new MoveLearnSetEntry(Move.AQUA_RING,50),
                        new MoveLearnSetEntry(Move.GRAVITY,53)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 43, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dauvall");

    }


}
