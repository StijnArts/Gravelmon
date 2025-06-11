package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Balacier extends drai.dev.data.pokemon.Pokemon {
    public Balacier() {
        super("Balacier",
                Type.ICE,
                new Stats(91,
                        84,
                        91,
                        85,
                        72,
                        72),
                List.of(Ability.SNOWPLOW), Ability.ROUGH_SKIN,
                58, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                173, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_2),
                List.of("A filter feeder, it inhales water and blows it out in the form of snow from its blow-hole. Because of this, their pods are always enshrouded in misty, underwater snowstorms. The cold surroundings freeze their prey and leave them unable to escape their giant, gaping mouths."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.DIVE,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,1),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,1),
                        new MoveLearnSetEntry(Move.ICY_CHARGE,1),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,1),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,1),
                        new MoveLearnSetEntry(Move.BODY_SLAM,1),
                        new MoveLearnSetEntry(Move.BODY_PRESS,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.DEPTH_CHARGE,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(44)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_FROZEN_OCEAN)
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
