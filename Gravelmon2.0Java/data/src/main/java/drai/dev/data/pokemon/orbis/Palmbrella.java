package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Palmbrella extends drai.dev.data.pokemon.Pokemon {
    public Palmbrella() {
        super("Palmbrella",
                Type.GRASS,
                new Stats(85,
                        85,
                        85,
                        85,
                        85,
                        85),
                List.of(Ability.LEAF_GUARD), Ability.LEAF_GUARD,
                35, 1710,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                186, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Popular among tourists, Palmbrella lounge on beaches taking joy in granting shade to people and Pokemon alike. Their leaves are incredibly thick and keep out both the suns rays and rain."),
                List.of(),
                List.of(                      ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BEACH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Palmbrella");

    }


}
