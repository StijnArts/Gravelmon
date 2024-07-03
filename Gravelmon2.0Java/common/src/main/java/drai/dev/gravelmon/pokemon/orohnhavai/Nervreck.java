package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Nervreck extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nervreck() {
        super("Nervreck",
                Type.DARK, Type.FIGHTING,
                new Stats(80,
                        90,
                        70,
                        40,
                        60,
                        65),
                List.of(Ability.GUTS,Ability.NO_GUARD,Ability.IRON_FIST), Ability.IRON_FIST,
                10, 165,
                new Stats(1,1,0,0,0,0), 90,
                0.75,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Nervreck intimidate its foes by puffing up its chest. It will not back down from a battle no matter what. It releases its anger and tension by wrecking its surroundings. It is thecleffautic for them."),
                List.of(new EvolutionEntry("wreckore", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"39")))),
                List.of(
                        new MoveLearnSetEntry(Move.ARM_THRUST,1),
                        new MoveLearnSetEntry(Move.BIDE,4),
                        new MoveLearnSetEntry(Move.LOW_KICK,8),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,11),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,14),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,18),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,22),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,27),
                        new MoveLearnSetEntry(Move.BULK_UP,30),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,34),
                        new MoveLearnSetEntry(Move.ENDURE,37),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,40),
                        new MoveLearnSetEntry(Move.FAKE_OUT,42),
                        new MoveLearnSetEntry(Move.THRASH,45),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,49),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.REVENGE,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 25, 41, 1.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nervreck");

    }


}
