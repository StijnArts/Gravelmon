package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Perchback extends drai.dev.data.pokemon.Pokemon {
    public Perchback() {
        super("Perchback",
                Type.STEEL,
                new Stats(170,
                        75,
                        110,
                        50,
                        110,
                        20),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                145, 9400,
                new Stats(2,0,0,0,0,0), 25,
                -1,
                189, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.ULTRA_RARE, 33, 65, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.WATER_SURFACE),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Perchback");

    }


}
