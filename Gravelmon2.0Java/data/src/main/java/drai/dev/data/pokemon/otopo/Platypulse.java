package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Platypulse extends drai.dev.data.pokemon.Pokemon {
    public Platypulse(Stats stats) {
        super("Platypulse",
                Type.POISON, Type.ELECTRIC,
                stats,
                List.of(Ability.SUPERCHARGE), Ability.SUPERCHARGE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("It submerges its tail in water and emits electrical pulses that confuse its target, allowing it to utilise its barbed bill to inject poison."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_PULSE,1)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Platypulse");

    }


}
