package drai.dev.data.pokemon.eternalforest;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Goaturly extends Pokemon {
    public Goaturly() {
        super("Goaturly",
                Type.NORMAL,
                new Stats(100,
                        110,
                        80,
                        40,
                        85,
                        75),
                List.of(Ability.SAP_SIPPER, Ability.ROCK_HEAD), Ability.FUR_COAT,
                17, 1050,
                new Stats(1,1,0,0,0,0), 90,
                0.5,
                165, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Goaturly is bred for its precious wool, which is both soft and resistant. It is used to make rich clothes. It is in perpetual conflict with Frison because of their ego."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 5),
                        new MoveLearnSetEntry(Move.FURY_ATTACK, 7),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, 10),
                        new MoveLearnSetEntry(Move.COVET, 13),
                        new MoveLearnSetEntry(Move.SWAGGER, 17),
                        new MoveLearnSetEntry(Move.ROCK_THROW, 21),
                        new MoveLearnSetEntry(Move.PSYCH_UP, 26),
                        new MoveLearnSetEntry(Move.HEAL_BELL, 31),
                        new MoveLearnSetEntry(Move.BULLDOZE, 39),
                        new MoveLearnSetEntry(Move.HEADBUTT, 51),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, 63),
                        new MoveLearnSetEntry(Move.SKULL_BASH, 70),
                        new MoveLearnSetEntry(Move.HORN_LEECH, 75),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, 80),
                        new MoveLearnSetEntry(Move.BELLY_DRUM, 85),
                        new MoveLearnSetEntry(Move.BATON_PASS, 90),
                        new MoveLearnSetEntry(Move.FACADE, 95),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, 100),
                        new MoveLearnSetEntry(Move.ACUPRESSURE, 105),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, 110),
                        new MoveLearnSetEntry(Move.MEGAHORN, 115),
                        new MoveLearnSetEntry(Move.HEAD_CHARGE, 120),
                        new MoveLearnSetEntry(Move.HORN_DRILL, 125),

                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.SNATCH, "tutor"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.AVALANCHE, "tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.RETALIATE, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),

                        new MoveLearnSetEntry(Move.LAST_RESORT, "egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH, "egg"),
                        new MoveLearnSetEntry(Move.MILK_DRINK, "egg"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "egg"),
                        new MoveLearnSetEntry(Move.JUMP_KICK, "egg"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "egg"),
                        new MoveLearnSetEntry(Move.BOUNCE, "egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD, "egg"),
                        new MoveLearnSetEntry(Move.TECTONICSHOCK, "egg")
                ),
                List.of(Label.ETERNAL_FOREST),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
