package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dangoceras extends drai.dev.data.pokemon.Pokemon {
    public Dangoceras() {
        super("Dangoceras",
                Type.ICE,Type.PSYCHIC,
                new Stats(110,
                        24,
                        76,
                        114,
                        136,
                        40),
                List.of(Ability.ICE_BODY), Ability.CLEAR_BODY,
                16, 720,
                new Stats(0,0,0,1,1,0), 60,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Its icy shell moved from its head to its tentacles to allow room for its three brains to grow, heightening its mental prowess to incredible degrees at the cost of its mobility."),
                List.of(),
                List.of(                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 35, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN, Biome.IS_FROZEN_OCEAN)  ),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Dangoceras");

    }


}
