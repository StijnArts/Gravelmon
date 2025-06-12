package drai.dev.data.pokemon.raian.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class RaianianArcanine extends drai.dev.data.pokemon.Pokemon {
    public RaianianArcanine(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "RaianianArcanine",
                Type.DRAGON,Type.FIRE,
                stats,
                List.of(), null,
                24, 0,
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Arcanine");
           addAdditionalEvolution("growlithe", new EvolutionEntry("raianianarcanine", EvolutionType.ITEM_INTERACT, false, List.of(),
                   List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_MOUNTAIN.getId() + ":" + Biome.IS_MOUNTAIN.getName())),List.of(),"cobblemon:fire_stone"));
    }


}
