package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tadpad extends drai.dev.data.pokemon.Pokemon {
    public Tadpad() {
        super("Tadpad",
                Type.GRASS,Type.WATER,
                new Stats(86,
                        7,
                        53,
                        42,
                        41,
                        56),
                List.of(Ability.HYDRATION,Ability.DAMP), Ability.WATER_ABSORB,
                5, 55,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                57, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.GRASS),
                List.of("Tadpad love playing in the rain, splashing in puddles or the shallow areas in creeks. The bulb atop its head grows bigger as it nears evolution."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tadpad");

    }


}
