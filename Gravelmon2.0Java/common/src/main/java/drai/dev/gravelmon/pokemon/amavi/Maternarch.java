package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Maternarch extends drai.dev.gravelmon.pokemon.Pokemon {
    public Maternarch() {
        super("Maternarch",
                Type.BUG,Type.GROUND,
                new Stats(111,
                        40,
                        133,
                        55,
                        133,
                        33),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,3),
                        new MoveLearnSetEntry(Move.DIG,8),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,12),
                        new MoveLearnSetEntry(Move.CONFUSION,16),
                        new MoveLearnSetEntry(Move.POISON_POWDER,20),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,24)                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 56, .03, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maternarch");

    }


}
