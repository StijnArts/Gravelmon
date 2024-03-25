package drai.dev.gravelmon.pokemon.terranov;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Ibushi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ibushi() {
        super("Ibushi",
                Type.DRAGON,Type.PSYCHIC,
                new Stats(160,
                        130,
                        75,
                        140,
                        75,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A male elder dragon that exhibits inexplicable behaviors such as floating upside down midair. Research indicates that the emission of a special gas from all over its body, and the modulation of this gas, is what allows it to move freely. It shoots air from gills on its arms and tail to fly, creating its own turbulence and soaring to great heights."),
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
           setLangFileName("Ibushi");

    }


}
