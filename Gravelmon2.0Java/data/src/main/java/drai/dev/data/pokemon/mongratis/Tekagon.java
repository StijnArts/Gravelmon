package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tekagon extends drai.dev.data.pokemon.Pokemon {
    public Tekagon() {
        super("Tekagon",
                Type.ROCK, Type.DRAGON,
                new Stats(110,
                        98,
                        132,
                        68,
                        82,
                        55),
                List.of(Ability.SOLID_ROCK), Ability.ROCK_HEAD,
                29, 3104,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tekagon roam their territory in search of plants to eat. They are blind, but can feel vibrations through the ground from great distances. Tekagon recognize the vibrations their family gives off."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(43)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tekagon");

    }


}
