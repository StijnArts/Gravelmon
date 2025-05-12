package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Skyviator extends drai.dev.data.pokemon.Pokemon {
    public Skyviator() {
        super("Skyviator",
                Type.FLYING,
                new Stats(83,
                        86,
                        50,
                        75,
                        52,
                        139),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 190,
                new Stats(0,0,0,0,0,2), 100,
                0.5,
                185, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.RARE, 33, 51, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.WATER_SURFACE),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Skyviator");

    }


}
