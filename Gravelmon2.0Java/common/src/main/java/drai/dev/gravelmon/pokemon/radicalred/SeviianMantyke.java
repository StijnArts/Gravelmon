package drai.dev.gravelmon.pokemon.radicalred;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class SeviianMantyke extends Pokemon {
    public SeviianMantyke(String name, Aspect aspect) {
        super(name, aspect,"SeviianMantyke",
                Type.ELECTRIC, Type.POISON,
                new Stats(45, 20, 55, 70, 85, 70),
                List.of(Ability.STATIC, Ability.STORM_DRAIN), Ability.HYDRATION,
                10, 650,
                new Stats(0, 0, 0, 0, 1, 0), 25,
                0.5,
                69, ExperienceGroup.SLOW,
                70,
                51, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(new EvolutionEntry("seviianmantine", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "30")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK, 1),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 3),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, 7),
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
                        new MoveLearnSetEntry(Move.GUNK_SHOT, "tutor"),
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
                List.of(Label.RADICAL_RED, Label.GEN4),
                0, List.of(),
                SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 12, 34, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Mantyke");
        this.setPortraitXYZ(0.1, 2.0, 0.0);
        this.setCanBreathUnderwater(true);
        this.setAvoidsLand(true);
        this.setCanSwim(true);
    }
}
