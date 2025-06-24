package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bakkabolt extends drai.dev.data.pokemon.Pokemon {
    public Bakkabolt(Stats stats) {
        super("Pteronize",
                Type.ELECTRIC, Type.DARK,
                stats,
                List.of(Ability.STATIC), Ability.STATIC,
                14, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("It glides freely over the sky during stormy days, blending in with the clouds. When enraged, it employs its piercing shriek to confuse attackers."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Pteronize");

    }


}
