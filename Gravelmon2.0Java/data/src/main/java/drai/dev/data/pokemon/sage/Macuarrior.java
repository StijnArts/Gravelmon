package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Macuarrior extends Pokemon {
    public Macuarrior() {
        super("Macuarrior",
                Type.FIGHTING,
                new Stats(70, 105, 70, 60, 90, 105),
                List.of(Ability.HYPER_CUTTER), Ability.SHARPNESS,
                16, 565,
                new Stats(0,1,0,0,0,1), 45,
                1,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                76, List.of(EggGroup.HUMAN_LIKE),
                List.of("The edges of Macuarrior's blades are extremely sharp. Through constant honing, these blades can effortlessly cut through concrete."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FROST_SLASH,1),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,1),
                        new MoveLearnSetEntry(Move.AIR_SLASH,1),
                        new MoveLearnSetEntry(Move.REVENGE,1),
                        new MoveLearnSetEntry(Move.DETECT,5),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,9),
                        new MoveLearnSetEntry(Move.SWAGGER,13),
                        new MoveLearnSetEntry(Move.SLASH,18),
                        new MoveLearnSetEntry(Move.BULK_UP,22),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,25),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,29),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,33),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,37),
                        new MoveLearnSetEntry(Move.STONE_EDGE,41),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,45),
                        new MoveLearnSetEntry(Move.XSCISSOR,49),
                        new MoveLearnSetEntry(Move.MOONLIGHT,53),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,57),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,61),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,65),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,69),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.MIRACLE_WILL,"tm"),
                        new MoveLearnSetEntry(Move.PINCER_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.FLING,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:cocoa_beans",50, 1,2)
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
