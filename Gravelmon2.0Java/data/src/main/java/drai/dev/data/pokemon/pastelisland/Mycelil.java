package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mycelil extends drai.dev.data.pokemon.Pokemon {
    public Mycelil() {
        super("Mycelil",
                Type.GRASS,
                new Stats(30,
                        25,
                        35,
                        45,
                        36,
                        20),
                List.of(Ability.EFFECT_SPORE), Ability.CHLOROPHYLL,
                23, 13,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                38, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Mycelil like to stay in one place, only moving when they have drained the nutrients from the ground. Their mushrooms glow in the dark."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mycelil");

    }


}
