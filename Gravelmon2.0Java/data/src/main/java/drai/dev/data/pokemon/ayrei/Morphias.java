package drai.dev.data.pokemon.ayrei;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Morphias extends drai.dev.data.pokemon.Pokemon {
    public Morphias() {
        super("Morphias",
                Type.FAIRY, Type.PSYCHIC,
                new Stats(70,
                        90,
                        110,
                        70,
                        130,
                        110),
                List.of(Ability.MISTY_SURGE), null,
                16, 550,
                new Stats(0, 0, 2, 0, 3, 3), 3,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("This rare species has the ability of seeing the future, a power that can potentially change fate itself."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLEUR_CANNON, 95),
                        new MoveLearnSetEntry(Move.STORED_POWER, 1),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK, 1),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION, 80),
                        new MoveLearnSetEntry(Move.CALM_MIND, 75),
                        new MoveLearnSetEntry(Move.HELPING_HAND, 5),
                        new MoveLearnSetEntry(Move.UTURN, 65),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, 45),
                        new MoveLearnSetEntry(Move.HEALING_WISH, 70),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT, 20),
                        new MoveLearnSetEntry(Move.WISH, 30),
                        new MoveLearnSetEntry(Move.PSYCHIC, 60),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT, 90),
                        new MoveLearnSetEntry(Move.SCALE_SHOT, 40),
                        new MoveLearnSetEntry(Move.CONFUSION, 15),
                        new MoveLearnSetEntry(Move.HEAL_PULSE, 50),
                        new MoveLearnSetEntry(Move.RECOVER, 85),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, 25),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, 55),
                        new MoveLearnSetEntry(Move.LIFE_DEW, 10),
                        new MoveLearnSetEntry(Move.MIST_BALL, 35),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH, "tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH, "tm"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, "tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS, "tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tm"),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE, "tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.CHARM, "tm"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tm"),
                        new MoveLearnSetEntry(Move.COVET, "tm"),
                        new MoveLearnSetEntry(Move.CUT, "tm"),
                        new MoveLearnSetEntry(Move.DEFOG, "tm"),
                        new MoveLearnSetEntry(Move.DIVE, "tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER, "tm"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT, "tm"),
                        new MoveLearnSetEntry(Move.ENDURE, "tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FLY, "tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tm"),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT, "tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "tm"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS, "tm"),
                        new MoveLearnSetEntry(Move.LAST_RESORT, "tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT, "tm"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC, "tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT, "tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK, "tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.REFLECT, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETALIATE, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.ROAR, "tm"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY, "tm"),
                        new MoveLearnSetEntry(Move.ROOST, "tm"),
                        new MoveLearnSetEntry(Move.ROUND, "tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tm"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT, "tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.SNORE, "tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tm"),
                        new MoveLearnSetEntry(Move.SURF, "tm"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tm"),
                        new MoveLearnSetEntry(Move.SWIFT, "tm"),
                        new MoveLearnSetEntry(Move.TAILWIND, "tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS, "tm"),
                        new MoveLearnSetEntry(Move.THUNDER, "tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, "tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK, "tm"),
                        new MoveLearnSetEntry(Move.TRICK, "tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL, "tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, "tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, "tm"),
                        new MoveLearnSetEntry(Move.MAGIC_POWDER, "tm")),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(65)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
        setLangFileName("Morphias");

    }


}
