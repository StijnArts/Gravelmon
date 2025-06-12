package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ancervus extends drai.dev.data.pokemon.Pokemon {
    public Ancervus(Stats stats) {
        super("Ancervus",
                Type.ROCK, Type.ICE,
                stats,
                List.of(Ability.HYPER_CUTTER), Ability.HYPER_CUTTER,
                21, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its large horns are made of ice that doesn't melt. In the Ice Age, the horns grew to great sizes."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,4),
                        new MoveLearnSetEntry(Move.STOMP,12),
                        new MoveLearnSetEntry(Move.BIDE,16),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,20),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,24),
                        new MoveLearnSetEntry(Move.MIST,28),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,32),
                        new MoveLearnSetEntry(Move.ENDURE,40),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,44),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,48),
                        new MoveLearnSetEntry(Move.STONE_EDGE,52),
                        new MoveLearnSetEntry(Move.BLIZZARD,58)                 ),
                List.of(Label.DHIOME),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ancervus");

    }


}
