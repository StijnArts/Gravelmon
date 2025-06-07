package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sylvotaur extends drai.dev.data.pokemon.Pokemon {
    public Sylvotaur() {
        super("Sylvotaur",
                Type.GRASS, Type.FIGHTING,
                new Stats(85,
                        130,
                        120,
                        60,
                        75,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                20, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Sylvotaur");

    }


}
