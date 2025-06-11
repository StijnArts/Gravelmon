package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Merluscious extends drai.dev.data.pokemon.Pokemon {
    public Merluscious() {
        super("Merluscious",
                Type.ROCK, Type.POISON,
                new Stats(61,
                        104,
                        64,
                        99,
                        59,
                        83),
                List.of(Ability.DISGUISE), Ability.DISGUISE,
                12, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                165, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,15),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,20),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,30),
                        new MoveLearnSetEntry(Move.REEFBARRIER,35),
                        new MoveLearnSetEntry(Move.VENOSHOCK,40),
                        new MoveLearnSetEntry(Move.LIQUEFACTION,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(11)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
