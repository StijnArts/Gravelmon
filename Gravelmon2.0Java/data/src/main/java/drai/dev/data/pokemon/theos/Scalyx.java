package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scalyx extends drai.dev.data.pokemon.Pokemon {
    public Scalyx() {
        super("Scalyx",
                Type.DRAGON,
                new Stats(60,
                        80,
                        50,
                        30,
                        40,
                        40),
                List.of(Ability.RIVALRY), Ability.POISON_HEAL,
                9, 150,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Scalyx are very aggressive and mean Pokémon. People prefer to stay away from them as they're known to bite leaving a deep wound."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Scalyx");

    }


}
