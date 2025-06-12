package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Barbalmond extends drai.dev.data.pokemon.Pokemon {
    public Barbalmond() {
        super("Barbalmond",
                Type.GRASS,Type.FIGHTING,
                new Stats(75,
                        96,
                        96,
                        63,
                        81,
                        69),
                List.of(Ability.MOXIE), Ability.MOXIE,
                18, 0,
                new Stats(0,2,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Barbalmond");

    }


}
