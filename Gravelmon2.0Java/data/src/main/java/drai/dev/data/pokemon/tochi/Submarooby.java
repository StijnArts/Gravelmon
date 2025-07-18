package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Submarooby extends drai.dev.data.pokemon.Pokemon {
    public Submarooby(Stats stats) {
        super("Submarooby",
                Type.STEEL,Type.ICE,
                stats,
                List.of(Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                16, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Submarooby has adapted to be able to spend long periods of time under ce sheets to hunt its prey. Its wings and beak are as hard as steel and are used to break through layers of ice and also to fight!"),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(36).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_COLD_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setAquatic();
           setLangFileName("Submarooby");

    }


}
