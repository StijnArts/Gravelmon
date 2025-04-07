package drai.dev.data.pokemon.ottora;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Jueshika extends drai.dev.data.pokemon.Pokemon {
    public Jueshika() {
        super("Jueshika",
                Type.ELECTRIC,
                new Stats(48,
                        43,
                        40,
                        60,
                        46,
                        80),
                List.of(Ability.SAP_SIPPER,Ability.STATIC), Ability.GOOEY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Evolves into Juekizumi by using Maple Syrup on 5 times"),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Jueshika");

    }


}
