package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Balan extends drai.dev.data.pokemon.Pokemon {
    public Balan(Stats stats) {
        super("Balan",
                Type.DARK,Type.FAIRY,
                stats,
                List.of(Ability.BALANCE,Ability.SUPER_LUCK), null,
                23, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 43, 67, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
            addAdditionalEvolution("absol", new EvolutionEntry("Balan", EvolutionType.LEVEL_UP, List.of(),
                    List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.NIGHT_SLASH.getName()+"\""),
                            new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.PLAY_ROUGH.getName()+"\""))));
        setLangFileName("Balan");
    }


}
