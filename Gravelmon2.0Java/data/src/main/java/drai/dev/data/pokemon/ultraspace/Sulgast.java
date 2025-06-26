package drai.dev.data.pokemon.ultraspace;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sulgast extends drai.dev.data.pokemon.Pokemon {
    public Sulgast(Stats stats) {
        super("Sulgast",
                Type.DARK, Type.GHOST,
                stats,
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                18, 0,
                new Stats(0,0,0,0,0,0), 45,
                -1,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ULTRASPACE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .abnormality()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_END)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Sulgast");

    }


}
