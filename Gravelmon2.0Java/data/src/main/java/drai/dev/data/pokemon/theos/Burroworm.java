package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Burroworm extends drai.dev.data.pokemon.Pokemon {
    public Burroworm() {
        super("Burroworm",
                Type.BUG,Type.GROUND,
                new Stats(103,
                        92,
                        61,
                        50,
                        61,
                        108),
                List.of(Ability.EARTH_EATER), Ability.REGENERATOR,
                0, 0,
                new Stats(0,0,0,0,0,2), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Burroworm");

    }


}
