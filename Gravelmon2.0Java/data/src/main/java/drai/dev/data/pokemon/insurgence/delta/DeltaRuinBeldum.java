package drai.dev.data.pokemon.insurgence.delta;

import com.cobblemon.mod.common.entity.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DeltaRuinBeldum extends Pokemon {
    public DeltaRuinBeldum(String name, Aspect aspect) {
        super(name, aspect,"DeltaRuinBeldum",
                Type.GRASS, Type.ROCK,
                new Stats(40, 55, 80, 35, 60, 30),
                List.of(Ability.STURDY), Ability.ROCK_HEAD,
                6, 952,
                new Stats(0,0,1,0,0,0), 3,
                -1,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("A Delta Species discovered by LunarDusk and Cowctus. It is said that beneath its rough exterior exists a crystal shard of unimaginable value."),
                List.of(new EvolutionEntry("deltaruinmetang", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.HOLD_BACK,"tutor")
                        ),
                List.of(Label.GEN3,Label.INSURGENCE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 5, 30, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.JUNGLE_PYRAMID),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Beldum");
        this.setCanFly(true);
        
        setBaseScale(0.75);
        setHitbox(0.4,0.8);
        getSpeciesFileData().addBasicVariation("Maliant");
        getPosingFileData().setPortraitData( 1f, new Vector3(0, 0.5, 0));
        getPosingFileData().setProfileData( 1f, new Vector3(0, 0.5, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.battleIdleAnimation().withBlink(),
                AnimationData.standingAnimation().notBattle().withBlink().markAsBackupPose(),
                AnimationData.walkingAnimation().withBlink(),
                AnimationData.hoveringAnimation().addPoseType(PoseType.FLOAT).withBlink(),
                AnimationData.flyingAnimation().addPoseType(PoseType.SWIM).withBlink(),
                AnimationData.sleepingAnimation()
        ));
        getPosingFileData().setAnimationFileName("beldum");
        getPosingFileData().setCry("q.bedrock_stateful('beldum', 'cry')");
    }
}
