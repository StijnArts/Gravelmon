package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Toilengobble extends drai.dev.data.pokemon.Pokemon {
    public Toilengobble() {
        super("Toilengobble",
                Type.DARK,Type.POISON,
                new Stats(85,
                        70,
                        85,
                        95,
                        75,
                        52),
                List.of(Ability.COVEN), Ability.COVEN,
                14, 0,
                new Stats(0,0,0,2,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Toilengobble");

    }


}
