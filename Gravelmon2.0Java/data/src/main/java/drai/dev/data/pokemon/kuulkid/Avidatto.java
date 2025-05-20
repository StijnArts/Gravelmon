package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Avidatto extends drai.dev.data.pokemon.Pokemon {
    public Avidatto() {
        super("Avidatto",
                Type.DARK,Type.NORMAL,
                new Stats(56,
                        54,
                        72,
                        46,
                        68,
                        63),
                List.of(Ability.FRUGAL), Ability.FRUGAL,
                11, 0,
                new Stats(0,0,1,0,1,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 23, 47, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Avidatto");

    }


}
