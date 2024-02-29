package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Karmean extends drai.dev.gravelmon.pokemon.Pokemon {
    public Karmean() {
        super("Karmean",
                Type.FIGHTING,Type.STEEL,
                new Stats(50,
                        60,
                        60,
                        40,
                        40,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("inferaid", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.RATIO,"ATTACK_HIGHER"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"))),
                        new EvolutionEntry("hailoman", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.RATIO,"DEFENCE_HIGHER")))),
                List.of(       new MoveLearnSetEntry(Move.WORK_UP,1),
                        new MoveLearnSetEntry(Move.BIDE,5),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,8),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,13),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,17),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,20),
                        new MoveLearnSetEntry(Move.RETALIATE,22),
                        new MoveLearnSetEntry(Move.REVENGE,25),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,28),
                        new MoveLearnSetEntry(Move.COACHING,31),
                        new MoveLearnSetEntry(Move.SUBMISSION,36),
                        new MoveLearnSetEntry(Move.IRON_HEAD,40),
                        new MoveLearnSetEntry(Move.SUPERPOWER,43),
                        new MoveLearnSetEntry(Move.WARDANCE,47)                 ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 8, 27, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Karmean");

    }


}
