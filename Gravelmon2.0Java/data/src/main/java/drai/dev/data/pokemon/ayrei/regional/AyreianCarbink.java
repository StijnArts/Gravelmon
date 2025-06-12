package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianCarbink extends Pokemon {
    public AyreianCarbink(String name, Aspect aspect) {
        super(name, aspect,"AyreianCarbink",
                Type.ROCK, Type.STEEL,
                new Stats(50,50,160,50,50,160),
                List.of(Ability.IRON_FIST, Ability.MOLD_BREAKER), Ability.SCRAPPY,
                3, 57,
                new Stats(0,0,1,0,0,1), 70,
                0.5,
                100, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY, EggGroup.MINERAL),
                List.of("The bands of iron spinning around it's core protect it from almost every kind of attack."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MIRROR_SHOT, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.HARDEN, 1),
                        new MoveLearnSetEntry(Move.GUARD_SPLIT, 5),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, 10),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 15),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 20),
                        new MoveLearnSetEntry(Move.ROCK_POLISH, 25),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, 30),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, 35),
                        new MoveLearnSetEntry(Move.SKILL_SWAP, 40),
                        new MoveLearnSetEntry(Move.POWER_GEM, 45),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, 50),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, 55),
                        new MoveLearnSetEntry(Move.STONE_EDGE, 60),

                        new MoveLearnSetEntry(Move.AFTER_YOU, "tutor"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_PRESS, "tutor"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "tutor"),
                        new MoveLearnSetEntry(Move.CHARM, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.COVET, "tutor"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.EXPLOSION, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GRAVITY, "tutor"),
                        new MoveLearnSetEntry(Move.GUARD_SWAP, "tutor"),
                        new MoveLearnSetEntry(Move.GYRO_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.HAIL, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT, "tutor"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE, "tutor"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION, "tutor"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.POWER_GEM, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCHIC, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tutor"),
                        new MoveLearnSetEntry(Move.SAND_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tutor"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, "tutor"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.TELEKINESIS, "tutor"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM, "tutor"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM, "tutor")
                ),
                List.of(Label.GEN6,Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(21)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setSpawnPreset(SpawnPreset.AMETHYST_GEODE)
    .build(), List.of());
	
        this.setLangFileName("Carbink");
    }
}
