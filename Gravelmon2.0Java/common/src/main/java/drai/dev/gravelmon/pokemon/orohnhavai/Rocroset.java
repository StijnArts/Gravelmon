package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Rocroset extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rocroset() {
        super("Rocroset",
                Type.ROCK,Type.GRASS,
                new Stats(95,
                        75,
                        78,
                        65,
                        75,
                        30),
                List.of(Ability.LEAF_GUARD,Ability.FLOWER_VEIL,Ability.WATER_ABSORB), Ability.WATER_ABSORB,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their weakest spot is their head, which is protected by their petals. They lay on their backs and disguise themselves as a plant. They attack their enemies with their sharp spikes. Inside them, their bodies are slowly growing."),
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
           setLangFileName("Rocroset");

    }


}
