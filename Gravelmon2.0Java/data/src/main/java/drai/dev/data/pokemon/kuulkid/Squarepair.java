package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squarepair extends drai.dev.data.pokemon.Pokemon {
    public Squarepair() {
        super("Squarepair",
                Type.WATER,
                new Stats(71,
                        75,
                        68,
                        56,
                        63,
                        54),
                List.of(Ability.WATER_ABSORB), Ability.WATER_ABSORB,
                11, 0,
                new Stats(0,2,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("underssey", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42"))),
                        new EvolutionEntry("spungabunga", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:peat_block")),
                List.of(                        ),
                List.of(Label.KUULKID, Label.JOKE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 18, 43, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER, SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Squarepair");

    }


}
