package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nibblet extends drai.dev.data.pokemon.Pokemon {
    public Nibblet() {
        super("Nibblet",
                Type.STEEL,Type.NORMAL,
                new Stats(55,
                        43,
                        60,
                        42,
                        45,
                        40),
                List.of(Ability.MELTY), Ability.FLARE_BOOST,
                4, 0,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("fondoom", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 32, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Nibblet");

    }


}
