package drai.dev.data.pokemon.blazingemerald;

import com.cobblemon.mod.common.entity.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lucemoth extends Pokemon {
    public Lucemoth() {
        super("Lucemoth",
                Type.BUG, Type.FAIRY,
                new Stats(80, 65, 100, 85, 100, 55),
                List.of(Ability.TACTICIAN), Ability.ILLUMINATE,
                UnitConverter.feetToMeters(5, 11), UnitConverter.lbsToKg(1389),
                new Stats(0,0,1,0,1,0), 70,
                0.5,
                161, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.BUG),
                List.of("Unlike its relative Venomoth, a Muramoth foregoes flight, instead leaving its wings draped around it's body for protection. They prefer to live in total solitude."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,5),
                        new MoveLearnSetEntry(Move.TAUNT,9),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,13),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,17),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,21),
                        new MoveLearnSetEntry(Move.DARK_PULSE,31),
                        new MoveLearnSetEntry(Move.HIVEMIND,36),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,43),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,49),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.VEILED_SKY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm")

                ),
                List.of(Label.BLAZING_EMERALD),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 31, 48, 0.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());

        setBaseScale(1);
        setHitbox(1,1);
        getSpeciesFileData()
                .addBasicVariation("El Pigeon");
        getPosingFileData().setPortraitData(1.81f, new Vector3(-0.3, -0.94, 0));
        getPosingFileData().setProfileData(.69f, new Vector3(0, 0.62, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().notBattle().markAsBackupPose().addQuirk(Quirk.simpleQuirk("quirk")),
                AnimationData.walkingAnimation().addPoseType(PoseType.SWIM).addQuirk(Quirk.simpleQuirk("quirk")),
                AnimationData.battleIdleAnimation().addQuirk(Quirk.simpleQuirk("quirk")),
                AnimationData.flyingAnimation().addQuirk(Quirk.simpleQuirk("quirk")),
                AnimationData.hoveringAnimation().addQuirk(Quirk.simpleQuirk("quirk")),
                AnimationData.sleepingAnimation()
        ));
        getPosingFileData().addCry();
    }
}
