package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Conkamite extends drai.dev.data.pokemon.Pokemon {
    public Conkamite() {
        super("Conkamite",
                Type.WATER, Type.ROCK,
                new Stats(86,
                        78,
                        110,
                        54,
                        55,
                        23),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of( new MoveLearnSetEntry(Move.BUBBLE, 1),
                        new MoveLearnSetEntry(Move.PEBBLE_SHOT, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.WATER_GUN, 7),
                        new MoveLearnSetEntry(Move.HELPING_HAND, 10),
                        new MoveLearnSetEntry(Move.ROCK_THROW, 13),
                        new MoveLearnSetEntry(Move.FURY_SWIPES, 14),
                        new MoveLearnSetEntry(Move.SMOKESCREEN, 16),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, 20),
                        new MoveLearnSetEntry(Move.SCREECH, 21),
                        new MoveLearnSetEntry(Move.POISON_GAS, 25),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 27),
                        new MoveLearnSetEntry(Move.SAND_WAVE, 29),
                        new MoveLearnSetEntry(Move.AQUA_RING, 32),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, 34)               ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_CAVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Conkamite");

    }


}
