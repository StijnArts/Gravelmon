package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cassoworry extends drai.dev.data.pokemon.Pokemon {
    public Cassoworry(Stats stats) {
        super("Cassoworry",
                Type.GROUND,Type.FIGHTING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(23).setPool(SpawnPool.RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Cassoworry");

    }


}
