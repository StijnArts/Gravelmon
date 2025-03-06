package drai.dev.data.pokemon.raian.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class RaianianGallade extends drai.dev.data.pokemon.Pokemon {
    public RaianianGallade(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "RaianianGallade",
                Type.ELECTRIC,Type.FIGHTING,
                stats,
                List.of(), null,
                17, 0,
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 30, 52, 0.0625, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gallade");
            addAdditionalEvolution("kirlia", new EvolutionEntry("raianiangallade", EvolutionType.ITEM_INTERACT, false, List.of(),
                    List.of(),List.of(),"cobblemon:thunder_stone"));
    }


}
