package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Chesture extends drai.dev.data.pokemon.Pokemon {
    public Chesture() {
        super("Chesture",
                Type.NORMAL,
                new Stats(70,
                        80,
                        90,
                        60,
                        90,
                        80),
                List.of(Ability.INTIMIDATE,Ability.MOODY,Ability.ILLUSION), Ability.ILLUSION,
                11, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,1),
                        new MoveLearnSetEntry(Move.ROTOTILLER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.BITE,6),
                        new MoveLearnSetEntry(Move.BIDE,8),
                        new MoveLearnSetEntry(Move.DETECT,11),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,13),
                        new MoveLearnSetEntry(Move.CRUNCH,16),
                        new MoveLearnSetEntry(Move.HYPNOSIS,18),
                        new MoveLearnSetEntry(Move.SUPER_FANG,22),
                        new MoveLearnSetEntry(Move.AFTER_YOU,25),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,29),
                        new MoveLearnSetEntry(Move.PSYCH_UP,32),
                        new MoveLearnSetEntry(Move.HYPER_FANG,36),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,39),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,43),
                        new MoveLearnSetEntry(Move.BATON_PASS,46),
                        new MoveLearnSetEntry(Move.SLAM,50)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 21, 54, 9, List.of(
                ), List.of(),
                List.of(SpawnPreset.JUNGLE_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Chesture");

    }


}
