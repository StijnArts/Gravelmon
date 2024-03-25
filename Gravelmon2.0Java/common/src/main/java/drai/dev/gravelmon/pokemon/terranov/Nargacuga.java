package drai.dev.gravelmon.pokemon.terranov;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Nargacuga extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nargacuga() {
        super("Nargacuga",
                Type.DARK,
                new Stats(75,
                        95,
                        60,
                        70,
                        110,
                        135),
                List.of(Ability.LIMBER), Ability.LIMBER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A uniquely-evolved wyvern that calls the forest its home. It hides itself in the shadows and slyly stalks its prey with terrifying speed and tenacity."),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nargacuga");

    }


}
