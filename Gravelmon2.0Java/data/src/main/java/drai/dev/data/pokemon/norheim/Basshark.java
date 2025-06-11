package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Basshark extends drai.dev.data.pokemon.Pokemon {
    public Basshark() {
        super("Basshark",
                Type.WATER, Type.ELECTRIC,
                new Stats(95,
                        80,
                        75,
                        105,
                        85,
                        80),
                List.of(Ability.MAGNET_PULL,Ability.LIQUID_VOICE,Ability.MEGA_LAUNCHER), Ability.MEGA_LAUNCHER,
                28, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Basshark provides strong currents to the Ore Sea, creating whats known as the Gold Stream. It can launch other Pokemon with its powered tuck mouth; that also captures large quantities of Sardiner in the process."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HYPER_VOICE,1),
                        new MoveLearnSetEntry(Move.BOOMBURST,56),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                new MoveLearnSetEntry(Move.PSYWAVE,6),
                new MoveLearnSetEntry(Move.YAWN,8),
                new MoveLearnSetEntry(Move.ALLY_SWITCH,14),
                new MoveLearnSetEntry(Move.AQUA_JET,18),
                new MoveLearnSetEntry(Move.AGILITY,20),
                new MoveLearnSetEntry(Move.DISCHARGE,24),
                new MoveLearnSetEntry(Move.AQUA_RING,28),
                new MoveLearnSetEntry(Move.WATER_PULSE,32),
                new MoveLearnSetEntry(Move.FLAIL,38),
                new MoveLearnSetEntry(Move.LIQUIDATION,48),
                new MoveLearnSetEntry(Move.THUNDER_WAVE,54),
                new MoveLearnSetEntry(Move.AFTER_YOU,"tm"),
                new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                new MoveLearnSetEntry(Move.REST,"tm"),
                new MoveLearnSetEntry(Move.DIVE,"tm"),
                new MoveLearnSetEntry(Move.RAIN_DANCE,"tm")                        ),
        List.of(Label.NORHEIM),
                0, List.of(
        ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
