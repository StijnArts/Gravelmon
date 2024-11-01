package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Arroweed extends drai.dev.data.pokemon.Pokemon {
    public Arroweed() {
        super("Arroweed",
                Type.GRASS,Type.ROCK,
                new Stats(45,
                        55,
                        80,
                        65,
                        40,
                        20),
                List.of(Ability.STURDY,Ability.ROCK_HEAD), Ability.CHLOROPHYLL,
                4, 40,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                61, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Arroweed like to carve rocks into the shape of its mask to help it blend in with them while siting in shallow water. It stands its tail up above the water's surface for photosynthesis."),
                List.of(),
                List.of(                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Arroweed");

    }


}
