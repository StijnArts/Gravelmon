package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Toxiver extends drai.dev.data.pokemon.Pokemon {
    public Toxiver() {
        super("Toxiver",
                Type.WATER, Type.POISON,
                new Stats(66,
                        90,
                        65,
                        90,
                        76,
                        80),
                List.of(Ability.POISON_POINT), Ability.SWIFT_SWIM,
                14, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Toxiver are ruthless and groups of them can contaminate entire stretches of water. One's spikes can kill a grown man."),
                List.of(),
                List.of(                    new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,4),
                        new MoveLearnSetEntry(Move.WATER_GUN,8),
                        new MoveLearnSetEntry(Move.FELL_STINGER,12),
                        new MoveLearnSetEntry(Move.MINIMIZE,16),
                        new MoveLearnSetEntry(Move.SPIKES,20),
                        new MoveLearnSetEntry(Move.BRINE,24),
                        new MoveLearnSetEntry(Move.POISON_JAB,28),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,32),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,36),
                        new MoveLearnSetEntry(Move.SPIT_UP,40),
                        new MoveLearnSetEntry(Move.STOCKPILE,40),
                        new MoveLearnSetEntry(Move.TOXIC,44),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,48),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,52),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,56)    ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
