package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cocadoom extends drai.dev.data.pokemon.Pokemon {
    public Cocadoom() {
        super("Cocadoom",
                Type.PSYCHIC, Type.FLYING,
                new Stats(73,
                        85,
                        66,
                        85,
                        69,
                        107),
                List.of(Ability.INSOMNIA,Ability.PERCEIVE), Ability.CLAIRVOYANCE,
                9, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("The reason Pokémon constantly looks worried is because of what it sees in the future. It is believed to be able to temporarily project these visions onto others, sending them into fits of madness."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(23).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Cocadoom");

    }


}
