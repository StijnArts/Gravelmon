package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snowly extends drai.dev.data.pokemon.Pokemon {
    public Snowly() {
        super("Snowly",
                Type.ICE, Type.FLYING,
                new Stats(85,
                        60,
                        100,
                        60,
                        90,
                        75),
                List.of(Ability.SNOW_CLOAK,Ability.OVERCOAT), Ability.CLOUD_NINE,
                14, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its wings are better suited to protection than flying. In bad weather, it shelters under its wings to stay warm. Its talons grip hard to rocks to keep from being blown away during harsh storms."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Snowly");

    }


}
