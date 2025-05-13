package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Monstroach extends drai.dev.data.pokemon.Pokemon {
    public Monstroach() {
        super("Monstroach",
                Type.DARK,Type.NORMAL,
                new Stats(77,
                        90,
                        105,
                        50,
                        63,
                        115),
                List.of(Ability.RATTLED,Ability.FRISK), Ability.PRANKSTER,
                0, 0,
                new Stats(0,0,1,0,0,2), 30,
                0.5,
                177, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Monstroach");

    }


}
