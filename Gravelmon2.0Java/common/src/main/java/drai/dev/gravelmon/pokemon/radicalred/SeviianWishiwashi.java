package drai.dev.gravelmon.pokemon.radicalred;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class SeviianWishiwashi extends Pokemon {
    public SeviianWishiwashi(int dexNo) {
        super(dexNo, "SeviianWishiwashi",
                Type.GHOST,
                new Stats(60, 20, 20, 25, 15, 35),
                List.of(Ability.SCHOOLING), Ability.SCHOOLING,
                2, 3,
                new Stats(1, 0, 0, 0, 0, 0), 61,
                0.5,
                61, ExperienceGroup.FAST,
                70,
                51, List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.HELPING_HAND, 6),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, 9),
                        new MoveLearnSetEntry(Move.DESTINY_BOND, 14),
                        new MoveLearnSetEntry(Move.HEX, 17),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK, 22),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 25),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE, 30),
                        new MoveLearnSetEntry(Move.BEAT_UP, 33),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK, 36),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 38),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, 41),
                        new MoveLearnSetEntry(Move.ENDEAVOR, 49),
                        new MoveLearnSetEntry(Move.OUTRAGE, 54),
                        new MoveLearnSetEntry(Move.DRAGON_HAMMER, 60),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tm"),
                        new MoveLearnSetEntry(Move.DRACO_BARRAGE, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.POLTERGEIST, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.TAUNT, "tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM, "tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP, "tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.HEX, "tutor"),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE, "tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, "tutor"),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE, "tutor")
                ),
                List.of(Label.RADICAL_RED, Label.GEN7),
                0, List.of(),
                SpawnContext.SUBMERGED, SpawnPool.COMMON, 12, 56, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY, Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of(new PokemonForm("School", true,
                        Type.GHOST, Type.DRAGON,
                        new Stats(60, 140, 130, 140, 135, 25),
                        List.of(Ability.SCHOOLING), Ability.SCHOOLING,
                        102, 213,
                        new Stats(1, 0, 0, 0, 0, 0), 61,
                        0.5,
                        61, ExperienceGroup.FAST,
                        70,
                        51, List.of(EggGroup.WATER_2),
                        List.of(Aspect.SCHOOL),
                        List.of(),
                        List.of(),
                        List.of(
                        ),
                        List.of(Label.RADICAL_RED, Label.GEN1),
                        0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 12, 34, 0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night")
                ), List.of(),
                        List.of(SpawnPreset.NATURAL),
                        1.4, 0.3)));
        this.setLangFileName("Wishiwashi");
        this.setPortraitXYZ(0.1, 2.0, 0.0);
        this.setCanSwim(true);
        this.setAvoidsLand(true);
        this.setCanBreathUnderwater(true);
    }
}
