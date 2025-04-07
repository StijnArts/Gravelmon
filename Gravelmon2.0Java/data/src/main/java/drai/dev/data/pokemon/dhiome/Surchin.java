package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Surchin extends drai.dev.data.pokemon.Pokemon {
    public Surchin() {
        super("Surchin",
                Type.DARK, Type.WATER,
                new Stats(65,
                        35,
                        65,
                        35,
                        95,
                        30),
                List.of(Ability.IRON_BARBS), Ability.STURDY,
                8, 39,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("At night, it scavenges the seafloor for discarded shells to fortify its armor. Its eyes allow it to see in the murky darkness."),
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
           setLangFileName("Surchin");

    }


}
