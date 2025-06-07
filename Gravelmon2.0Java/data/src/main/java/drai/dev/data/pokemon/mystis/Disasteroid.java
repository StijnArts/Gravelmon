package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Disasteroid extends drai.dev.data.pokemon.Pokemon {
    public Disasteroid() {
        super("Disasteroid",
                Type.ROCK, Type.FIRE,
                new Stats(80,
                        131,
                        100,
                        45,
                        70,
                        129),
                List.of(Ability.LEVITATE,Ability.ROCK_HEAD), Ability.RECKLESS,
                16, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_END)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Disasteroid");

    }


}
