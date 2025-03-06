package drai.dev.data.pokemon.radicalred;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class SeviianDhelmise extends Pokemon {
    public SeviianDhelmise(String name, Aspect aspect) {
        super(name, aspect,"SeviianDhelmise",
                Type.WATER, Type.GRASS,
                new Stats(90, 81, 105, 106, 95, 40),
                List.of(Ability.SAP_SIPPER, Ability.GOOEY), Ability.TINTED_LENS,
                39, 2100,
                new Stats(0, 0, 1, 1, 0, 0), 25,
                -1,
                181, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB, 1),
                        new MoveLearnSetEntry(Move.GROWTH, 1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN, 1),
                        new MoveLearnSetEntry(Move.SWITCHEROO, 1),
                        new MoveLearnSetEntry(Move.WATER_GUN, 1),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN, 5),
                        new MoveLearnSetEntry(Move.WRAP, 9),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, 14),
                        new MoveLearnSetEntry(Move.WATER_SPORT, 18),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, 23),
                        new MoveLearnSetEntry(Move.WHIRLPOOL, 27),
                        new MoveLearnSetEntry(Move.ANCHOR_SHOT, 32),
                        new MoveLearnSetEntry(Move.LIQUIDATION, 36),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, 41),
                        new MoveLearnSetEntry(Move.SLAM, 45),
                        new MoveLearnSetEntry(Move.SCALD, 50),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, 54),
                        new MoveLearnSetEntry(Move.CHLOROBLAST, 59),
                        new MoveLearnSetEntry(Move.LEECH_SEED, 64),
                        new MoveLearnSetEntry(Move.BODY_PRESS, "tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, "tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN, "tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tm"),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE, "tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tm"),
                        new MoveLearnSetEntry(Move.SCALD, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE, "tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE, "tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BLADE, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tm"),
                        new MoveLearnSetEntry(Move.SURF, "tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.THIEF, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD, "tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tutor"),
                        new MoveLearnSetEntry(Move.LIQUIDATION, "tutor"),
                        new MoveLearnSetEntry(Move.POWER_WHIP, "tutor")
                ),
                List.of(Label.RADICAL_RED, Label.GEN7),
                0, List.of(),
                SpawnContext.SUBMERGED, SpawnPool.RARE, 24, 56, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Dhelmise");
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);
    }
}
