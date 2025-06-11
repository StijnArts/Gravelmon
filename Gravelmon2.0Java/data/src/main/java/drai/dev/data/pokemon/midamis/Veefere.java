package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Veefere extends drai.dev.data.pokemon.Pokemon {
    public Veefere() {
        super("Veefere",
                Type.GRASS, Type.DARK,
                new Stats(75,
                        80,
                        85,
                        120,
                        90,
                        50),
                List.of(Ability.ANTICIPATION), Ability.ANTICIPATION,
                16, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(        new MoveLearnSetEntry(Move.BIND,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.VINE_WHIP,11),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,17),
                        new MoveLearnSetEntry(Move.INGRAIN,21),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,27),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,31),
                        new MoveLearnSetEntry(Move.SPIT_UP,37),
                        new MoveLearnSetEntry(Move.STOCKPILE,37),
                        new MoveLearnSetEntry(Move.SWALLOW,37),
                        new MoveLearnSetEntry(Move.CRUNCH,41),
                        new MoveLearnSetEntry(Move.SEED_BOMB,47),
                        new MoveLearnSetEntry(Move.POWER_WHIP,50)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(41)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SANDY)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Veefere");

    }


}
