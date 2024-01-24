package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mossowl extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mossowl() {
        super("Mossowl",
                Type.GROUND,Type.GRASS,
                new Stats(95,
                        135,
                        120,
                        90,
                        100,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,3,0,0,0,0), 3,
                0.5,
                257, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Wandering the planet for centuries, the pelt of a Mossowl is a small insight into their travels. Different flowers and herbs grow within the moss depending on where they have been."),
                List.of(),
                List.of(                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mossowl");

    }


}
