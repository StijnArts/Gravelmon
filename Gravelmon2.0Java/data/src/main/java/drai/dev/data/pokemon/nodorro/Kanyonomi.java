package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kanyonomi extends drai.dev.data.pokemon.Pokemon {
    public Kanyonomi() {
        super("Kanyonomi",
                Type.GRASS, Type.GHOST,
                new Stats(99,
                        91,
                        80,
                        120,
                        70,
                        120),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                6, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("kanashi Kan'yo yonomi"),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .subLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).duringDaytime().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Kanyonomi");

    }


}
