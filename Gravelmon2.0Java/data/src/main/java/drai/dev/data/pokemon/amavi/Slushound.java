package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Slushound extends drai.dev.data.pokemon.Pokemon {
    public Slushound() {
        super("Slushound",
                Type.ICE,
                new Stats(70,
                        115,
                        70,
                        89,
                        70,
                        120),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.MIST,10),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,20),
                        new MoveLearnSetEntry(Move.ICY_WIND,25),
                        new MoveLearnSetEntry(Move.FREEZEDRY,30),
                        new MoveLearnSetEntry(Move.AFTER_YOU,35),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,40),
                        new MoveLearnSetEntry(Move.SWAGGER,45),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,50),
                        new MoveLearnSetEntry(Move.SHEER_COLD,55)              ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Slushound");

    }


}
