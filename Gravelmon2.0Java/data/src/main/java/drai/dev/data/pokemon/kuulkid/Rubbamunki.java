package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rubbamunki extends drai.dev.data.pokemon.Pokemon {
    public Rubbamunki() {
        super("Rubbamunki",
                Type.FIGHTING,
                new Stats(30,
                        70,
                        45,
                        35,
                        40,
                        80),
                List.of(Ability.IRON_FIST), Ability.IRON_FIST,
                5, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("gummigibbon", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:wiki_berry")),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 38, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TROPICAL_ISLAND, Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rubbamunki");

    }


}
