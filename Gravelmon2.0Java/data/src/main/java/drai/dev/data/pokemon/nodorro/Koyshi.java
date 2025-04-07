package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Koyshi extends drai.dev.data.pokemon.Pokemon {
    public Koyshi() {
        super("Koyshi",
                Type.WATER,
                new Stats(101,
                        24,
                        80,
                        78,
                        90,
                        48),
                List.of(Ability.OWN_TEMPO,Ability.MARVEL_SCALE), Ability.OBLIVIOUS,
                12, 201,
                new Stats(2,0,0,0,1,0), 60,
                0.5,
                186, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Koyshi are known all over Nodorro for their beautifull scales and their incredible taste."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.SOAK,4),
                        new MoveLearnSetEntry(Move.FLAIL,8),
                        new MoveLearnSetEntry(Move.BRINE,12),
                        new MoveLearnSetEntry(Move.HEADBUTT,18),
                        new MoveLearnSetEntry(Move.MUD_SHOT,23),
                        new MoveLearnSetEntry(Move.AQUA_RING,27),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,32),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,36),
                        new MoveLearnSetEntry(Move.PSYBEAM,44),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"tm"),
                        new MoveLearnSetEntry(Move.WATER_SPORT,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(20).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_FRESHWATER).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Koyshi");

    }


}
