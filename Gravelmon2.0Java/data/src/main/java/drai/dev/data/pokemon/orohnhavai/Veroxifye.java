package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Veroxifye extends drai.dev.data.pokemon.Pokemon {
    public Veroxifye() {
        super("Veroxifye",
                Type.FAIRY, Type.FIGHTING,
                new Stats(70,
                        95,
                        70,
                        110,
                        60,
                        105),
                List.of(Ability.PERCEIVE), Ability.INFILTRATOR,
                17, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Veroxifye's orb is referred to as its 'Third Eye' due to its ability to reveal the truth as well as deception. They will fight to protect their group from Zoroark, their bitter enemies. It is thought this feud began with a vision shown in a Veroxifye's orb."),
                List.of(),
                List.of(        new MoveLearnSetEntry(Move.CONFIDE,1),
                        new MoveLearnSetEntry(Move.TAUNT,7),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,12),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,15),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,19),
                        new MoveLearnSetEntry(Move.PIXIEDUST,22),
                        new MoveLearnSetEntry(Move.REVENGE,26),
                        new MoveLearnSetEntry(Move.FLATTER,30),
                        new MoveLearnSetEntry(Move.PIXIEPUNCH,34),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,39),
                        new MoveLearnSetEntry(Move.SUPERPOWER,45),
                        new MoveLearnSetEntry(Move.TRICK,50),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,55)                ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 49, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Veroxifye");

    }


}
