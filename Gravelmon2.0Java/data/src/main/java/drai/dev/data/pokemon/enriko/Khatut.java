package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Khatut extends drai.dev.data.pokemon.Pokemon {
    public Khatut() {
        super("Khatut",
                Type.NORMAL, Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The metal prod on its head reverberates its brainwaves, giving it the ability to read minds. It uses this ability to discern prey from predators in the dark."),
                List.of(new EvolutionEntry("cleocatra", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"220")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,7),
                        new MoveLearnSetEntry(Move.CONFUSION,12),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,17),
                        new MoveLearnSetEntry(Move.ASSIST,24),
                        new MoveLearnSetEntry(Move.PSYBEAM,27),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,30),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,33),
                        new MoveLearnSetEntry(Move.PSIBULLET,37),
                        new MoveLearnSetEntry(Move.CAPTIVATE,40),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,44),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,49),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,55)
                ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 7, 29, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Khatut");

    }


}
