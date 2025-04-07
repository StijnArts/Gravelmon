package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vulkynamo extends drai.dev.data.pokemon.Pokemon {
    public Vulkynamo() {
        super("Vulkynamo",
                Type.FIRE, Type.ELECTRIC,
                new Stats(70,
                        52,
                        50,
                        147,
                        120,
                        85),
                List.of(Ability.BLAZE), Ability.STATIC,
                21, 663,
                new Stats(0,0,0,3,0,0), 45,
                0.875,
                236, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of("With it's unique hooves it can gallop over any lava or fire. The horns on it's head is charged with high electricity."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).duringDaytime().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Vulkynamo");

    }


}
