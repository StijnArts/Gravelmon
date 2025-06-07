package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Terranguis extends drai.dev.data.pokemon.Pokemon {
    public Terranguis() {
        super("Terranguis",
                Type.GRASS, Type.DRAGON,
                new Stats(100,
                        150,
                        120,
                        100,
                        103,
                        97),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                100, 6048,
                new Stats(0,3,1,0,0,0), 5,
                -1.0,
                300, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Terranguis");

    }


}
