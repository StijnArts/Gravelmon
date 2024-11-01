package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cockapoll extends drai.dev.data.pokemon.Pokemon {
    public Cockapoll() {
        super("Cockapoll",
                Type.NORMAL, Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.BIG_PECKS,
                6, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("rayquazaapoll knows a lot about responsibility but rarely shows what it has been taught. Leading groups of cleffaatoto during great berry heists, wooperapoll is usually the worst of the bunch."),
                List.of(new EvolutionEntry("sheagull", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"\"gender=female\""))),
                        new EvolutionEntry("pharature", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"\"gender=male\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.DETECT,6),
                        new MoveLearnSetEntry(Move.MIMIC,8),
                        new MoveLearnSetEntry(Move.THIEF,13),
                        new MoveLearnSetEntry(Move.PLUCK,20),
                        new MoveLearnSetEntry(Move.ME_FIRST,23),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,26),
                        new MoveLearnSetEntry(Move.CHATTER,32),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,34),
                        new MoveLearnSetEntry(Move.SNATCH,38),
                        new MoveLearnSetEntry(Move.DRILL_PECK,44),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,48),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,56)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 17, 44, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BIRCH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Cockapoll");

    }


}
