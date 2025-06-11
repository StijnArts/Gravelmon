package drai.dev.data.pokemon.varitas.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VaritasianBellossom extends drai.dev.data.pokemon.Pokemon {
    public VaritasianBellossom(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "VaritasianBellossom",
                Type.GRASS,Type.DARK,
                stats,
                List.of(Ability.CUTE_CHARM), Ability.PRANKSTER,
                5, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
                        .setMinLevel(35).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DESERT).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Bellossom");

    }


}
