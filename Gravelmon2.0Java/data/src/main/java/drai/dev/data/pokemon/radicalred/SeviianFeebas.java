package drai.dev.data.pokemon.radicalred;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class SeviianFeebas extends Pokemon {
    public SeviianFeebas(String name, Aspect aspect) {
        super(name, aspect,"SeviianFeebas",
                Type.WATER, Type.GROUND,
                new Stats(20, 15, 20, 10, 55, 80),
                List.of(Ability.SWIFT_SWIM, Ability.OBLIVIOUS), Ability.ADAPTABILITY,
                6, 74,
                new Stats(0, 0, 0, 0, 0, 1), 255,
                0.5,
                40, ExperienceGroup.ERRATIC,
                70,
                51, List.of(EggGroup.WATER_1, EggGroup.DRAGON),
                List.of(""),
                List.of(new EvolutionEntry("seviianmilotic", EvolutionType.LEVEL_UP, true, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "cobblemon:prism_scale")))),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 15),
                        new MoveLearnSetEntry(Move.FLAIL, 30),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tm"),
                        new MoveLearnSetEntry(Move.DIG, "tm"),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tm"),
                        new MoveLearnSetEntry(Move.SCALD, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SURF, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
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
                SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 10, 20, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Feebas");
        this.setPortraitXYZ(0.1, 2.0, 0.0);
    }
}
