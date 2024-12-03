package drai.dev.data.pokemon.raian.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class RaianianNoctowl extends drai.dev.data.pokemon.Pokemon {
    public RaianianNoctowl(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "RaianianNoctowl",
                Type.ROCK,Type.FLYING,
                stats,
                List.of(), null,
                15, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 22, 51, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Noctowl");
        addAdditionalEvolution("hoothoot", new EvolutionEntry("raianiannoctowl", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,"\""+ Biome.IS_MOUNTAIN.getId() + ":" + Biome.IS_MOUNTAIN.getName() +"\""))));
    }


}
