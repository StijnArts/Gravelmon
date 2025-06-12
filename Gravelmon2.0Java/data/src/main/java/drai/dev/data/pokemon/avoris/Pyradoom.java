package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pyradoom extends drai.dev.data.pokemon.Pokemon {
    public Pyradoom() {
        super("Pyradoom",
                Type.ROCK, Type.GROUND,
                new Stats(89,
                        55,
                        95,
                        80,
                        95,
                        40),
                List.of(Ability.SHELL_ARMOR,Ability.WATER_COMPACTION,Ability.SAND_FORCE), Ability.SAND_FORCE,
                12, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hiding its lower self in the sand, the gold bits on its shell shine to attract curious prey. As prey approaches, it quickly grabs them and drags them under the sand."),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,5),
                        new MoveLearnSetEntry(Move.MUD_SPORT,10),
                        new MoveLearnSetEntry(Move.MUD_BOMB,12),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,16),
                        new MoveLearnSetEntry(Move.BLOCK,20),
                        new MoveLearnSetEntry(Move.BULLDOZE,23),
                        new MoveLearnSetEntry(Move.QUASH,27),
                        new MoveLearnSetEntry(Move.RELICPILLAR,31),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,35),
                        new MoveLearnSetEntry(Move.EARTH_POWER,40),
                        new MoveLearnSetEntry(Move.STONE_EDGE,46),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,52)              ),
                List.of(Label.AVORIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(37)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.DESERT_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Pyradoom");

    }


}
