package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bumbuzz extends drai.dev.data.pokemon.Pokemon {
    public Bumbuzz() {
        super("Bumbuzz",
                Type.BUG,Type.ELECTRIC,
                new Stats(55,
                        85,
                        65,
                        70,
                        50,
                        110),
                List.of(Ability.STATIC,Ability.VOLT_ABSORB), Ability.UNBURDEN,
                11, 0,
                new Stats(0,0,0,0,0,2), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 16, 36, 1.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_TAIGA, Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Bumbuzz");

    }


}
