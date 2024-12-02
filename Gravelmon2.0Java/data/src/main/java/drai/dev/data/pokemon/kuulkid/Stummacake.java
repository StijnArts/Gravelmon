package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stummacake extends drai.dev.data.pokemon.Pokemon {
    public Stummacake() {
        super("Stummacake",
                Type.FAIRY,Type.DRAGON,
                new Stats(110,
                        90,
                        105,
                        120,
                        100,
                        75),
                List.of(Ability.SUGARCRASH), Ability.SUGARCRASH,
                30, 30000,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("This Pokémon makes its home in the fabled chocolate river of the Kuulkid region. It consumes unhealthy amounts of candy each day, causing it to have constant stomach pains."),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stummacake");

    }


}
