package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Aleglarlure extends drai.dev.data.pokemon.Pokemon {
    public Aleglarlure() {
        super("Aleglarlure",
                Type.DARK, Type.WATER,
                new Stats(75,
                        124,
                        95,
                        75,
                        75,
                        40),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BIDE,4),
                        new MoveLearnSetEntry(Move.BUBBLE,7),
                        new MoveLearnSetEntry(Move.PROTECT,9),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,13),
                        new MoveLearnSetEntry(Move.ENDURE,16),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,19),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,23),
                        new MoveLearnSetEntry(Move.BRINE,28),
                        new MoveLearnSetEntry(Move.SPIKES,32),
                        new MoveLearnSetEntry(Move.GYRO_BALL,37),
                        new MoveLearnSetEntry(Move.PUNISHMENT,43),
                        new MoveLearnSetEntry(Move.COUNTER,49),
                        new MoveLearnSetEntry(Move.QUASH,56),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,61)                  ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FOLIAGE)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
