package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Newtint extends drai.dev.data.pokemon.Pokemon {
    public Newtint() {
        super("Newtint",
                Type.WATER, Type.POISON,
                new Stats(70,
                        60,
                        80,
                        100,
                        80,
                        90),
                List.of(Ability.WATER_ABSORB,Ability.PRANKSTER), Ability.CORROSION,
                13, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It sneaks through alleyways, marking its territory with a spray of poisonous paint from its mouth. The composition varies from individual to individual, and it often causes metal to rust."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(26).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TROPICAL).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Newtint");

    }


}
