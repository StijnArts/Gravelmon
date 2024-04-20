package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Elegander extends drai.dev.gravelmon.pokemon.Pokemon {
    public Elegander() {
        super("Elegander",
                Type.GRASS, Type.DRAGON,
                new Stats(85,
                        85,
                        70,
                        114,
                        95,
                        85),
                List.of(Ability.OVERGROW), Ability.OVERCOAT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The Dragon of the Pond; a book once written a long time ago. A tale of a royal Pokemon sworn to bring justice to all inland lakes and its inhabitants."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEAF_STORM,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Elegander");

    }


}
