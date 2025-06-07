package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Guardihand extends drai.dev.data.pokemon.Pokemon {
    public Guardihand() {
        super("Guardihand",
                Type.ROCK, Type.PSYCHIC,
                new Stats(75,
                        120,
                        80,
                        120,
                        80,
                        50),
                List.of(Ability.REFLEXSTRIKE), Ability.REFLEXSTRIKE,
                23, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Erosion over time has made its body crumble, although its soul will never waver. It will make sure no intruders pass through the area it is protecting. Even after thousands of years of dormancy, it still remains extremely powerful. Artwork from ancient times depicts it as a protector of an ancient civilisation."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DEEP_DARK)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Guardihand");

    }


}
