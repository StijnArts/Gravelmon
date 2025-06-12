package drai.dev.data.pokemon.eternalforest;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Wormeel extends Pokemon {
    public Wormeel() {
        super("Wormeel",
                Type.GROUND, Type.STEEL,
                new Stats(95,
                        105,
                        70,
                        50,
                        70,
                        112),
                List.of(Ability.DRY_SKIN, Ability.SAND_FORCE), Ability.SHED_SKIN,
                18, 800,
                new Stats(0,1,0,0,0,1), 130,
                0.5,
                50, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Wormini spends its time digging in the ground and rarely sees the light of day."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.BIND, 5),
                        new MoveLearnSetEntry(Move.PROTECT, 7),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE, 10),
                        new MoveLearnSetEntry(Move.SAND_TOMB, 13),
                        new MoveLearnSetEntry(Move.STEALTHFLAW, 18),
                        new MoveLearnSetEntry(Move.SANDSTORM, 24),
                        new MoveLearnSetEntry(Move.HORN_ATTACK, 26),
                        new MoveLearnSetEntry(Move.SLAM, 31),
                        new MoveLearnSetEntry(Move.MUD_BOMB, 38),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB, 39),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, 46),
                        new MoveLearnSetEntry(Move.MAGNITUDE, 54),
                        new MoveLearnSetEntry(Move.BLOCK, 62),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM, 70),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE, 74),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL, 79),
                        new MoveLearnSetEntry(Move.DIG, 85),
                        new MoveLearnSetEntry(Move.COIL, 90),
                        new MoveLearnSetEntry(Move.AQUA_TAIL, 95),
                        new MoveLearnSetEntry(Move.DRILL_RUN, 100),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 106),
                        new MoveLearnSetEntry(Move.MEGAHORN, 112),
                        new MoveLearnSetEntry(Move.IRON_TAIL, 118),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 124),
                        new MoveLearnSetEntry(Move.FISSURE, 130),

                        new MoveLearnSetEntry(Move.ROCK_CLIMB, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.TORMENT, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.SNATCH, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH, "tutor"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tutor"),
                        new MoveLearnSetEntry(Move.AVALANCHE, "tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, "tutor"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.QUASH, "tutor"),
                        new MoveLearnSetEntry(Move.RETALIATE, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHTNINGTAIL, "tutor"),
                        new MoveLearnSetEntry(Move.PERCEPTION, "tutor"),
                        new MoveLearnSetEntry(Move.TECTONICSHOCK, "tutor"),

                        new MoveLearnSetEntry(Move.SUCKER_PUNCH, "egg"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP, "egg"),
                        new MoveLearnSetEntry(Move.INFESTATION, "egg"),
                        new MoveLearnSetEntry(Move.HARMFULINVASION, "egg"),
                        new MoveLearnSetEntry(Move.WRAP, "egg"),
                        new MoveLearnSetEntry(Move.MINIMIZE, "egg"),
                        new MoveLearnSetEntry(Move.POWER_WHIP, "egg"),
                        new MoveLearnSetEntry(Move.TAUNT, "egg"),
                        new MoveLearnSetEntry(Move.REFRESH, "egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "egg"),
                        new MoveLearnSetEntry(Move.WRING_OUT, "egg")
                ),
                List.of(Label.ETERNAL_FOREST),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .setAntiBiomes(Biome.IS_SNOWY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
