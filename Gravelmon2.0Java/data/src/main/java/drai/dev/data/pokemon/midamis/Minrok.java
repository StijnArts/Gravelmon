package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Minrok extends drai.dev.data.pokemon.Pokemon {
    public Minrok() {
        super("Minrok",
                Type.ROCK, Type.POISON,
                new Stats(55,
                        45,
                        85,
                        30,
                        30,
                        40),
                List.of(Ability.DAMP), Ability.CHLOROPHYLL,
                7, 165,
                new Stats(0,0,1,0,0,0), 160,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MINERAL),
                List.of("Minrok are mossy Pokemon traits of Grass-types but are Poison / Rock types. They absorb light and are also fond of damp areas where they multiply very quickly and easily. They like to speed demonically through open fields, exhausting gases while doing it."),
                List.of(new EvolutionEntry("minryde", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_BLAST,1),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,5),
                        new MoveLearnSetEntry(Move.SMOG,8),
                        new MoveLearnSetEntry(Move.POISON_GAS,13),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,19)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_LUSH)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Minrok");

    }


}
