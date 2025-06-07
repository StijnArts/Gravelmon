package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kingaskhan extends drai.dev.data.pokemon.Pokemon {
    public Kingaskhan() {
        super("Kingaskhan",
                Type.FIGHTING, Type.NORMAL,
                new Stats(100,
                        120,
                        90,
                        40,
                        65,
                        95),
                List.of(Ability.RECKLESS,Ability.SCRAPPY), Ability.INNER_FOCUS,
                0, 0,
                new Stats(1,2,0,0,0,0), 0,
                1.0,
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
                List.of());
           setLangFileName("Kingaskhan");

    }


}
