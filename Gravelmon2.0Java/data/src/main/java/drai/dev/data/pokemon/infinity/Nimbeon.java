package drai.dev.data.pokemon.infinity;

import com.cobblemon.mod.common.entity.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Nimbeon extends Pokemon {
    public Nimbeon() {
        super("Nimbeon",
                Type.FLYING,
                new Stats(120, 88, 61, 70, 80, 106),
                List.of(Ability.AERILATE), Ability.GALE_WINGS,
                13, 140,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                35, List.of(EggGroup.FIELD),
                List.of("Nimbeon floats through the air, barely grazing the surface as it's used as a pushing-off point. If winds get too strong, it can blow Nimbeon away."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROOST,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,1),
                        new MoveLearnSetEntry(Move.SWIFT,6),
                        new MoveLearnSetEntry(Move.CHARM,11),
                        new MoveLearnSetEntry(Move.SKY_DROP,14),
                        new MoveLearnSetEntry(Move.MIST,17),
                        new MoveLearnSetEntry(Move.ICY_WIND,20),
                        new MoveLearnSetEntry(Move.AIR_SLASH,26),
                        new MoveLearnSetEntry(Move.WHIRLWIND,30),
                        new MoveLearnSetEntry(Move.HAZE,36),
                        new MoveLearnSetEntry(Move.BODY_SLAM,42),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,47),
                        new MoveLearnSetEntry(Move.TAILWIND,53),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,59),
                        new MoveLearnSetEntry(Move.DEFOG,62),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,67),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DROP,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.ROOST,"tutor"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.COVET,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DETECT,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"egg"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"egg"),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg"),
                        new MoveLearnSetEntry(Move.WISH,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg")
                ),
                List.of(Label.INFINITY),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 44, 56, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "day"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.24, 0.3,
                List.of());
        this.setCanFly(true);


        this.setBaseScale(0.8);
        this.setCanFly(true);
        this.setPreEvolution("eevee");
        addAdditionalEvolution("eevee", new EvolutionEntry("nimbeon", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.ROOST, "")),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"minecraft:feather"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"day"))));
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setPortraitData( 1.9f, new Vector3(-0.4, -0.3, 0));
        getPosingFileData().setProfileData( .9f, new Vector3(0, .35, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withBlink().withLook().markAsBackupPose(),
                AnimationData.walkingAnimation().withBlink().addPoseType(PoseType.SWIM).withLook(),
                AnimationData.hoveringAnimation().addPoseType(PoseType.FLOAT).withBlink()
        ));
    }
}
