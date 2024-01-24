package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

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
                8, 165,
                new Stats(0,1,0,1,0,1), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("An extremely strange Pokemon that almost has an attack of every type. Unfortunately they are probably the most annoying attacks and so that's how Dauvall got its classification."),
                List.of(),
                List.of(
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dauvall");

    }


}
