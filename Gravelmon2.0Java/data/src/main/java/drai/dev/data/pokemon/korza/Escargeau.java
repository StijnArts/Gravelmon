package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Escargeau extends drai.dev.data.pokemon.Pokemon {
    public Escargeau() {
        super("Escargeau",
                Type.WATER,
                new Stats(100,
                        28,
                        38,
                        54,
                        55,
                        15),
                List.of(Ability.WATER_ABSORB,Ability.STICKY_HOLD), Ability.GOOEY,
                6, 301,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.WATER_1),
                List.of("Its skin is elastic and slippery. If Escargeau travel too far from water, its skin will dry out and slow it down drastically."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Escargeau");

    }


}
