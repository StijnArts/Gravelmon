package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hallusage extends drai.dev.data.pokemon.Pokemon {
    public Hallusage(Stats stats) {
        super("Hallusage",
                Type.PSYCHIC, Type.FAIRY,
                stats,
                List.of(Ability.TRIAGE), Ability.PSYCHIC_SURGE,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.6,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(42).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Hallusage");

    }


}
