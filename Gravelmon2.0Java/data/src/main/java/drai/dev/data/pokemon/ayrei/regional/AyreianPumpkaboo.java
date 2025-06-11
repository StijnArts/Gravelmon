package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianPumpkaboo extends Pokemon {
    public AyreianPumpkaboo(String name, Aspect aspect) {
        super(name, aspect,"AyreianPumpkaboo",
                Type.GRASS, Type.FAIRY,
                new Stats(70,45,70,20,45,70),
                List.of(Ability.STAMINA, Ability.TRIAGE), Ability.INSOMNIA,
                4, 50,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                67, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("When taking spirits to the afterlife, small Pumpkaboo prefer the spirits of children to those of adults."),
                List.of(new EvolutionEntry("ayreiangourgeist", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD, 1),
                        new MoveLearnSetEntry(Move.ABSORB, 1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, 4),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY, 8),
                        new MoveLearnSetEntry(Move.SWIFT, 12),
                        new MoveLearnSetEntry(Move.LEECH_SEED, 16),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN, 20),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, 24),
                        new MoveLearnSetEntry(Move.STOCKPILE, 28),
                        new MoveLearnSetEntry(Move.HORN_LEECH, 32),
                        new MoveLearnSetEntry(Move.TRICKORTREAT, 36),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 36),
                        new MoveLearnSetEntry(Move.TRICK, 40),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP, 44),

                        new MoveLearnSetEntry(Move.ALLY_SWITCH, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BULLET_SEED, "tutor"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DARK_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DREAM_EATER, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.EXPLOSION, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, "tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tutor"),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.GYRO_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.HEX, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.IMPRISON, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT, "tutor"),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE, "tutor"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT, "tutor"),
                        new MoveLearnSetEntry(Move.POLTERGEIST, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCHIC, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.SCARY_FACE, "tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP, "tutor"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SPITE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS, "tutor"),
                        new MoveLearnSetEntry(Move.TELEKINESIS, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.TRICK, "tutor"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM, "tutor"),
                        new MoveLearnSetEntry(Move.WILLOWISP, "tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED, "tutor"),

                        new MoveLearnSetEntry(Move.DISABLE, "egg"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND, "egg"),
                        new MoveLearnSetEntry(Move.CURSE, "egg")
                ),
                List.of(Label.GEN6,Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(8)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Pumpkaboo");
    }
}
