package drai.dev.data.pokemon.eternalforest;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Antoldier extends Pokemon {
    public Antoldier() {
        super("Antoldier",
                Type.BUG, Type.FIGHTING,
                new Stats(75,
                        150,
                        85,
                        40,
                        45,
                        110),
                List.of(Ability.DEFEATIST, Ability.DEFEATIST), Ability.DEFEATIST,
                14, 560,
                new Stats(0,1,0,0,0,0), 140,
                0.5,
                137, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Antoldier have an extraordinary power, they can lift a Snorlax without any efforts. They are used in mines to help humans."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, 6),
                        new MoveLearnSetEntry(Move.MINIMIZE, 12),
                        new MoveLearnSetEntry(Move.ARM_THRUST, 17),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, 23),
                        new MoveLearnSetEntry(Move.LOW_KICK, 28),
                        new MoveLearnSetEntry(Move.BUG_BITE, 34),
                        new MoveLearnSetEntry(Move.POISON_FANG, 39),
                        new MoveLearnSetEntry(Move.WORK_UP, 46),
                        new MoveLearnSetEntry(Move.BITE, 51),
                        new MoveLearnSetEntry(Move.SUBMISSION, 57),
                        new MoveLearnSetEntry(Move.UTURN, 62),
                        new MoveLearnSetEntry(Move.HYPER_FANG, 66),
                        new MoveLearnSetEntry(Move.BLOODABSORB, 72),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 74),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, 76),
                        new MoveLearnSetEntry(Move.ICE_FANG, 76),
                        new MoveLearnSetEntry(Move.SUPER_FANG, 82),
                        new MoveLearnSetEntry(Move.CROSS_CHOP, 88),
                        new MoveLearnSetEntry(Move.QUICK_GUARD, 94),
                        new MoveLearnSetEntry(Move.IRON_HEAD, 100),
                        new MoveLearnSetEntry(Move.CRUNCH, 106),
                        new MoveLearnSetEntry(Move.BULK_UP, 112),
                        new MoveLearnSetEntry(Move.HARMFULINVASION, 118),
                        new MoveLearnSetEntry(Move.SUPERPOWER, 124),
                        new MoveLearnSetEntry(Move.GUILLOTINE, 130),

                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.BULK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "tutor"),
                        new MoveLearnSetEntry(Move.POISON_JAB, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.RETALIATE, "tutor"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.BLOODABSORB, "tutor"),
                        new MoveLearnSetEntry(Move.TOXICBOUND, "tutor"),

                        new MoveLearnSetEntry(Move.BEAT_UP, "egg"),
                        new MoveLearnSetEntry(Move.REVERSAL, "egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR, "egg"),
                        new MoveLearnSetEntry(Move.RAGE, "egg"),
                        new MoveLearnSetEntry(Move.FUDODACHI, "egg"),
                        new MoveLearnSetEntry(Move.INFESTATION, "egg"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "egg"),
                        new MoveLearnSetEntry(Move.THRASH, "egg"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "egg"),
                        new MoveLearnSetEntry(Move.ENTRAINMENT, "egg"),
                        new MoveLearnSetEntry(Move.DRILL_RUN, "egg")
                ),
                List.of(Label.ETERNAL_FOREST),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(40)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
