package drai.dev.data.pokemon.okeno;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cactower extends drai.dev.data.pokemon.Pokemon {
    public Cactower() {
        super("Cactower",
                Type.GRASS,Type.ELECTRIC,
                new Stats(99,
                        113,
                        88,
                        101,
                        50,
                        33),
                List.of(Ability.LIGHTNING_ROD,Ability.DRY_SKIN), Ability.SOLAR_POWER,
                14, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 54, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cactower");

    }


}
