package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Clobstrich extends drai.dev.data.pokemon.Pokemon {
    public Clobstrich() {
        super("Clobstrich",
                Type.ROCK,Type.FLYING,
                new Stats(100,
                        78,
                        75,
                        20,
                        20,
                        95),
                List.of(Ability.ROCK_HEAD), Ability.MOLD_BREAKER,
                16, 0,
                new Stats(0,0,0,0,0,0), 140,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 35, 1.7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Clobstrich");

    }


}
