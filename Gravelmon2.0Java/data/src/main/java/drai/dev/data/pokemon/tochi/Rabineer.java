package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rabineer extends drai.dev.data.pokemon.Pokemon {
    public Rabineer(Stats stats) {
        super("Rabineer",
                Type.ELECTRIC,
                stats,
                List.of(Ability.TECHNICIAN), Ability.TECHNICIAN,
                14, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Rabinner seem to have an innate sense for fixing mechanisms and machinery, and are thus used as helpers in working on machines. They also seem to make rudimentary machine in the wild, independent of humans!"),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Rabineer");

    }


}
