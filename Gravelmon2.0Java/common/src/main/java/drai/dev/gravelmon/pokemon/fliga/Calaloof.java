package drai.dev.gravelmon.pokemon.fliga;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Calaloof extends drai.dev.gravelmon.pokemon.Pokemon {
    public Calaloof() {
        super("Calaloof",
                Type.NORMAL,
                new Stats(52,
                        58,
                        47,
                        59,
                        55,
                        44),
                List.of(Ability.CUTE_CHARM,Ability.STICKY_HOLD), Ability.OWN_TEMPO,
                6, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                50, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Calaloof are timid Pokémon, and like to hide most of their face within discarded bags. These scaredy-pods are capable of a light hypnosis by shifting colors on their suction pods, but this has proven less effective on Pokémon of higher intelligence."),
                List.of(new EvolutionEntry("Cephalofear", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"29")))),
                List.of(        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                        new MoveLearnSetEntry(Move.FAKE_OUT,8),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,18),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,23),
                        new MoveLearnSetEntry(Move.CURSE,27),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,32),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,37),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,42),
                        new MoveLearnSetEntry(Move.SCARY_FACE,46),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,51),
                        new MoveLearnSetEntry(Move.LAST_RESORT,56),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,61)                ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Calaloof");

    }


}
