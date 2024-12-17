package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Auburnt extends drai.dev.data.pokemon.Pokemon {
    public Auburnt() {
        super("Auburnt",
                Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 0,
                new Stats(0,0,0,0,0,0), 140,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("pyrote", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.BURN_UP,1),
                        new MoveLearnSetEntry(Move.SPITE,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,14),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,19),
                        new MoveLearnSetEntry(Move.WILLOWISP,23),
                        new MoveLearnSetEntry(Move.FLAME_BURST,28),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,32),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,37),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,41),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,46),
                        new MoveLearnSetEntry(Move.POWER_GEM,50),
                        new MoveLearnSetEntry(Move.OVERHEAT,55)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 2, 23, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Auburnt");

    }


}
