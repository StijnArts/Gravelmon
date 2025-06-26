package drai.dev.data.pokemon.ultraspace;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Worminder extends drai.dev.data.pokemon.Pokemon {
    public Worminder(Stats stats) {
        super("Worminder",
                Type.PSYCHIC, Type.BUG,
                stats,
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                32, 0,
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
           setLangFileName("Worminder");

    }


}
