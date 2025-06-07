package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wisdaum extends drai.dev.data.pokemon.Pokemon {
    public Wisdaum() {
        super("Wisdaum",
                Type.NORMAL, Type.PSYCHIC,
                new Stats(110,
                        128,
                        66,
                        101,
                        88,
                        67),
                List.of(Ability.WONDER_SKIN,Ability.SUPER_LUCK), Ability.UNAWARE,
                17, 1256,
                new Stats(2,3,0,0,0,0), 30,
                0.5,
                177, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.HUMAN_LIKE),
                List.of("It lives in seclusion, defending its tail with its four hands. It is said that the sound of its tail is the sound of enlightenment itself."),
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
           setLangFileName("Wisdaum");

    }


}
