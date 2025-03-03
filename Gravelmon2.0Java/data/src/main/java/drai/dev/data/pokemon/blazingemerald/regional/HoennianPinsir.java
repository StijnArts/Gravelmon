package drai.dev.data.pokemon.blazingemerald.regional;

import com.cobblemon.mod.common.entity.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HoennianPinsir extends Pokemon {
    public HoennianPinsir(String name, Aspect aspect) {
        super(name, aspect,"HoennianPinsir",
                Type.BUG, Type.GROUND,
                new Stats(65, 105, 80, 50, 55, 50),
                List.of(Ability.PURE_POWER), Ability.PURE_POWER,
                UnitConverter.feetToMeters(5, 3), UnitConverter.lbsToKg(1962),
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                51,  List.of(EggGroup.BUG),
                List.of("It grips its prey in its pincers and crushes the life out of them. It can't move if it's cold, so it prefers to inhabit warm, dry places."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_TOMB,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.SLASH,15),
                        new MoveLearnSetEntry(Move.XSCISSOR,31),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,38),
                        new MoveLearnSetEntry(Move.MEGAHORN,45),
                        new MoveLearnSetEntry(Move.SUPERPOWER,54),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.MAGNITUDE,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"egg"),
                        new MoveLearnSetEntry(Move.UTURN,"egg")
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN1),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.RARE, 25, 50, 10.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_ARID)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD, Biome.IS_TEMPERATE))),
                List.of(SpawnPreset.VILLAGE),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Pinsir");

        setBaseScale(1);
        setHitbox(1,1);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setAnimationFileName("hoennianpinsir");
        getPosingFileData().setPortraitData(1.8f, new Vector3(-.44, -0.07, 0));
        getPosingFileData().setProfileData(.56f, new Vector3(0, 0.9, 0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().notBattle().withBlink().addPoseType(PoseType.FLOAT).addPoseType(PoseType.HOVER).addQuirk(Quirk.simpleQuirk("cry")),
                AnimationData.walkingAnimation().withBlink().addPoseType(PoseType.SWIM).addPoseType(PoseType.FLY).addQuirk(Quirk.simpleQuirk("cry")),
                AnimationData.sleepingAnimation(),
                AnimationData.battleIdleAnimation().withBlink().addQuirk(Quirk.simpleQuirk("cry"))
        ));
    }
}
