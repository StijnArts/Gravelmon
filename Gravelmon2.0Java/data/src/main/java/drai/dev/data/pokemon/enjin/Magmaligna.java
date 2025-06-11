package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Magmaligna extends drai.dev.data.pokemon.Pokemon {
    public Magmaligna(Stats stats) {
        super("Magmaligna",
                Type.FIRE,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.DRAGON),
                List.of("Added Oct 27 2021 Etymology: magma + [???] Evo line: Complete Origin: Created by JaneJewel for the April 2020 Around The World Fakeathon Day 4 prompt, Mexico"),
                List.of(),
                List.of(),
                List.of(Label.ENJIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Magmaligna");

    }


}
