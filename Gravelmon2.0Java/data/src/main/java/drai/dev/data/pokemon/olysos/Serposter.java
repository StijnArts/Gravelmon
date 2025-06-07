package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Serposter extends drai.dev.data.pokemon.Pokemon {
    public Serposter() {
        super("Serposter",
                Type.GRASS, Type.DRAGON,
                new Stats(110,
                        155,
                        100,
                        70,
                        50,
                        70),
                List.of(Ability.STRONG_JAW,Ability.HUSTLE), Ability.RECKLESS,
                32, 2438,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                1250, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.DRAGON),
                List.of("It's head looks confusingly similar to a berry plant. Serposter uses this as a advantage to ambush prey or foes. Once caught, it is almost impossible to escape."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Serposter");

    }


}
