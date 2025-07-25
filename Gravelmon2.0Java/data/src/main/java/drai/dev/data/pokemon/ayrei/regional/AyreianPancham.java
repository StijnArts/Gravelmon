package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianPancham extends Pokemon {
    public AyreianPancham(String name, Aspect aspect) {
        super(name, aspect,"AyreianPancham",
                Type.FIRE, Type.FIGHTING,
                new Stats(67,82,62,43,46,48),
                List.of(Ability.IRON_FIST, Ability.MOLD_BREAKER), Ability.SCRAPPY,
                6, 80,
                new Stats(0,1,0,0,0,0), 128,
                0.5,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Wanting to make sure it's taken seriously, Pancham's always giving others a glare. But if it's not focusing, it ends up smiling."),
                List.of(new EvolutionEntry("ayreianpangoro", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.ARM_THRUST, 4),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, 8),
                        new MoveLearnSetEntry(Move.TAUNT, 12),
                        new MoveLearnSetEntry(Move.LOW_SWEEP, 16),
                        new MoveLearnSetEntry(Move.WORK_UP, 20),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH, 24),
                        new MoveLearnSetEntry(Move.SLASH, 28),
                        new MoveLearnSetEntry(Move.CRUNCH, 33),
                        new MoveLearnSetEntry(Move.BODY_SLAM, 36),
                        new MoveLearnSetEntry(Move.PARTING_SHOT, 40),
                        new MoveLearnSetEntry(Move.ENTRAINMENT, 44),

                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BLOCK, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "tutor"),
                        new MoveLearnSetEntry(Move.BULK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.COACHING, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.COVET, "tutor"),
                        new MoveLearnSetEntry(Move.CRUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.DARK_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tutor"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT, "tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD, "tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tutor"),
                        new MoveLearnSetEntry(Move.LASH_OUT, "tutor"),
                        new MoveLearnSetEntry(Move.LOW_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETALIATE, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SNATCH, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SPITE, "tutor"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER, "tutor"),
                        new MoveLearnSetEntry(Move.SURF, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.TORMENT, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, "tutor"),

                        new MoveLearnSetEntry(Move.QUASH, "egg"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD, "egg"),
                        new MoveLearnSetEntry(Move.STORM_THROW, "egg"),
                        new MoveLearnSetEntry(Move.POWER_TRIP, "egg"),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS, "egg")
                ),
                List.of(Label.GEN6,Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Pancham");
    }
}
