package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ocerumi extends Pokemon {
    public Ocerumi() {
        super("Ocerumi",
                Type.FIGHTING,
                new Stats(70, 105, 105, 60, 90, 70),
                List.of(Ability.IRON_FIST), Ability.INNER_FOCUS,
                16, 587,
                new Stats(0,1,1,0,0,0), 45,
                0,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                76, List.of(EggGroup.HUMAN_LIKE),
                List.of("Ocerumi encases its hands in special clay, baking them in harsh sun. When dried, these stone gauntlets can resist even Ocerumi's earth-shattering punch."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,1),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,1),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.PROTECT,5),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,9),
                        new MoveLearnSetEntry(Move.SWAGGER,13),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,18),
                        new MoveLearnSetEntry(Move.BULK_UP,22),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,25),
                        new MoveLearnSetEntry(Move.AGILITY,29),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,33),
                        new MoveLearnSetEntry(Move.MIND_READER,37),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,41),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,41),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,41),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,45),
                        new MoveLearnSetEntry(Move.COUNTER,49),
                        new MoveLearnSetEntry(Move.MORNING_SUN,53),
                        new MoveLearnSetEntry(Move.METEOR_MASH,57),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,61),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,65),
                        new MoveLearnSetEntry(Move.PUNISHMENT,69),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.MIRACLE_WILL,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.FLING,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tutor")
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
