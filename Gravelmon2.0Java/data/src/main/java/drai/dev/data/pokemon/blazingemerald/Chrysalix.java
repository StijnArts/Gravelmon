package drai.dev.data.pokemon.blazingemerald;

import com.cobblemon.mod.common.entity.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Chrysalix extends Pokemon {
    public Chrysalix() {
        super("Chrysalix",
                Type.ROCK, Type.ICE,
                new Stats(80, 45, 75, 90, 200, 60),
                List.of(Ability.CRYSTAL_CASE), Ability.CRYSTAL_CASE,
                UnitConverter.feetToMeters(14, 3), UnitConverter.lbsToKg(6614),
                new Stats(1,1,0,0,3,0), 45,
                0.5,
                167, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.MINERAL),
                List.of("Chrysalix are a new species discovered by researchers conducting experiments on the crystalline Onix in Shoal Cave. They continue to grow larger with age."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.WRAP,9),
                        new MoveLearnSetEntry(Move.HARDEN,13),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,21),
                        new MoveLearnSetEntry(Move.ACCELEROCK,25),
                        new MoveLearnSetEntry(Move.HAIL,33),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,37),
                        new MoveLearnSetEntry(Move.CRYSTALLIZE,45),
                        new MoveLearnSetEntry(Move.EARTH_POWER,49),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,57),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_CANNON,"egg")
                        ),
                List.of(Label.BLAZING_EMERALD),
                0, List.of(),
                new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(48)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD, Biome.IS_FREEZING)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);

        getSpeciesFileData().addBasicVariation("Neoxaivus");
        getPosingFileData().setAnimationFileName("steelix");
        getPosingFileData().setPortraitData(0.4f, new Vector3(-0.2, 1.2, 0));
        getPosingFileData().setProfileData(0.4f, new Vector3(-0.2, 1.2, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.battleIdleAnimation("cobblemon").withBlink(),
                AnimationData.sleepingAnimation("cobblemon"),
                AnimationData.standingAnimation("cobblemon").notBattle().withBlink(),
                AnimationData.walkingAnimation("cobblemon").withBlink().addPoseType(PoseType.SWIM)
        ));
        getPosingFileData().setCryFromAnimationType("q.bedrock_stateful");
        
        setBaseScale(1.5);
        setHitbox(1,1);

    }
}
