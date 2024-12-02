package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mothmother extends drai.dev.data.pokemon.Pokemon {
    public Mothmother() {
        super("Mothmother",
                Type.BUG,Type.FAIRY,
                new Stats(60,
                        60,
                        80,
                        60,
                        100,
                        50),
                List.of(Ability.HOSPITALITY), Ability.HOSPITALITY,
                12, 0,
                new Stats(0,0,1,0,2,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 36, .8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Mothmother");

    }


}
