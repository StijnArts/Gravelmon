package drai.dev.data.pokemon.ayrei;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Infernadeer extends Pokemon {
    public Infernadeer() {
        super("Infernadeer",
                Type.STEEL, Type.FIRE,
                new Stats(83,125,102,65,65,65),
                List.of(Ability.INTIMIDATE, Ability.FRISK), Ability.FLAME_BODY,
                20, 1212,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                163, ExperienceGroup.SLOW,
                70,
                39, List.of(EggGroup.FIELD),
                List.of("Loyal to a fault, it and Rapidash were in a constant rivarly as the preferred mount of kings. The metal that adorns its body is heatproof."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BLAZE_KICK, 1),
                        new MoveLearnSetEntry(Move.ME_FIRST, 1),
                        new MoveLearnSetEntry(Move.SMART_STRIKE, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.LEER, 3),
                        new MoveLearnSetEntry(Move.FIRECRACKERS, 7),
                        new MoveLearnSetEntry(Move.HYPNOSIS, 10),
                        new MoveLearnSetEntry(Move.STOMP, 13),
                        new MoveLearnSetEntry(Move.MUDSLAP, 16),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, 21),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY, 23),
                        new MoveLearnSetEntry(Move.BULK_UP, 27),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, 33),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, 38),
                        new MoveLearnSetEntry(Move.IRON_HEAD, 43),
                        new MoveLearnSetEntry(Move.JUMP_KICK, 47),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, 50),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE, 55),

                        new MoveLearnSetEntry(Move.FLAME_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BOUNCE, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "tutor"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DREAM_EATER, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.GRAVITY, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.LAST_RESORT, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCHIC, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.PSYSHOCK, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETALIATE, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SPITE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, "tutor"),

                        new MoveLearnSetEntry(Move.SPITE, "egg"),
                        new MoveLearnSetEntry(Move.DISABLE, "egg"),
                        new MoveLearnSetEntry(Move.BITE, "egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY, "egg"),
                        new MoveLearnSetEntry(Move.THRASH, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, "egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, "egg"),
                        new MoveLearnSetEntry(Move.MEGAHORN, "egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT, "egg"),
                        new MoveLearnSetEntry(Move.RAGE, "egg"),
                        new MoveLearnSetEntry(Move.ME_FIRST, "egg")
                ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_VOLCANIC, Biome.IS_BADLANDS)
    .duringDaytime()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
