package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mawvile extends drai.dev.data.pokemon.Pokemon {
    public Mawvile(Stats stats) {
        super("Mawvile",
                Type.GHOST, Type.WATER,
                stats,
                List.of(Ability.STRONG_JAW,Ability.HYPER_CUTTER), Ability.INTIMIDATE,
                16, 0,
                new Stats(0,0,0,0,0,0), 90,
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
                        .setMinLevel(32).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DEEP_OCEAN).atNight()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
           setLangFileName("Mawvile");
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }


}
