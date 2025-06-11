package drai.dev.data.pokemon.blazingemerald.regional;

import com.cobblemon.mod.common.entity.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HoennianVenonat extends Pokemon {
    public HoennianVenonat(String name, Aspect aspect) {
        super(name, aspect,"HoennianVenonat",
                Type.BUG, Type.DARK,
                new Stats(55, 40, 45, 55, 45, 65),
                List.of(Ability.RUN_AWAY), Ability.ILLUMINATE,
                10, 300,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.BUG),
                List.of("Timid by nature, the wild Venonat in Hoenn prefer to live in damp, dark places. Their large, glowing eyes can see clearly even in total blackness."),
                List.of(new EvolutionEntry("muramoth", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "31"))),
                        new EvolutionEntry("lucemoth", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "31")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,5),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,9),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,13),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,17),
                        new MoveLearnSetEntry(Move.TAUNT,21),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,25),
                        new MoveLearnSetEntry(Move.HYPNOSIS,28),
                        new MoveLearnSetEntry(Move.DARK_PULSE,33),
                        new MoveLearnSetEntry(Move.MOONLIGHT,37),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.VEILED_SKY,"tm"),
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
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"egg")
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN1),
                0, List.of(),
                new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Venonat");

        setBaseScale(1);
        setHitbox(1,1);
        getSpeciesFileData()
                .addBasicVariation("PorousMist")
                .addLayer(
                        new SimpleTextureLayerData("emissive", "hoennianvenonat_emissive", Optional.of(true), Optional.of(false), false, true)
                );
        getPosingFileData().setAnimationFileName("hoennianvenonat");
        getPosingFileData().setPortraitData(1.68999f, new Vector3(-0.1, -0.69, 0));
        getPosingFileData().setProfileData(.86f, new Vector3(0, 0.43, 0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().notBattle().withBlink().markAsBackupPose().withCry().addQuirk(Quirk.simpleQuirk("quirk1")).addQuirk(Quirk.simpleQuirk("quirk2")),
                AnimationData.walkingAnimation().withBlink().withCry().addPoseType(PoseType.SWIM).addPoseType(PoseType.FLY).addQuirk(Quirk.simpleQuirk("quirk1")).addQuirk(Quirk.simpleQuirk("quirk2")),
                AnimationData.battleIdleAnimation().withBlink().withCry().addQuirk(Quirk.simpleQuirk("quirk1")).addQuirk(Quirk.simpleQuirk("quirk2")),
                AnimationData.sleepingAnimation()
        ));
        getPosingFileData().addCry();
    }
}
