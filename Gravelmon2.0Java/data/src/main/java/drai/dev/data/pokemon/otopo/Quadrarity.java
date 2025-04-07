package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Quadrarity extends drai.dev.data.pokemon.Pokemon {
    public Quadrarity() {
        super("Quadrarity",
                Type.STEEL, Type.ELECTRIC,
                new Stats(80,
                        30,
                        48,
                        150,
                        42,
                        150),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                225, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The consequence of four Dioduo combining is Quadrarity. Due to the quick spinning of the electric, it blasts out in all directions."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Quadrarity");

    }


}
