package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Henquinn extends drai.dev.data.pokemon.Pokemon {
    public Henquinn() {
        super("Henquinn",
                Type.FAIRY, Type.PSYCHIC,
                new Stats(70,
                        80,
                        70,
                        130,
                        100,
                        80),
                List.of(Ability.GLIMMER), Ability.DAZZLING,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.13,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Henquinn");

    }


}
