package drai.dev.data.pokemon.infinity.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class EghoFeraligatr extends Pokemon {
    public EghoFeraligatr(String name, Aspect aspect) {
        super(name, aspect,"EghoFeraligatr",
                Type.WATER, Type.POISON,
                new Stats(75, 95, 70, 103, 66, 121),
                List.of(Ability.MERCILESS), Ability.SPEED_BOOST,
                23, 888,
                new Stats(0,0,0,1,0,2), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER, EggGroup.WATER_1),
                List.of("This form of Feraligatr thrives in the dark murky waters of swamps and sewers. These Pokemon can cause problems in sewers because their strong jaws can rip through pipes with ease."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VENOM_SWIPE,1),
                        new MoveLearnSetEntry(Move.SLUDGE,1),
                        new MoveLearnSetEntry(Move.POISON_TAIL,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,6),
                        new MoveLearnSetEntry(Move.ACID,8),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,13),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,23),
                        new MoveLearnSetEntry(Move.SUPER_FANG,25),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,31),
                        new MoveLearnSetEntry(Move.MUD_SHOT,33),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,43),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,46),
                        new MoveLearnSetEntry(Move.DARK_PULSE,53),
                        new MoveLearnSetEntry(Move.JUMP_KICK,56),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,62),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,65),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,75),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_FLOOD,"tm"),
                        new MoveLearnSetEntry(Move.CINDER_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_CANNON,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"egg"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"egg"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"egg"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"egg"),
                        new MoveLearnSetEntry(Move.CRUNCH,"egg"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"egg"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"egg"),
                        new MoveLearnSetEntry(Move.WATER_PLEDGE,"egg")
                        ),
                List.of(Label.GEN2,Label.INFINITY),
                2, List.of(
                        new ItemDrop("minecraft:leather",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 30, 42, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.35, 0.3,
                List.of());
        this.setLangFileName("Feraligatr");
        
        setBaseScale(1.2);
        setHitbox(1,1);
        getSpeciesFileData().addBasicVariation("Drai");
        getPosingFileData().setPortraitData( 0.5f, new Vector3(0, 0.7, 0));
        getPosingFileData().setProfileData( .5f, new Vector3(0, 0.7, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().markAsBackupPose().withBlink()
        ));
        getPosingFileData().setAnimationFileName("feraligatr_egho");
    }
}
