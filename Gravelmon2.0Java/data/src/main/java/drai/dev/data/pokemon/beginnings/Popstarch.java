package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Popstarch extends drai.dev.data.pokemon.Pokemon {
    public Popstarch() {
        super("Popstarch",
                Type.GRASS,Type.NORMAL,
                new Stats(55,
                        87,
                        45,
                        111,
                        88,
                        99),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(28).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_GRASSLAND).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NEAR_CROPS).build(),
                List.of());
           setLangFileName("Popstarch");

    }


}
