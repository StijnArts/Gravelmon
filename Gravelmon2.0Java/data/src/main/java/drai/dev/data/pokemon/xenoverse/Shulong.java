package drai.dev.data.pokemon.xenoverse;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Shulong extends Pokemon {
    public Shulong() {
        super("Shulong",
                Type.WATER, Type.DRAGON,
                new Stats(58, 40, 73, 55, 73, 51),
                List.of(Ability.HYDRATION), Ability.DRAGON_ARMOR,
                5, 70,
                new Stats(0,0,2,0,0,0), 45,
                -1,
                90, ExperienceGroup.SLOW,
                70,
                41, List.of(EggGroup.UNDISCOVERED),
                List.of("Its blue covering skin is very elastic and can rebound attacks. However, it is extremely sensitive to cold."),
                List.of(new EvolutionEntry("shulongterrestrial", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "gravelmon:terrestrial_ring"))).notOptional(),
                        new EvolutionEntry("shulongxenoversal", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "gravelmon:xenoversal_ring"))).notOptional(),
                        new EvolutionEntry("shulongastral", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "gravelmon:terrestrial_ring"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50"))).notOptional(),
                        new EvolutionEntry("shulongastral", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "gravelmon:xenoversal_ring"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50"))).notOptional()),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TWISTER,6),
                        new MoveLearnSetEntry(Move.HARDEN,9),
                        new MoveLearnSetEntry(Move.BIDE,12),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,18),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,23),
                        new MoveLearnSetEntry(Move.PROTECT,28),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,32),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,36),
                        new MoveLearnSetEntry(Move.DRAGON_ENDURANCE,38),
                        new MoveLearnSetEntry(Move.RECOVER,40),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,45),
                        new MoveLearnSetEntry(Move.VELVET_SCALES,48),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,51),
                        new MoveLearnSetEntry(Move.ACID_RAIN,54),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,56),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,61),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ACID_RAIN,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_ENDURANCE,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,"tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_CANNON,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.STAR_BURST,"tutor"),
                        new MoveLearnSetEntry(Move.VELVET_SCALES,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 5, 32, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.9, 1,
                List.of());
        this.setShoulderMountable(true);
        this.setWillSleepOnBed(true);
        
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);
        
        this.setBaseScale(0.9);
        setHitbox(1,1);
        getSpeciesFileData().addBasicVariation("MayTheEpicGamer");
        getPosingFileData().setPortraitData( 3.6f, new Vector3(0, -2.7, 0));
        getPosingFileData().setProfileData( 1.2f, new Vector3(0, 0, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().markAsBackupPose().withBlink(),
                AnimationData.walkingAnimation().withBlink(),
                AnimationData.swimmingAnimation().withBlink(),
                AnimationData.floatingAnimation().withBlink()
        ));
        getPosingFileData().setFaint("bedrock(shulong, faint)");
    }
}
