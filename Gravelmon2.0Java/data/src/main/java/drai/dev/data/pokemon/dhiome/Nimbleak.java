package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nimbleak extends drai.dev.data.pokemon.Pokemon {
    public Nimbleak(Stats stats) {
        super("Nimbleak",
                Type.POISON,
                stats,
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                7, 0,
                new Stats(0,0,0,0,0,0), 122,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A common sight above large industrial cities, they gather in groups where conditions are favorable."),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.YAWN,5),
                        new MoveLearnSetEntry(Move.POISON_GAS,8),
                        new MoveLearnSetEntry(Move.SLUDGE,10),
                        new MoveLearnSetEntry(Move.AMNESIA,12),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,17),
                        new MoveLearnSetEntry(Move.ENCORE,20),
                        new MoveLearnSetEntry(Move.TOXIC,25),
                        new MoveLearnSetEntry(Move.SPIT_UP,28),
                        new MoveLearnSetEntry(Move.STOCKPILE,28),
                        new MoveLearnSetEntry(Move.SWALLOW,28),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,33),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,36),
                        new MoveLearnSetEntry(Move.BELCH,41),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,44),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,49)             ),
                List.of(Label.DHIOME),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(8)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Nimbleak");

    }


}
