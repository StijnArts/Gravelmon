package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Origalleon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Origalleon() {
        super("Origalleon",
                Type.ELECTRIC,Type.GHOST,
                new Stats(93,
                        93,
                        67,
                        107,
                        80,
                        80),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,3,0,0), 0,
                0.5,
                234, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Origalleon have let go of their obsessions, instead deciding to spend the rest of its days at sea offering aid to pokémon and people alike. But should they ever find what they were searching for, they pledge to be by its side forever."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Origalleon");

    }


}
