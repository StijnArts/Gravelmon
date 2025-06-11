package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Kitsunny extends drai.dev.data.pokemon.Pokemon {
    public Kitsunny() {
        super("Kitsunny",
                Type.FIRE, Type.FAIRY,
                new Stats(65,
                        50,
                        50,
                        118,
                        135,
                        82),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("These Pokemon appear during droughts, summoning prevailing rains that rehydrate land deemed cruel by the sun. Originally discovered in Okeno, Kitsunny in Lonava are popular amongst doctors for their healing skills, but also because of their calming dispositions."),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.SUNNY_DAY,1),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.MIST,7),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,9),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,13),
                        new MoveLearnSetEntry(Move.FAKE_OUT,16),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,20),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,24),
                        new MoveLearnSetEntry(Move.SCALD,29),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,35),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,40),
                        new MoveLearnSetEntry(Move.STRANGE_STEAM,44),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,48),
                        new MoveLearnSetEntry(Move.SOLAR_FLARE,52),
                        new MoveLearnSetEntry(Move.MORNING_SUN,60),
                        new MoveLearnSetEntry(Move.SETTING_SUN,70)
                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CHERRY_GROVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Kitsunny");

    }


}
