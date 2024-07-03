package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Kombantis extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kombantis() {
        super("Kombantis",
                Type.BUG, Type.FIGHTING,
                new Stats(85,
                        110,
                        80,
                        50,
                        50,
                        95),
                List.of(Ability.INNER_FOCUS,Ability.DEFIANT,Ability.FRISK), Ability.FRISK,
                14, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Kombantis are so well fit they can spare with each other for 72 hours before they are tired. Their striking is known to be faster and stronger than most Fighting-Type Pokemon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LASER_FOCUS,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,7),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.PESTER,14),
                        new MoveLearnSetEntry(Move.COUNTER,18),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,22),
                        new MoveLearnSetEntry(Move.SUBMISSION,27),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,35),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,41),
                        new MoveLearnSetEntry(Move.DETECT,48),
                        new MoveLearnSetEntry(Move.SUPERPOWER,52)            ),
                List.of(Label.OROHNHAVAI
                ),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 25, 42, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kombantis");

    }


}
