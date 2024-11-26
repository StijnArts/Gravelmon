package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Chromagen extends Pokemon {
    public Chromagen() {
        super("Chromagen",
                Type.STEEL,
                new Stats(115,
                        75,
                        110,
                        65,
                        90,
                        70),
                List.of(Ability.IRON_BARBS, Ability.MIRROR_ARMOR), Ability.FERROFLUX,
                15, 365,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.DRAGON),
                List.of("Chromagen are frequently spotted roaming the mountainside with Hattena riding on their backs. They roam around, defending lesser Pokémon they encounter along the way, especially against Bludgen. "),
                List.of(),
                List.of(
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 33, 54, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
