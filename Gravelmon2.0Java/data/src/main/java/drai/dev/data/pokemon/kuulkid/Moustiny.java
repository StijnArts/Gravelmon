package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelsextendedbattles.resorting.*;

import java.util.*;
public class Moustiny extends drai.dev.data.pokemon.Pokemon {
    public Moustiny() {
        super("Moustiny",
                Type.DARK,
                new Stats(43,
                        43,
                        25,
                        55,
                        32,
                        45),
                List.of(Ability.SCRAPPY), Ability.FILTER,
                4, 0,
                new Stats(0,0,0,1,0,0), 180,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Despite the lack of an observed grooming behaviour, Moustiny's bristles always maintain a glossy sheen. Moustiny who reside in areas with a large human population will look slightly different to wild Moustiny as they will imitate popular moustache styles in their environment."),
                List.of(new EvolutionEntry("monstache", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.GROWTH.getName())))	),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 7, 32, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
        GravelmonMoveSubstitution.registerMoveInsertion("moustiny", new MoveLearnSetEntry(Move.GROWTH, 28));
           setLangFileName("Moustiny");

    }


}
