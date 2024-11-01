package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelsextendedbattles.resorting.*;

import java.util.*;
public class Kippsie extends drai.dev.data.pokemon.Pokemon {
    public Kippsie() {
        super("Kippsie",
                Type.WATER,Type.FLYING,
                new Stats(55,
                        24,
                        34,
                        32,
                        33,
                        60),
                List.of(Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                5, 0,
                new Stats(0,0,0,0,0,1), 180,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Kippsie use their fins to propel themselves out of the water. It is all Kippsie's dreams to fly and they will spend their entire lives trying."),
                List.of(new EvolutionEntry("soarine", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.FLY.getName()+"\"")))),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 13, 41, 4.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setCanFly(true);
        GravelmonMoveSubstitution.registerMoveInsertion("kippsie", new MoveLearnSetEntry(Move.FLY, 28));
           setLangFileName("Kippsie");

    }


}
