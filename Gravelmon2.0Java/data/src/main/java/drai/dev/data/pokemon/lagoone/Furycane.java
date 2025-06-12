package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Furycane extends drai.dev.data.pokemon.Pokemon {
    public Furycane() {
        super("Furycane",
                Type.DRAGON,Type.FLYING,
                new Stats(92,
                        70,
                        70,
                        128,
                        92,
                        83),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                19, 8,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                172, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.RARE, 40, 61, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.IS_RAINING,"true")
                ), List.of(),
                List.of(SpawnPreset.WATER_SURFACE),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Furycane");

    }


}
