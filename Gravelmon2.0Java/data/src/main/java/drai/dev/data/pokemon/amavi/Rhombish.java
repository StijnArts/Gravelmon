package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rhombish extends drai.dev.data.pokemon.Pokemon {
    public Rhombish() {
        super("Rhombish",
                Type.NORMAL,
                new Stats(100,
                        40,
                        45,
                        85,
                        75,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("javelady", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female")))),
                List.of(         new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.BIDE,4),
                        new MoveLearnSetEntry(Move.LOW_KICK,8),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,11),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,14),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,18),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,22),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,25),
                        new MoveLearnSetEntry(Move.ENDURE,28),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,32),
                        new MoveLearnSetEntry(Move.FAKE_OUT,36),
                        new MoveLearnSetEntry(Move.FLAIL,39)              ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 37, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
           setLangFileName("Rhombish");

    }


}
