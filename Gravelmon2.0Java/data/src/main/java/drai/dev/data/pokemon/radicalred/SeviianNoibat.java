package drai.dev.data.pokemon.radicalred;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class SeviianNoibat extends Pokemon {
    public SeviianNoibat(String name, Aspect aspect) {
        super(name, aspect,"SeviianNoibat",
                Type.ROCK, Type.GHOST,
                new Stats(40, 45, 35, 30, 40, 55),
                List.of(Ability.CURSED_BODY, Ability.STURDY), Ability.LEVITATE,
                5, 830,
                new Stats(0, 0, 0, 0, 1, 0), 225,
                0.5,
                49, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.DRAGON, EggGroup.FLYING),
                List.of(""),
                List.of(new EvolutionEntry("seviiannoivern", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "36")))),
                List.of(
                        new MoveLearnSetEntry(Move.BITE, 1),
                        new MoveLearnSetEntry(Move.SCREECH, 1),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 1),
                        new MoveLearnSetEntry(Move.ASTONISH, 5),
                        new MoveLearnSetEntry(Move.ROCK_THROW, 11),
                        new MoveLearnSetEntry(Move.MAGNITUDE, 13),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK, 16),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND, 18),
                        new MoveLearnSetEntry(Move.ROCK_BLAST, 23),
                        new MoveLearnSetEntry(Move.CURSE, 27),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, 31),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB, 35),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE, 40),
                        new MoveLearnSetEntry(Move.SUPER_FANG, 43),
                        new MoveLearnSetEntry(Move.DESTINY_BOND, 48),
                        new MoveLearnSetEntry(Move.STONE_EDGE, 54),
                        new MoveLearnSetEntry(Move.POLTERGEIST, 58),
                        new MoveLearnSetEntry(Move.ACROBATICS, "tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tm"),
                        new MoveLearnSetEntry(Move.CUT, "tm"),
                        new MoveLearnSetEntry(Move.DEFOG, "tm"),
                        new MoveLearnSetEntry(Move.DIG, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "tm"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT, "tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FLY, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, "tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.POLTERGEIST, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tm"),
                        new MoveLearnSetEntry(Move.ROOST, "tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, "tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tm"),
                        new MoveLearnSetEntry(Move.TAUNT, "tm"),
                        new MoveLearnSetEntry(Move.THIEF, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.UTURN, "tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP, "tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_FANG, "tutor"),
                        new MoveLearnSetEntry(Move.HURRICANE, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_FANG, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD, "tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tutor"),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE, "tutor"),
                        new MoveLearnSetEntry(Move.POWER_GEM, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, "tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, "tutor"),
                        new MoveLearnSetEntry(Move.CURSE, "egg"),
                        new MoveLearnSetEntry(Move.DEFOG, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH, "egg"),
                        new MoveLearnSetEntry(Move.SNATCH, "egg"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO, "egg")
                ),
                List.of(Label.RADICAL_RED, Label.GEN6),
                0, List.of(),
                new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Noibat");
        this.setCanFly(true);
    }
}
