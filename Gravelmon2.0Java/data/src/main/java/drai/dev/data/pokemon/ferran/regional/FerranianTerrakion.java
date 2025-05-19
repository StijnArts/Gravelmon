package drai.dev.data.pokemon.ferran.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FerranianTerrakion extends drai.dev.data.pokemon.Pokemon {
    public FerranianTerrakion(String name, Aspect aspect) {
        super(name, aspect, "FerranianTerrakion",
                Type.FIRE,Type.FIGHTING,
                new Stats(149,
                        126,
                        126,
                        44,
                        107,
                        25),
                List.of(), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FERRAN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Terrakion");

    }


}
