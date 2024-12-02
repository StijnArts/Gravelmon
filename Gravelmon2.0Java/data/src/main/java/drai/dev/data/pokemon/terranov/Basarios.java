package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Basarios extends drai.dev.data.pokemon.Pokemon {
    public Basarios() {
        super("Basarios",
                Type.ROCK,
                new Stats(80,
                        70,
                        110,
                        75,
                        80,
                        30),
                List.of(Ability.STURDY), Ability.STURDY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("This large flying wyvern is actually a juvenile. When asleep, it buries its underside and head underground leaving only its back exposed, camouflaging itself as a large boulder."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Basarios");

    }


}
