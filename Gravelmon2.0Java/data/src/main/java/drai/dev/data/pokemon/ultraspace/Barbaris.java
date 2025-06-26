package drai.dev.data.pokemon.ultraspace;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Barbaris extends drai.dev.data.pokemon.Pokemon {
    public Barbaris(Stats stats) {
        super("Barbaris",
                Type.STEEL, Type.NORMAL,
                stats,
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                17, 0,
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
           setLangFileName("Barbaris");

    }


}
