package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tunnoworm extends drai.dev.data.pokemon.Pokemon {
    public Tunnoworm() {
        super("Burroworm",
                Type.BUG, Type.GROUND,
                new Stats(103,
                        92,
                        61,
                        50,
                        61,
                        108),
                List.of(Ability.EARTH_EATER), Ability.REGENERATOR,
                15, 0,
                new Stats(0,0,0,0,0,2), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(27).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NEAR_CROPS).build(),
                List.of());
           setLangFileName("Tunnoworm");

    }


}
