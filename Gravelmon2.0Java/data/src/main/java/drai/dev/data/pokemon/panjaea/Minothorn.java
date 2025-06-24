package drai.dev.data.pokemon.panjaea;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Minothorn extends drai.dev.data.pokemon.Pokemon {
    public Minothorn(Stats stats) {
        super("Minothorn",
                Type.GRASS, Type.FIGHTING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                22, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PANJAEA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(37).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_GRASSLAND).duringDaytime().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Minothorn");

    }


}
