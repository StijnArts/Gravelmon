package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Woofoam extends drai.dev.data.pokemon.Pokemon {
    public Woofoam() {
        super("Woofoam",
                Type.WATER,Type.NORMAL,
                new Stats(95,
                        65,
                        75,
                        65,
                        100,
                        65),
                List.of(Ability.HEALER,Ability.SWIFT_SWIM), Ability.WATER_ABSORB,
                15, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(25).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NEAR_WATER).build(),
                List.of());
           setLangFileName("Woofoam");

    }


}
