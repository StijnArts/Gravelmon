package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Submurchin extends drai.dev.data.pokemon.Pokemon {
    public Submurchin() {
        super("Submurchin",
                Type.DARK, Type.STEEL,
                new Stats(95,
                        95,
                        90,
                        50,
                        135,
                        32),
                List.of(Ability.IRON_BARBS), Ability.STURDY,
                0, 2018,
                new Stats(0,0,0,0,2,0), 45,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Though hard as steel, its spikes are so sensitive to movement that a fast current might cause them to explode."),
                List.of(),
                List.of(),
                List.of(Label.DHIOME),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Submurchin");

    }


}
