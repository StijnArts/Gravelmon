package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Juekizumi extends drai.dev.data.pokemon.Pokemon {
    public Juekizumi() {
        super("Juekizumi",
                Type.ELECTRIC,Type.GRASS,
                new Stats(100,
                        62,
                        60,
                        102,
                        104,
                        50),
                List.of(Ability.SAP_SIPPER,Ability.STATIC), Ability.UNAWARE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Juekizumi");

    }


}
