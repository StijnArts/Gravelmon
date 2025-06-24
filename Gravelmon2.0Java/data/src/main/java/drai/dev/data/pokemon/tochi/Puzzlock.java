package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Puzzlock extends drai.dev.data.pokemon.Pokemon {
    public Puzzlock(Stats stats) {
        super("Puzzlock",
                Type.ROCK,Type.PSYCHIC,
                stats,
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                9, 0,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(18).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky()
                        .setSpawnPreset(SpawnPreset.TRAIL_RUINS).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Puzzlock");

    }


}
