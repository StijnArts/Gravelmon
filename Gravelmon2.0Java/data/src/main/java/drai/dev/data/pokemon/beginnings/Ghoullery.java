package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ghoullery extends drai.dev.data.pokemon.Pokemon {
    public Ghoullery(Stats stats) {
        super("Ghoullery",
                Type.GHOST,Type.PSYCHIC,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                21, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(41).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.MANSION).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Ghoullery");

    }


}
