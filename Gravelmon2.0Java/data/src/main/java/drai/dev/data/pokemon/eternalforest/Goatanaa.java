package drai.dev.data.pokemon.eternalforest;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Goatanaa extends Pokemon {
    public Goatanaa() {
        super("Goatanaa",
                Type.NORMAL,
                new Stats(75,
                        70,
                        55,
                        25,
                        55,
                        55),
                List.of(Ability.SAP_SIPPER, Ability.ROCK_HEAD), Ability.RECKLESS,
                9, 270,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                92, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Goatanaa lives in the mountains. It moves according to the weather, when it is hot, it seeks the coolness in the heights and when the winter arrives, it goes down in the valleys."),
                List.of(new EvolutionEntry("goaturly", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
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
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT, 60),
                        new MoveLearnSetEntry(Move.SKULL_BASH, 65),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT, 70),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, 75),
                        new MoveLearnSetEntry(Move.BELLY_DRUM, 80),
                        new MoveLearnSetEntry(Move.BATON_PASS, 85),
                        new MoveLearnSetEntry(Move.FACADE, 90),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, 95),
                        new MoveLearnSetEntry(Move.ACUPRESSURE, 100),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, 105),

                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
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
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
