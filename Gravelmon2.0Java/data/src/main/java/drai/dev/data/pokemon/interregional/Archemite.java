package drai.dev.data.pokemon.interregional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Archemite extends drai.dev.data.pokemon.Pokemon {
    public Archemite() {
        super("Archemite",
                Type.ROCK,
                new Stats(70,
                        100,
                        124,
                        72,
                        95,
                        34),
                List.of(Ability.NO_GUARD), Ability.PRESSURE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Archemite");

    }


}
