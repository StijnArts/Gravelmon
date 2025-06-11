package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Iguadium extends Pokemon {
    public Iguadium() {
        super("Iguadium",
                Type.WATER, Type.FIGHTING,
                new Stats(75, 75, 83, 60, 60, 60),
                List.of(Ability.TORRENT), Ability.TOUGH_CLAWS,
                11, 290,
                new Stats(0, 1, 1, 0, 0, 0), 45,
                0.875,
                145, ExperienceGroup.MEDIUM_SLOW,
                70,
                41, List.of(EggGroup.WATER_1, EggGroup.MONSTER),
                List.of("The thick layer of salt on Iguadium’s head and hands protects it in combat. It trains by throwing punches underwater for more resistance to build more muscle."),
                List.of(new EvolutionEntry("aguanaut", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "36")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.WATER_PULSE,14),
                        new MoveLearnSetEntry(Move.BIDE,17),
                        new MoveLearnSetEntry(Move.ARM_THRUST,18),
                        new MoveLearnSetEntry(Move.SCARY_FACE,22),
                        new MoveLearnSetEntry(Move.BRINE,26),
                        new MoveLearnSetEntry(Move.CHEAP_SHOT,30),
                        new MoveLearnSetEntry(Move.SUBMISSION,35),
                        new MoveLearnSetEntry(Move.SALT_CRASH,39),
                        new MoveLearnSetEntry(Move.BRACE,43),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,48),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,52),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,56),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,61),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,65),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,"tm"),
                        new MoveLearnSetEntry(Move.DEPTH_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.PINCER_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tutor"),
                        new MoveLearnSetEntry(Move.COUNTER,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.FLING,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.BLOCK,"egg"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"egg"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"egg"),
                        new MoveLearnSetEntry(Move.METAL_CLAW,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"egg"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"egg")
                        ),
                List.of(Label.SAGE),
                4, List.of(
                        new ItemDrop("minecraft:prismarine", 50, 1, 2),
                        new ItemDrop("minecraft:leather", 50, 1, 1)
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COAST)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setCanSwim(true);
        this.setBaseScale(0.7);
        this.setHitbox(1,1.4);

        
        getSpeciesFileData().addBasicVariation("Drai");
        getPosingFileData().setPortraitData( 1.6f, new Vector3(-.20, 1.2, 0));
        getPosingFileData().setProfileData( .6f, new Vector3(-.10, .90, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().withBlink().markAsBackupPose()
        ));
    }
}
