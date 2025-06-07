package drai.dev.data.pokemon.mastenia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MastenianBreloom extends drai.dev.data.pokemon.Pokemon {
    public MastenianBreloom(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "Breloom",
                Type.DRAGON,Type.GRASS,
                stats,
                List.of(Ability.EFFECT_SPORE,Ability.OUTBURST), Ability.TECHNICIAN,
                14, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(23).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MAGICAL)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Breloom");

    }


}
