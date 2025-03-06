package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Binchickin extends drai.dev.data.pokemon.Pokemon {
    public Binchickin() {
        super("Binchickin",
                Type.POISON,
                new Stats(32,
                        46,
                        55,
                        35,
                        46,
                        50),
                List.of(Ability.TRASHGUARD), Ability.TRASHGUARD,
                7, 0,
                new Stats(0,0,1,0,0,0), 160,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Skittish by nature, these pokemon will scrounge up the scraps left by people and other pokemon. They are most common in urban areas and landfills."),
                List.of(new EvolutionEntry("garbagegutz", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:metal_coat")),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 32, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Binchickin");

    }


}
