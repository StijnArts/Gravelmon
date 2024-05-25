package drai.dev.gravelmon.pokemon.fliga;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Mousprite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mousprite() {
        super("Mousprite",
                Type.FAIRY,
                new Stats(60,
                        92,
                        23,
                        52,
                        32,
                        51),
                List.of(Ability.CUTE_CHARM), Ability.MOXIE,
                4, 0,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mousprite were originally created when a digital avatar gained sentience. They love to learn, and depending on what they discover in both the real world and on the internet, will develop different temperaments."),
                List.of(new EvolutionEntry("mouscalibur", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"))),
                        new EvolutionEntry("mouszerker", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(         new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,5),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,8),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,10),
                        new MoveLearnSetEntry(Move.YAWN,13),
                        new MoveLearnSetEntry(Move.RETURN,16),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,22),
                        new MoveLearnSetEntry(Move.REST,28),
                        new MoveLearnSetEntry(Move.SNORE,30),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,38),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,46),
                        new MoveLearnSetEntry(Move.MOONBLAST,58)               ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Mousprite");

    }


}
