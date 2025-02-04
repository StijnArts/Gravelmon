package drai.dev.data.pokemon.xenoverse.xspecies;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class AegislashX extends Pokemon {
    public AegislashX(String name, Aspect aspect) {
        super(name, aspect,"AegislashX",
                Type.FAIRY, Type.GHOST,
                new Stats(90, 140, 75, 60, 79, 103),
                List.of(Ability.DEFIANT, Ability.NO_GUARD), Ability.MOXIE,
                19, 530,
                new Stats(0,0,0,0,0,1), 45,
                -1,
                234, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.XENO),
                List.of("It's mentioned in legends as the companion of the First King. It uses its momentum to move at high speeds."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,1),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,1),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,1),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,13),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,16),
                        new MoveLearnSetEntry(Move.PROTECT,20),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,24),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,28),
                        new MoveLearnSetEntry(Move.POLTERGEIST,32),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,36),
                        new MoveLearnSetEntry(Move.POWER_GEM,39),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,42),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,45),
                        new MoveLearnSetEntry(Move.GYRO_BALL,48),
                        new MoveLearnSetEntry(Move.IRON_TAIL,52),
                        new MoveLearnSetEntry(Move.BODY_SLAM,55),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,60),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tutor")
                        ),
                List.of(Label.XENOVERSE, Label.GEN6),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 48, 0.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setLangFileName("Aegislash");

        
        this.setBaseScale(0.9);
        this.setHitbox(1.4, 1.6);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setAnimationFileName("aegislash_x");
        getPosingFileData().setPortraitData( 1.8f, new Vector3(0, 2.7, 0));
        getPosingFileData().setProfileData( .6f, new Vector3(0, 1.4, 0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().markAsBackupPose(),
                AnimationData.walkingAnimation()
        ));
    }
}
