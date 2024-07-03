package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Birdurr extends drai.dev.gravelmon.pokemon.Pokemon {
    public Birdurr(Stats stats) {
        super("Birdurr",
                Type.GHOST, Type.FLYING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.MINIMIZE,1),
                        new MoveLearnSetEntry(Move.GUST,4),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,8),
                        new MoveLearnSetEntry(Move.PAYBACK,12),
                        new MoveLearnSetEntry(Move.HEX,16),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,20),
                        new MoveLearnSetEntry(Move.SPIT_UP,24),
                        new MoveLearnSetEntry(Move.STOCKPILE,24),
                        new MoveLearnSetEntry(Move.SWALLOW,24),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,29),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,32),
                        new MoveLearnSetEntry(Move.BATON_PASS,36),
                        new MoveLearnSetEntry(Move.TAILWIND,40)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 11, 42, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Birdurr");

    }


}
