package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Flambagant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flambagant() {
        super("Flambagant",
                Type.PSYCHIC,Type.FLYING,
                new Stats(80,
                        80,
                        65,
                        70,
                        100,
                        85),
                List.of(Ability.CUTE_CHARM), Ability.DAZZLING,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Upon evolution, they finally have the confidence to show their true feelings and express them through dance. Their feelings radiate psychic energy and may boost the mood to those around it. Flambagant are very popular in Pokémon contests as they love being dressed up. They have been a symbol of love in the region. It is said if a couple finds a feather of Flambagant, they will have everlasting love."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flambagant");

    }


}
