package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sharquake extends drai.dev.data.pokemon.Pokemon {
    public Sharquake() {
        super("Sharquake",
                Type.GROUND, Type.ELECTRIC,
                new Stats(70,
                        100,
                        55,
                        65,
                        120,
                        75),
                List.of(Ability.STATIC), Ability.LIGHTNING_ROD,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It digs so fast through the ground, it seems as if it is swimming. It uplifts the earth as it moves, causing tremors and damage to roads in its wake."),
                List.of(),
                List.of(),
                List.of(Label.DHIOME),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Sharquake");

    }


}
