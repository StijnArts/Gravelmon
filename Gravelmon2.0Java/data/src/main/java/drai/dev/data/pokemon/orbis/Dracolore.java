package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dracolore extends drai.dev.data.pokemon.Pokemon {
    public Dracolore() {
        super("Dracolore",
                Type.WATER, Type.DRAGON,
                new Stats(95,
                        60,
                        79,
                        125,
                        100,
                        81),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                52, 2050,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                189, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Dracolore");

    }


}
