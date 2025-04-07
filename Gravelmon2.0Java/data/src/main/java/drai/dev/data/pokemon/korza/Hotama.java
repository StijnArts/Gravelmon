package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hotama extends drai.dev.data.pokemon.Pokemon {
    public Hotama() {
        super("Hotama",
                Type.NORMAL,
                new Stats(56,
                        45,
                        41,
                        32,
                        21,
                        25),
                List.of(Ability.MAGIC_BOUNCE), Ability.RUN_AWAY,
                1, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                44, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hotama uses its cheeks to reverberate through the water in small bursts and communicate with others. When one senses trouble, their pond echos in these beats as they scatter for safety."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hotama");

    }


}
