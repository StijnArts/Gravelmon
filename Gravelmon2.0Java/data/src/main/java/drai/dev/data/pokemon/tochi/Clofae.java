package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Clofae extends drai.dev.data.pokemon.Pokemon {
    public Clofae(Stats stats) {
        super("Clofae",
                Type.GRASS,Type.FAIRY,
                stats,
                List.of(Ability.SUPER_LUCK), Ability.SUPER_LUCK,
                6, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Clofae are rare pokemon. They tend to live isolated in fields cover in clovers, and tend to live under or around four leaf clovers. It is said having one near you will bring you endless goodluck, but if one is angry with you it will curse you with bad luck for forever."),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_GRASSLAND).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Clofae");

    }


}
