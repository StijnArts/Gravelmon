package drai.dev.data.pokemon.eternalforest;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Antager extends Pokemon {
    public Antager() {
        super("Antager",
                Type.BUG, Type.FIGHTING,
                new Stats(50,
                        90,
                        60,
                        20,
                        30,
                        80),
                List.of(Ability.DEFEATIST, Ability.DEFEATIST), Ability.DEFEATIST,
                3, 24,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                50, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Antager is small but don't be fooled by appearances, it can lift up to 50 times its weight."),
                List.of(new EvolutionEntry("antoldier", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
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
                        new MoveLearnSetEntry(Move.WORK_UP, 44),
                        new MoveLearnSetEntry(Move.BITE, 48),
                        new MoveLearnSetEntry(Move.SUBMISSION, 52),
                        new MoveLearnSetEntry(Move.UTURN, 56),
                        new MoveLearnSetEntry(Move.HYPER_FANG, 60),
                        new MoveLearnSetEntry(Move.BLOODABSORB, 64),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 68),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, 72),
                        new MoveLearnSetEntry(Move.ICE_FANG, 72),
                        new MoveLearnSetEntry(Move.SUPER_FANG, 76),
                        new MoveLearnSetEntry(Move.CROSS_CHOP, 80),
                        new MoveLearnSetEntry(Move.QUICK_GUARD, 84),
                        new MoveLearnSetEntry(Move.IRON_HEAD, 88),
                        new MoveLearnSetEntry(Move.CRUNCH, 92),
                        new MoveLearnSetEntry(Move.BULK_UP, 96),
                        new MoveLearnSetEntry(Move.HARMFULINVASION, 100),
                        new MoveLearnSetEntry(Move.SUPERPOWER, 105),
                        new MoveLearnSetEntry(Move.GUILLOTINE, 110),

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
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
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
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
