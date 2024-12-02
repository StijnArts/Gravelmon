package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bunelania extends drai.dev.data.pokemon.Pokemon {
    public Bunelania(Stats stats) {
        super("Bunelania",
                Type.FAIRY,
                stats,
                List.of(Ability.PIXILATE), Ability.WATER_ABSORB,
                18, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 41, 58, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Bunelania");

    }


}
