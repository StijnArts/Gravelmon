package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Marvelish extends drai.dev.data.pokemon.Pokemon {
    public Marvelish() {
        super("Marvelish",
                Type.WATER, Type.DRAGON,
                new Stats(130,
                        70,
                        95,
                        80,
                        95,
                        70),
                List.of(Ability.SECRETINSIGHT,Ability.MARVEL_SCALE), Ability.MULTISCALE,
                27, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Marvelish tends to stand out and is popular among collectors. It fetches for a surprisingly high price as no one seems to have realised that it evolves from Colorlish..."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_FRESHWATER).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Marvelish");

    }


}
