package drai.dev.data.pokemon.radicalred;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class SeviianMantine extends Pokemon {
    public SeviianMantine(String name, Aspect aspect) {
        super(name, aspect,"SeviianMantine",
                Type.ELECTRIC, Type.POISON,
                new Stats(80, 30, 70, 100, 120, 100),
                List.of(Ability.STATIC, Ability.STORM_DRAIN), Ability.HYDRATION,
                21, 2200,
                new Stats(0, 0, 0, 1, 1, 0), 25,
                0.5,
                170, ExperienceGroup.SLOW,
                70,
                51, List.of(EggGroup.WATER_1),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROOST, 1),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, 1),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, 1),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK, 1),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 3),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, 11),
                        new MoveLearnSetEntry(Move.ACID_SPRAY, 14),
                        new MoveLearnSetEntry(Move.HEADBUTT, 16),
                        new MoveLearnSetEntry(Move.SLUDGE, 19),
                        new MoveLearnSetEntry(Move.WIDE_GUARD, 23),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, 27),
                        new MoveLearnSetEntry(Move.AGILITY, 32),
                        new MoveLearnSetEntry(Move.DISCHARGE, 36),
                        new MoveLearnSetEntry(Move.AQUA_RING, 39),
                        new MoveLearnSetEntry(Move.BOUNCE, 46),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, 49),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, 56),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.DEFOG, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FLASH, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE, "tm"),
                        new MoveLearnSetEntry(Move.ROOST, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SURF, "tm"),
                        new MoveLearnSetEntry(Move.THUNDER, "tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, "tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK, "tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH, "tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, "tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT, "tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, "tutor"),
                        new MoveLearnSetEntry(Move.AMNESIA, "egg"),
                        new MoveLearnSetEntry(Move.HAZE, "egg"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE, "egg"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "egg"),
                        new MoveLearnSetEntry(Move.SLAM, "egg"),
                        new MoveLearnSetEntry(Move.SPLASH, "egg"),
                        new MoveLearnSetEntry(Move.THUNDER, "egg"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, "egg"),
                        new MoveLearnSetEntry(Move.TWISTER, "egg"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD, "egg")
                ),
                List.of(Label.RADICAL_RED, Label.GEN2),
                0, List.of(),
                SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 37, 55, 0.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Mantine");
        this.setPortraitXYZ(0.1, 2.0, 0.0);
        this.setCanBreathUnderwater(true);
        this.setAvoidsLand(true);
        this.setCanSwim(true);
    }
}
