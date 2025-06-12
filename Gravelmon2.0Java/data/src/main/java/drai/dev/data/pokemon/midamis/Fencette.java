package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Fencette extends drai.dev.data.pokemon.Pokemon {
    public Fencette() {
        super("Fencette",
                Type.WATER, Type.STEEL,
                new Stats(85,
                        105,
                        80,
                        95,
                        70,
                        100),
                List.of(Ability.WATER_VEIL), Ability.JUSTIFIED,
                15, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(  new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.WATER_GUN,8),
                        new MoveLearnSetEntry(Move.CHARM,11),
                        new MoveLearnSetEntry(Move.PECK,15),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,18),
                        new MoveLearnSetEntry(Move.SWAGGER,22),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,25),
                        new MoveLearnSetEntry(Move.BRINE,29),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,32),
                        new MoveLearnSetEntry(Move.MIST,36),
                        new MoveLearnSetEntry(Move.DRILL_PECK,39),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,43)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
