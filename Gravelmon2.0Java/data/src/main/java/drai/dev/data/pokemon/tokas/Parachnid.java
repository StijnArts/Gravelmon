package drai.dev.data.pokemon.tokas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Parachnid extends drai.dev.data.pokemon.Pokemon {
    public Parachnid(Stats stats) {
        super("Parachnid",
                Type.BUG, Type.FLYING,
                stats,
                List.of(Ability.UNBURDEN), Ability.UNBURDEN,
                15, 0,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TOKAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(25).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Parachnid");

    }


}
