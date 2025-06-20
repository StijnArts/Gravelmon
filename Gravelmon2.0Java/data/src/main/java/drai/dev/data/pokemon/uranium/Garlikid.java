package drai.dev.data.pokemon.uranium;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Garlikid extends Pokemon {
    public Garlikid() {
        super("Garlikid",
                Type.GRASS, Type.FIGHTING,
                new Stats(90,
                        115,
                        85,
                        105,
                        90,
                        115),
                List.of(Ability.JUSTIFIED), Ability.JUSTIFIED,
                14, 333,
                new Stats(0,1,0,0,0,1), 3,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("Garlikid believes itself to be a savior of all Monkind. It will pick fights with anyone it considers villainous."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.STUN_SPORE, 1),
                        new MoveLearnSetEntry(Move.LEECH_SEED, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 4),
                        new MoveLearnSetEntry(Move.STUN_SPORE, 7),
                        new MoveLearnSetEntry(Move.LOW_KICK, 10),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN, 16),
                        new MoveLearnSetEntry(Move.HEADBUTT, 22),
                        new MoveLearnSetEntry(Move.MACH_PUNCH, 23),
                        new MoveLearnSetEntry(Move.COUNTER, 28),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT, 36),
                        new MoveLearnSetEntry(Move.MIND_READER, 45),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH, 54),

                        // Teach Moves (TM/HM)
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tm"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tm"),
                        new MoveLearnSetEntry(Move.BLOCK, "tm"),
                        new MoveLearnSetEntry(Move.BOUNCE, "tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "tm"),
                        new MoveLearnSetEntry(Move.BULK_UP, "tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED, "tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE, "tm"),
                        new MoveLearnSetEntry(Move.COVET, "tm"),
                        new MoveLearnSetEntry(Move.DIG, "tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH, "tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR, "tm"),
                        new MoveLearnSetEntry(Move.ENDURE, "tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FEINT, "tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH, "tm"),
                        new MoveLearnSetEntry(Move.FLING, "tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, "tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH, "tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH, "tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tm"),
                        new MoveLearnSetEntry(Move.LAST_RESORT, "tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK, "tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "tm"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB, "tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tm"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER, "tm"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS, "tm"),
                        new MoveLearnSetEntry(Move.TAUNT, "tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.UTURN, "tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, "tm")
                ),
                List.of(Label.URANIUM, Label.LEGENDARY),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
    }
}
