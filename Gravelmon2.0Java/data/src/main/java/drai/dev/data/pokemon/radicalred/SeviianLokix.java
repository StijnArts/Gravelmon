package drai.dev.data.pokemon.radicalred;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class SeviianLokix extends Pokemon {
    public SeviianLokix(String name, Aspect aspect) {
        super(name, aspect,"SeviianLokix",
                Type.BUG, Type.DRAGON,
                new Stats(71, 102, 78, 52, 55, 92),
                List.of(Ability.SWARM), Ability.TINTED_LENS,
                10, 175,
                new Stats(0, 2, 0, 0, 0, 0), 30,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.LUNGE, 1),
                        new MoveLearnSetEntry(Move.POUNCE, 1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, 4),
                        new MoveLearnSetEntry(Move.ASTONISH, 6),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 9),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, 11),
                        new MoveLearnSetEntry(Move.SCREECH, 14),
                        new MoveLearnSetEntry(Move.ENDURE, 18),
                        new MoveLearnSetEntry(Move.BUG_BITE, 22),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE, 26),
                        new MoveLearnSetEntry(Move.AGILITY, 30),
                        new MoveLearnSetEntry(Move.DUAL_CHOP, 34),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION, 41),
                        new MoveLearnSetEntry(Move.BOUNCE, 44),
                        new MoveLearnSetEntry(Move.AXE_KICK, 48),
                        new MoveLearnSetEntry(Move.SCALE_SHOT, 58),
                        new MoveLearnSetEntry(Move.ACROBATICS, "tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "tm"),
                        new MoveLearnSetEntry(Move.DRACO_BARRAGE, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.LEECH_SEED, "tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK, "tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tm"),
                        new MoveLearnSetEntry(Move.TAUNT, "tm"),
                        new MoveLearnSetEntry(Move.THIEF, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE, "tm"),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL, "tm"),
                        new MoveLearnSetEntry(Move.UTURN, "tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, "tutor"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR, "tutor"),
                        new MoveLearnSetEntry(Move.COUNTER, "egg"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK, "egg")
                ),
                List.of(Label.RADICAL_RED, Label.GEN9),
                0, List.of(),
                new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(24)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BAMBOO)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Lokix");
    }
}
