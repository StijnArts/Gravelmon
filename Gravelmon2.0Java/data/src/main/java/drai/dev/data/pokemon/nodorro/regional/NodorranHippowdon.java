package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranHippowdon extends drai.dev.data.pokemon.Pokemon {
    public NodorranHippowdon(String name, Aspect aspect) {
        super(name, aspect, "Hippowdon",
                Type.WATER,
                new Stats(107,
                        100,
                        70,
                        90,
                        118,
                        40),
                List.of(Ability.WATER_VEIL), Ability.WATER_ABSORB,
                20, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(34).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Hippowdon");

    }


}
