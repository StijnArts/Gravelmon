package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Typhoonos extends drai.dev.data.pokemon.Pokemon {
    public Typhoonos(Stats stats) {
        super("Typhoonos",
                Type.FIRE, Type.GROUND,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Typherior has been granted the gift of spirit fire. Blue flames that gives off a cold sensation rather than hot. If a trainer befriends a Typherior, it may surrender on causing chaos and mayhem to the world of Pokémon."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 35, 51, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Typhoonos");

    }


}
