package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Macarton extends drai.dev.data.pokemon.Pokemon {
    public Macarton() {
        super("Macarton",
                Type.GROUND,Type.FAIRY,
                new Stats(116,
                        84,
                        60,
                        45,
                        44,
                        75),
                List.of(Ability.MATERNAL), Ability.MATERNAL,
                14, 0,
                new Stats(2,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 21, 54, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Macarton");

    }


}
