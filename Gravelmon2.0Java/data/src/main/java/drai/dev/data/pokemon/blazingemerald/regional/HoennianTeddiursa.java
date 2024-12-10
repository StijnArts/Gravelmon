package drai.dev.data.pokemon.blazingemerald.regional;

import com.cobblemon.mod.common.entity.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HoennianTeddiursa extends Pokemon {
    public HoennianTeddiursa(String name, Aspect aspect) {
        super(name, aspect,"HoennianTeddiursa",
                Type.NORMAL, Type.FIRE,
                new Stats(55, 70,45,45,40,80),
                List.of(Ability.PICKUP), Ability.CUTE_CHARM,
                6, 88,
                new Stats(0,0,0,0,0,1), 120,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It's palms constantly give off a warm glow. When in distress, the heat from it's palms can become so intense that they burn through even solid metal."),
                List.of(new EvolutionEntry("hoennianursaring", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.LICK,13),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,19),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,25),
                        new MoveLearnSetEntry(Move.REST,31),
                        new MoveLearnSetEntry(Move.SLASH,37),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,43),
                        new MoveLearnSetEntry(Move.THRASH,49),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg"),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,"egg")
                        ),
                List.of(Label.GEN2,Label.BLAZING_EMERALD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 12, 27, 1.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Teddiursa");
        this.setPortraitXYZ(0,1.8,0);
        this.setModeled(true);
        this.setHitbox(0.7, 1);
        this.setBaseScale(0.55);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setAnimationFileName("teddiursa_hoennian");
        getPosingFileData().setPortraitData( 2.1f, new Vector3(-0.2, -0.7, 0.0));
        getPosingFileData().setProfileData( .7f, new Vector3(0.0, 0.7, 0.0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().notBattle().withBlink().addPoseType(PoseType.SWIM)
                        .addPoseType(PoseType.FLOAT).addPoseType(PoseType.HOVER),
                AnimationData.walkingAnimation().withBlink().addPoseType(PoseType.FLY),
                AnimationData.sleepingAnimation()
        ));
    }
}
