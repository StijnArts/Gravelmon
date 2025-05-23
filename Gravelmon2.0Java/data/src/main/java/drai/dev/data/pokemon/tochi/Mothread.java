package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mothread extends drai.dev.data.pokemon.Pokemon {
    public Mothread() {
        super("Mothread",
                Type.BUG,Type.FLYING,
                new Stats(65,
                        80,
                        45,
                        70,
                        45,
                        85),
                List.of(Ability.SWARM), Ability.OVERCOAT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is said that Mothread are extremely soft, so much so that laying your head on their back can almost instantly put someone to sleep, especially if they are stressed or tired."),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mothread");

    }


}
