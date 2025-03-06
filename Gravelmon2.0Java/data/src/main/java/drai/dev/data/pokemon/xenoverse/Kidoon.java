package drai.dev.data.pokemon.xenoverse;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Kidoon extends Pokemon {
    public Kidoon() {
        super("Kidoon",
                Type.FLYING,
                new Stats(25, 20, 55, 10, 20, 70),
                List.of(Ability.DRY_SKIN), Ability.WEAK_ARMOR,
                12, 55,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                40, ExperienceGroup.ERRATIC,
                70,
                32, List.of(EggGroup.WATER_2, EggGroup.DRAGON),
                List.of("It's incredible fertile in ponds and swamps. It feeds on microorganisms it filters with its large mouth."),
                List.of(new EvolutionEntry("honchen", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.GUST,15),
                        new MoveLearnSetEntry(Move.FLAIL,25),
                        new MoveLearnSetEntry(Move.AQUA_JET,"egg"),
                        new MoveLearnSetEntry(Move.HURRICANE,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.HISS,"egg"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"tutor"),
                        new MoveLearnSetEntry(Move.BIND,"tutor"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.COMMON, 8, 12, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FRESHWATER, Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.IS_RAINING, "false"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.WATER_SURFACE),
                0.3, 0.3,
                List.of());

        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);
        this.setAvoidsLand(true);
        this.setCanWalkOnWater(true);
        setBaseScale(1);
        setHitbox(1,1);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setPortraitData(1.55f, new Vector3(0, -0.46, 0));
        getPosingFileData().setProfileData(.56f, new Vector3(0.7, 0.8, 0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().markAsBackupPose().withBlink()
        ));
    }
}
