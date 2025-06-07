package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Terrosect extends drai.dev.data.pokemon.Pokemon {
    public Terrosect(Stats stats) {
        super("Terrosect",
                Type.BUG,
                stats,
                List.of(Ability.TECHNICIAN), Ability.TECHNICIAN,
                18, 0,
                new Stats(0,0,0,0,0,0), 6,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .subLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Terrosect");

    }


}
