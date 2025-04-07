package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Koiver extends drai.dev.data.pokemon.Pokemon {
    public Koiver() {
        super("Koiver",
                Type.WATER,
                new Stats(70,
                        16,
                        60,
                        50,
                        70,
                        24),
                List.of(Ability.OWN_TEMPO,Ability.MARVEL_SCALE), Ability.OBLIVIOUS,
                4, 45,
                new Stats(1,0,0,0,0,0), 200,
                0.5,
                41, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Koiver live in freshwater rivers and ponds, they are very slow paced and live up to a hundred years. They are popular to use as bait for larger fish."),
                List.of(new EvolutionEntry("koyshi", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.SOAK,7),
                        new MoveLearnSetEntry(Move.FLAIL,13),
                        new MoveLearnSetEntry(Move.BRINE,18),
                        new MoveLearnSetEntry(Move.HEADBUTT,22),
                        new MoveLearnSetEntry(Move.MUD_SHOT,27),
                        new MoveLearnSetEntry(Move.AQUA_RING,30),
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
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(5).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_FRESHWATER).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Koiver");

    }


}
