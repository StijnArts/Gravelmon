package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Kyuukit extends drai.dev.data.pokemon.Pokemon {
    public Kyuukit() {
        super("Kyuukit",
                Type.FIRE, Type.FAIRY,
                new Stats(45,
                        40,
                        30,
                        45,
                        60,
                        72),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Kyuukit adore hot springs, especially those found near the western seaboard of Lonava. These scrappy Pokemon can alter the humidity of the surrounding air to slow down their opponents, though it usually leaves their fur very poofy."),
                List.of(new EvolutionEntry("kitsunny", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:shiny_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.MIST,5),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,7),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,9),
                        new MoveLearnSetEntry(Move.FAKE_OUT,13),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,16),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,20),
                        new MoveLearnSetEntry(Move.SCALD,24),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,29),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,35),
                        new MoveLearnSetEntry(Move.STRANGE_STEAM,40),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,44),
                        new MoveLearnSetEntry(Move.SOLAR_FLARE,48),
                        new MoveLearnSetEntry(Move.MORNING_SUN,55),
                        new MoveLearnSetEntry(Move.SETTING_SUN,65)
                ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CHERRY_GROVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Kyuukit");

    }


}
