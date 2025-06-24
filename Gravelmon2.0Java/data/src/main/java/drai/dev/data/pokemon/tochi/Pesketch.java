package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pesketch extends drai.dev.data.pokemon.Pokemon {
    public Pesketch(Stats stats) {
        super("Pesketch",
                Type.WATER,Type.GRASS,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Pesketch have a thin and pale body that is perfect for disguising themselves on the white sand of their natural habitats. Some believe Pesketch came into existence when a child dropped their drawing of a fish into the ocean."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SKETCH,1)),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_WARM_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.REEF).build(),
                List.of());
        setAquatic();
           setLangFileName("Pesketch");

    }


}
