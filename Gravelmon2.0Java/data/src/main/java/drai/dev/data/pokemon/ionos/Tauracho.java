package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tauracho extends drai.dev.data.pokemon.Pokemon {
    public Tauracho() {
        super("Tauracho",
                Type.GRASS, Type.FIGHTING,
                new Stats(80,
                        120,
                        101,
                        50,
                        100,
                        80),
                List.of(Ability.OVERGROW), Ability.RECKLESS,
                17, 0,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 36, 53, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_SNOWY))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tauracho");

    }


}
