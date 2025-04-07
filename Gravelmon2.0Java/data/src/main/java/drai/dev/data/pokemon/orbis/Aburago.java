package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Aburago extends drai.dev.data.pokemon.Pokemon {
    public Aburago() {
        super("Aburago",
                Type.FIRE, Type.GHOST,
                new Stats(30,
                        20,
                        25,
                        60,
                        40,
                        60),
                List.of(Ability.FLASH_FIRE), Ability.FLASH_FIRE,
                3, 0,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                68, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Aburago travel streets at night in search for the flames of lamps and candles to consume. People often light candles in their homes which are rudely put out by a passing Aburago."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.HEX,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Aburago");

    }


}
