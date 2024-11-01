package drai.dev.data.pokemon.radicalred;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class SeviianBlitzle extends Pokemon {
    public SeviianBlitzle(String name, Aspect aspect) {
        super(name, aspect,"SeviianBlitzle",
                Type.ICE, Type.ELECTRIC,
                new Stats(45, 45, 32, 65, 32, 76),
                List.of(Ability.LIGHTNING_ROD, Ability.ILLUMINATE), Ability.ICE_BODY,
                9, 298,
                new Stats(0, 0, 0, 0, 0, 1), 190,
                0.5,
                59, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("seviianzebstrika", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "27")))),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 4),
                        new MoveLearnSetEntry(Move.CHARGE, 8),
                        new MoveLearnSetEntry(Move.ICY_WIND, 11),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, 15),
                        new MoveLearnSetEntry(Move.ICE_SHARD, 18),
                        new MoveLearnSetEntry(Move.PURSUIT, 22),
                        new MoveLearnSetEntry(Move.SPARK, 25),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH, 29),
                        new MoveLearnSetEntry(Move.DISCHARGE, 32),
                        new MoveLearnSetEntry(Move.AGILITY, 36),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, 39),
                        new MoveLearnSetEntry(Move.ICE_BEAM, 43),
                        new MoveLearnSetEntry(Move.FREEZEDRY, 49),
                        new MoveLearnSetEntry(Move.BLIZZARD, "tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FLASH, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.THUNDER, "tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, "tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH, "tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, "tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, "egg"),
                        new MoveLearnSetEntry(Move.ENDURE, "egg"),
                        new MoveLearnSetEntry(Move.FEINT, "egg"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "egg"),
                        new MoveLearnSetEntry(Move.ME_FIRST, "egg"),
                        new MoveLearnSetEntry(Move.RAGE, "egg"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.SCREECH, "egg"),
                        new MoveLearnSetEntry(Move.SNATCH, "egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, "egg")
                ),
                List.of(Label.RADICAL_RED, Label.GEN5),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 34, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE, Biome.IS_ARID))),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Blitzle");
        this.setPortraitXYZ(0.1, 2.0, 0.0);
    }
}
