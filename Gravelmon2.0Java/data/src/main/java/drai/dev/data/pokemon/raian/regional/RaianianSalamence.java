package drai.dev.data.pokemon.raian.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class RaianianSalamence extends drai.dev.data.pokemon.Pokemon {
    public RaianianSalamence(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "RaianianSalamence",
                Type.DRAGON,Type.GHOST,
                stats,
                List.of(), null,
                15, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 50, 60, 0.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Salamence");
        addAdditionalEvolution("shelgon", new EvolutionEntry("raianiansalamence", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_SPOOKY.getId() + ":" + Biome.IS_SPOOKY.getName()))));

    }


}
