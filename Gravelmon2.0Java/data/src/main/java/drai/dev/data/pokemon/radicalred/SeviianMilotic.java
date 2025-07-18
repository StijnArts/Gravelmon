package drai.dev.data.pokemon.radicalred;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class SeviianMilotic extends Pokemon {
    public SeviianMilotic(String name, Aspect aspect) {
        super(name, aspect,"SeviianMilotic",
                Type.WATER, Type.GROUND,
                new Stats(95, 60, 84, 105, 125, 81),
                List.of(Ability.MARVEL_SCALE, Ability.COMPETITIVE), Ability.SERENE_GRACE,
                31, 1620,
                new Stats(0, 0, 0, 0, 2, 0), 60,
                0.5,
                189, ExperienceGroup.ERRATIC,
                70,
                51, List.of(EggGroup.WATER_1, EggGroup.DRAGON),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, 1),
                        new MoveLearnSetEntry(Move.MUDSLAP, 1),
                        new MoveLearnSetEntry(Move.WRAP, 1),
                        new MoveLearnSetEntry(Move.SWEET_KISS, 4),
                        new MoveLearnSetEntry(Move.REFRESH, 7),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, 11),
                        new MoveLearnSetEntry(Move.TWISTER, 14),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, 17),
                        new MoveLearnSetEntry(Move.CAPTIVATE, 21),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL, 24),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, 31),
                        new MoveLearnSetEntry(Move.ATTRACT, 34),
                        new MoveLearnSetEntry(Move.SAFEGUARD, 37),
                        new MoveLearnSetEntry(Move.COIL, 41),
                        new MoveLearnSetEntry(Move.EARTH_POWER, 44),
                        new MoveLearnSetEntry(Move.SANDSTORM, 47),
                        new MoveLearnSetEntry(Move.MOONBLAST, 58),
                        new MoveLearnSetEntry(Move.SHORE_UP, 64),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, "tm"),
                        new MoveLearnSetEntry(Move.DIG, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL, "tm"),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, "tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tm"),
                        new MoveLearnSetEntry(Move.SCALD, "tm"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT, "tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE, "tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SURF, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, "tutor"),
                        new MoveLearnSetEntry(Move.CAPTIVATE, "egg"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY, "egg"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, "egg"),
                        new MoveLearnSetEntry(Move.HAZE, "egg"),
                        new MoveLearnSetEntry(Move.HYPNOSIS, "egg"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT, "egg"),
                        new MoveLearnSetEntry(Move.MIST, "egg"),
                        new MoveLearnSetEntry(Move.MUD_SHOT, "egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT, "egg"),
                        new MoveLearnSetEntry(Move.TICKLE, "egg")
                ),
                List.of(Label.RADICAL_RED, Label.GEN3),
                0, List.of(),
                new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_SWAMP)
    .setAntiBiomes(Biome.IS_COLD)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Milotic");
    }
}
