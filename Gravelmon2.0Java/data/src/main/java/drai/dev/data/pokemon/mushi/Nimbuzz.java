package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nimbuzz extends drai.dev.data.pokemon.Pokemon {
    public Nimbuzz() {
        super("Nimbuzz",
                Type.FLYING,Type.BUG,
                new Stats(50,
                        50,
                        45,
                        70,
                        40,
                        95),
                List.of(Ability.SHIELD_DUST,Ability.TINTED_LENS), Ability.SPEED_BOOST,
                9, 0,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 16, 36, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_TAIGA, Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

        setLangFileName("Nimbuzz");

    }


}