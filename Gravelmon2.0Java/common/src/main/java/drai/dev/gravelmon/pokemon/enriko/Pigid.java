package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Pigid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pigid() {
        super("Pigid",
                Type.DARK, Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 165,
                new Stats(0,0,0,0,0,0), 140,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They swell their bodies up with freezing cold brine to maintain their shape. Sometimes they're brought up from the bottom of the ocean in trawling nets."),
                List.of(new EvolutionEntry("bysoderm", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.SNATCH.getName()+"\"")))	),
                List.of(            new MoveLearnSetEntry(Move.TRIPLE_AXEL,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.MUDSLAP,8),
                        new MoveLearnSetEntry(Move.HAZE,12),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,18),
                        new MoveLearnSetEntry(Move.ICE_BALL,26),
                        new MoveLearnSetEntry(Move.MOONLIGHT,32),
                        new MoveLearnSetEntry(Move.SNOWBALLPELT,38),
                        new MoveLearnSetEntry(Move.SNATCH,46),
                        new MoveLearnSetEntry(Move.BOUNCE,50),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,56),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,60),
                        new MoveLearnSetEntry(Move.MIST,68)            ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pigid");

    }


}
