package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hivernate extends drai.dev.data.pokemon.Pokemon {
    public Hivernate() {
        super("Hivernate",
                Type.ROCK, Type.BUG,
                new Stats(125,
                        80,
                        140,
                        50,
                        95,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,11),
                        new MoveLearnSetEntry(Move.CONFUSION,14),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,18),
                        new MoveLearnSetEntry(Move.MUD_SHOT,23),
                        new MoveLearnSetEntry(Move.TELEKINESIS,25),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,29),
                        new MoveLearnSetEntry(Move.AMBERWAVE,32),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,36),
                        new MoveLearnSetEntry(Move.PSYCHIC,42),
                        new MoveLearnSetEntry(Move.STICKY_WEB,47),
                        new MoveLearnSetEntry(Move.STONE_EDGE,51),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,56)            ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.HONEY_TREE)
    .build(), List.of());
	
        setCanFly(true);

    }


}
