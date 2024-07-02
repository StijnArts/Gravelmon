package drai.dev.gravelmon.pokemon.radicalred;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class SeviianSizzlipede extends Pokemon {
    public SeviianSizzlipede(String name, Aspect aspect) {
        super(name, aspect,"SeviianSizzlipede",
                Type.GROUND, Type.BUG,
                new Stats(50, 65, 45, 50, 50, 45),
                List.of(Ability.SHED_SKIN, Ability.WHITE_SMOKE), Ability.MOLD_BREAKER,
                7, 10,
                new Stats(0, 1, 0, 0, 0, 0), 190,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("seviiancentiskorch", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "28")))),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP, 1),
                        new MoveLearnSetEntry(Move.WRAP, 5),
                        new MoveLearnSetEntry(Move.BITE, 10),
                        new MoveLearnSetEntry(Move.MUD_SHOT, 15),
                        new MoveLearnSetEntry(Move.BUG_BITE, 20),
                        new MoveLearnSetEntry(Move.COIL , 25),
                        new MoveLearnSetEntry(Move.SLAM, 28),
                        new MoveLearnSetEntry(Move.BULLDOZE, 33),
                        new MoveLearnSetEntry(Move.CRUNCH, 37),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, 40),
                        new MoveLearnSetEntry(Move.LUNGE, 44),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER, 48),
                        new MoveLearnSetEntry(Move.STONE_EDGE, 52),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 56),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tm"),
                        new MoveLearnSetEntry(Move.CUT, "tm"),
                        new MoveLearnSetEntry(Move.DIG, "tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.LEECH_SEED, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS, "tm"),
                        new MoveLearnSetEntry(Move.SILVER_WIND, "tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK, "tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, "tutor"),
                        new MoveLearnSetEntry(Move.DRILL_RUN, "tutor"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, "tutor")
                ),
                List.of(Label.RADICAL_RED, Label.GEN8),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 36, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Sizzlipede");
        this.setPortraitXYZ(0.1, 2.0, 0.0);
    }
}
