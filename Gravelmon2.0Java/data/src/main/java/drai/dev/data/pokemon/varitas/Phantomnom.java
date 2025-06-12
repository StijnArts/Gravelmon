package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Phantomnom extends drai.dev.data.pokemon.Pokemon {
    public Phantomnom(Stats stats) {
        super("Phantomnom",
                Type.GHOST, Type.POISON,
                stats,
                List.of(Ability.GLUTTONY,Ability.THICK_FAT,Ability.GOOEY), Ability.GOOEY,
                17, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Phantomnom can store many things inside their bodies, but anything that get stored becomes covered in drool. This drool is incredibly slimy and gives anyone touched by it extreme chills and a feeling of immense disgust and nausea, even if they felt perfectly fine beforehand."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SMOG,7),
                        new MoveLearnSetEntry(Move.REFRESH,12),
                        new MoveLearnSetEntry(Move.SLUDGE,15),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,19),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,22),
                        new MoveLearnSetEntry(Move.PURIFY,25),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,28),
                        new MoveLearnSetEntry(Move.SWALLOW,32),
                        new MoveLearnSetEntry(Move.TOXICFUMES,35),
                        new MoveLearnSetEntry(Move.CROPCIRCLE,38),
                        new MoveLearnSetEntry(Move.STORED_POWER,42),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,46)
                ),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DEEP_DARK)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Phantomnom");

    }


}
