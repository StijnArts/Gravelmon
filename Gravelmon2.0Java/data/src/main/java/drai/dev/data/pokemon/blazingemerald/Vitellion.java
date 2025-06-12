package drai.dev.data.pokemon.blazingemerald;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Vitellion extends Pokemon {
    public Vitellion() {
        super("Vitellion",
                Type.QUESTION_MARK,
                new Stats(250, 10, 130, 10, 130, 10),
                List.of(Ability.AMALGAM), Ability.AMALGAM,
                UnitConverter.feetToMeters(2, 6), UnitConverter.lbsToKg(100),
                new Stats(2,0,0,0,0,0), 15,
                0.5,
                600, ExperienceGroup.SLOW,
                70,
                51, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"egg"),
                        new MoveLearnSetEntry(Move.SNAP_GUARD,"egg"),
                        new MoveLearnSetEntry(Move.SOFTBOILED,5),
                        new MoveLearnSetEntry(Move.MIMIC,10),
                        new MoveLearnSetEntry(Move.ASSIST,15),
                        new MoveLearnSetEntry(Move.TRANSFORM,20),
                        new MoveLearnSetEntry(Move.SPIKES,25),
                        new MoveLearnSetEntry(Move.HELPING_HAND,30),
                        new MoveLearnSetEntry(Move.TOXIC,35),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,40),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,45),
                        new MoveLearnSetEntry(Move.SHADE_TRANCE,50)
                        ),
                List.of(Label.BLAZING_EMERALD, Label.JOKE),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 10, 40, 0.001, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());

        setBaseScale(1);
        setHitbox(1,1);
        getSpeciesFileData().addBasicVariation("Uncle Berry");
        getPosingFileData().setPortraitData(2.24f, new Vector3(0.08, -1.11, 0));
        getPosingFileData().setProfileData(1f, new Vector3(0.0, .35, 0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().markAsBackupPose().withBlink()
        ));
    }
}
