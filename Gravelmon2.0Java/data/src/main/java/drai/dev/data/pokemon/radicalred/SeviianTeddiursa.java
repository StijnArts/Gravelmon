package drai.dev.data.pokemon.radicalred;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class SeviianTeddiursa extends Pokemon {
    public SeviianTeddiursa(String name, Aspect aspect) {
        super(name, aspect,"SeviianTeddiursa",
                Type.GHOST,
                new Stats(55, 80, 50, 45, 50, 50),
                List.of(Ability.PICKUP, Ability.QUICK_FEET), Ability.CURSED_BODY,
                6, 194,
                new Stats(0, 1, 0, 0, 0, 0), 120,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("seviianursaring", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "28")))),
                List.of(
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES, 1),
                        new MoveLearnSetEntry(Move.CURSE, 1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, 1),
                        new MoveLearnSetEntry(Move.FLING, 1),
                        new MoveLearnSetEntry(Move.LICK, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK, 8),
                        new MoveLearnSetEntry(Move.HEX, 15),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE, 22),
                        new MoveLearnSetEntry(Move.SLASH, 25),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH, 30),
                        new MoveLearnSetEntry(Move.SCARY_FACE, 34),
                        new MoveLearnSetEntry(Move.WILLOWISP, 40),
                        new MoveLearnSetEntry(Move.COUNTER, 47),
                        new MoveLearnSetEntry(Move.DESTINY_BOND, 50),
                        new MoveLearnSetEntry(Move.FLING, 57),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "tm"),
                        new MoveLearnSetEntry(Move.BULK_UP, "tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tm"),
                        new MoveLearnSetEntry(Move.CUT, "tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH, "tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, "tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, "tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK, "tm"),
                        new MoveLearnSetEntry(Move.POLTERGEIST, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.ROAR, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER, "tm"),
                        new MoveLearnSetEntry(Move.TAUNT, "tm"),
                        new MoveLearnSetEntry(Move.THIEF, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP, "tm"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, "tutor"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.HEX, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT, "tutor"),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE, "tutor"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM, "egg"),
                        new MoveLearnSetEntry(Move.CHIP_AWAY, "egg"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT, "egg"),
                        new MoveLearnSetEntry(Move.COUNTER, "egg"),
                        new MoveLearnSetEntry(Move.CROSS_CHOP, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, "egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "egg"),
                        new MoveLearnSetEntry(Move.METAL_CLAW, "egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, "egg"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, "egg"),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS, "egg"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "egg"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, "egg"),
                        new MoveLearnSetEntry(Move.YAWN, "egg")
                ),
                List.of(Label.RADICAL_RED, Label.GEN2),
                0, List.of(),
                new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setAntiBiomes(Biome.IS_COLD)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Teddiursa");
    }
}
