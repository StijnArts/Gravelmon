package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Macargold extends drai.dev.data.pokemon.Pokemon {
    public Macargold() {
        super("Macargold",
                Type.ROCK,Type.GROUND,
                new Stats(93,
                        32,
                        111,
                        93,
                        79,
                        18),
                List.of(Ability.SAND_STREAM), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 38, 54, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK))),
                List.of(SpawnPreset.NATURAL, SpawnPreset.GEMSTONES),
                0.28, 0.3,
                List.of());
           setLangFileName("Macargold");

    }


}
