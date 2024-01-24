package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Bunnler extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bunnler() {
        super("Bunnler",
                Type.DARK,Type.ICE,
                new Stats(75,
                        70,
                        50,
                        70,
                        70,
                        95),
                List.of(Ability.PICKPOCKET,Ability.SNOW_CLOAK,Ability.QUICK_FEET), Ability.QUICK_FEET,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Using heavy snowfall as cover for the perfect heist. Bunnler is an expert of stealth for its own benefit; to steal from other Pokemon, storing items in its tail; and to hide away from Snowl."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.MUDSLAP,8),
                        new MoveLearnSetEntry(Move.HAZE,12),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,18),
                        new MoveLearnSetEntry(Move.ICE_BALL,26),
                        new MoveLearnSetEntry(Move.MOONLIGHT,32),
                        new MoveLearnSetEntry(Move.SNOWBALLPELT,38),
                        new MoveLearnSetEntry(Move.SNATCH,46),
                        new MoveLearnSetEntry(Move.BOUNCE,50),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,56),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,60),
                        new MoveLearnSetEntry(Move.MIST,68),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,74),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bunnler");

    }


}
