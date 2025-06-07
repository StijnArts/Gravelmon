package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Smokwi extends drai.dev.data.pokemon.Pokemon {
    public Smokwi() {
        super("Smokwi",
                Type.FIRE,
                new Stats(50,
                        58,
                        68,
                        74,
                        46,
                        104),
                List.of(Ability.CUTE_CHARM), Ability.BIG_PECKS,
                6, 103,
                new Stats(0,0,0,1,0,0), 160,
                0.5,
                72, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("Found in grassy areas surrounding volcanoes, Smokwi hunt and forrage for small bug-type Pokemon. It's long beak is sharp enough to pierce even the most dessicated earth."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Smokwi");

    }


}
