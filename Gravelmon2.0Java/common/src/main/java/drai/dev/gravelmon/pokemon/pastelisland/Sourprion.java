package drai.dev.gravelmon.pokemon.pastelisland;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Sourprion extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sourprion() {
        super("Sourprion",
                Type.WATER, Type.DRAGON,
                new Stats(75,
                        99,
                        70,
                        80,
                        70,
                        81),
                List.of(Ability.FRISK), Ability.STRONG_JAW,
                37, 1600,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                166, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.MONSTER),
                List.of("While entirely blind, Sourprion can release a powerful fragrance that can paralyze foes with it's flavour. They can feel their surroundings with special electro-receptors. Male Sourprion have more potent fragrances for attracting mates."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sourprion");

    }


}
