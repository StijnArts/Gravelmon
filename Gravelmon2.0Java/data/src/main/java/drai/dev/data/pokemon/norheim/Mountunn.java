package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Mountunn extends drai.dev.data.pokemon.Pokemon {
    public Mountunn(Stats stats) {
        super("Mountunn",
                Type.ELECTRIC, Type.ROCK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                38, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TRI_ATTACK,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,4),
                        new MoveLearnSetEntry(Move.BLOCK,7),
                        new MoveLearnSetEntry(Move.ROLLOUT,10),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,13),
                        new MoveLearnSetEntry(Move.POISON_GAS,16),
                        new MoveLearnSetEntry(Move.SPARK,19),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,22),
                        new MoveLearnSetEntry(Move.POWER_GEM,25),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,27),
                        new MoveLearnSetEntry(Move.BELCH,29),
                        new MoveLearnSetEntry(Move.DISCHARGE,31),
                        new MoveLearnSetEntry(Move.EARTH_POWER,34),
                        new MoveLearnSetEntry(Move.BODY_PRESS,37),
                        new MoveLearnSetEntry(Move.STONE_EDGE,40),
                        new MoveLearnSetEntry(Move.THUNDER,43)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(41)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Mountunn");

    }


}
