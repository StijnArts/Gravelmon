package drai.dev.data.pokemon.insurgence.delta;

import com.cobblemon.mod.common.entity.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DeltaCharizard extends Pokemon {
    public DeltaCharizard(String name, Aspect aspect) {
        super(name, aspect, "DeltaCharizard",
                Type.GHOST, Type.DRAGON,
                new Stats(78, 84, 78, 109, 85, 100),
                List.of(Ability.SPIRIT_CALL), Ability.DARK_AURA,
                17, 419,
                new Stats(0, 0, 0, 3, 0, 0), 45,
                0.875,
                267, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("The flame on its tail grows in the presence of strong opponents. Its breath gives the impression of being engulfed in magma but causes no physical harm."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.TWISTER, 1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY, 1),
                        new MoveLearnSetEntry(Move.TWISTER, 7),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY, 10),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK, 17),
                        new MoveLearnSetEntry(Move.SCREECH, 21),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 28),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 32),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE, 36),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 41),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, 47),
                        new MoveLearnSetEntry(Move.LUNAR_CANNON, 56),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE, 62),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH, 71),
                        new MoveLearnSetEntry(Move.OUTRAGE, 77),
                        new MoveLearnSetEntry(Move.HONE_CLAWS, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, "tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tm"),
                        new MoveLearnSetEntry(Move.ROAR, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.HAIL, "tm"),
                        new MoveLearnSetEntry(Move.BULK_UP, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.TAUNT, "tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.SNATCH, "tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, "tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tm"),
                        new MoveLearnSetEntry(Move.TORMENT, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tm"),
                        new MoveLearnSetEntry(Move.THIEF, "tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE, "tm"),
                        new MoveLearnSetEntry(Move.FLING, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL, "tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP, "tm"),
                        new MoveLearnSetEntry(Move.NEW_MOON, "tm"),
                        new MoveLearnSetEntry(Move.EMBARGO, "tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tm"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tm"),
                        new MoveLearnSetEntry(Move.RETALIATE, "tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tm"),
                        new MoveLearnSetEntry(Move.JET_STREAM, "tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB, "tm"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.DRACO_JET, "tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH, "tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS, "tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE, "tm"),
                        new MoveLearnSetEntry(Move.ACHILLES_HEEL, "tm"),
                        new MoveLearnSetEntry(Move.LUNAR_CANNON, "tm"),
                        new MoveLearnSetEntry(Move.INCINERATE, "tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tm"),
                        new MoveLearnSetEntry(Move.ROUND, "tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE, "tm"),
                        new MoveLearnSetEntry(Move.SNARL, "tm"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tm"),
                        new MoveLearnSetEntry(Move.DRAGONIFY, "tm"),
                        new MoveLearnSetEntry(Move.QUASH, "tm"),
                        new MoveLearnSetEntry(Move.DARK_MATTER, "tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tm"),
                        new MoveLearnSetEntry(Move.CUT, "tm"),
                        new MoveLearnSetEntry(Move.FLY, "tm"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tm"),
                        new MoveLearnSetEntry(Move.ACID, "tutor"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.COUNTER, "tutor"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR, "tutor"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP, "tutor"),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD, "tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.MIMIC, "tutor"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND, "tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE, "tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT, "tutor"),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS, "tutor"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SPITE, "tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND, "tutor"),
                        new MoveLearnSetEntry(Move.TWISTER, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor")
                ),
                List.of(Label.GEN1, Label.INSURGENCE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY)
                        .atNight()
                        .canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL)
                        .build(), List.of());

        this.setLangFileName("Charizard");
        setCanBreatheUnderwater(true);

        this.setBaseScale(1.35);
        this.setHitbox(1, 2.1);
        getSpeciesFileData().addBasicVariation("Drai").addLayer(
                        new AnimatedLayerData("flame",
                                List.of("flame/deltatail1", "flame/deltatail2", "flame/deltatail3", "flame/deltatail4"),
                                10, true,
                                Optional.of(true), Optional.of(false), false, false))
                .addLayer(new SimpleTextureLayerData("glow", "deltacharizard_emissive",
                        Optional.of(true), Optional.of(true), false, true));
        getPosingFileData().setPortraitData(2.1f, new Vector3(-1.11, 2.43, 0));
        getPosingFileData().setProfileData(.51f, new Vector3(0.05, 0.99, -10));
        getPosingFileData().head = "head_ai";
        getPosingFileData().setRootBone("charizard");
        getPosingFileData().addFirstPersonCameraOffset("seat_1", new Vector3(0, 0.25, 0));
        getPosingFileData().setThirdPersonCameraOffset("seat_1", new Vector3(0, 3, 6), new Vector3(0, 3, 6));
        getPosingFileData().addMiscAnimations("cry", "recoil");
        getPosingFileData().addMiscAnimation("physical", "q.bedrock_primary('deltacharizard', 'physical', q.curve('symmetrical_wide'))");
        getPosingFileData().addMiscAnimation("special", "q.bedrock_primary('deltacharizard', 'special', q.curve('symmetrical_wide'))");
        getPosingFileData().addMiscAnimation("air_physical", "q.bedrock_primary('deltacharizard', 'air_physical', q.curve('symmetrical_wide'))");
        getPosingFileData().addMiscAnimation("air_special", "q.bedrock_primary('deltacharizard', 'air_special', q.curve('symmetrical_wide'))");
        getPosingFileData().addMiscAnimation("status", "q.bedrock_primary('deltacharizard', 'status', q.curve('symmetrical_wide'))");
        getPosingFileData().addAnimations(List.of(
                AnimationData.emptyAnimation().setPoseName("portrait").setPoseTypes(List.of(PoseType.PORTRAIT, PoseType.PROFILE)).notBattle().notTouchingWater()
                        .addAnimations("q.look('head_ai')", "q.bedrock('deltacharizard', 'ground_idle')").withBlink(),
                AnimationData.battleIdleAnimation().withLook().addAnimations("q.bedrock('deltacharizard', 'battle_idle')")
                        .withBlink().addQuirk(Quirk.simpleQuirk("battle_quirk")).addNamedAnimation("cry", "q.bedrock_primary('deltacharizard', 'battle_cry', q.curve('symmetrical_wide'))"),
                AnimationData.battleFlyingAnimation().withLook().withBlink()
                        .addNamedAnimation("cry", "q.bedrock_primary('deltacharizard', 'air_battle_cry', q.curve('symmetrical_wide'))")
                        .addNamedAnimation("recoil", "q.bedrock_stateful('deltacharizard', 'air_recoil')")
                        .addNamedAnimation("physical", "q.bedrock_primary('deltacharizard', 'air_physical', q.curve('symmetrical'))")
                        .addNamedAnimation("special", "q.bedrock_primary('deltacharizard', 'air_special', q.curve('symmetrical_wide'))")
                        .addNamedAnimation("status", "q.bedrock_primary('deltacharizard', 'air_status', q.curve('symmetrical_wide'))"),
                AnimationData.standingAnimation().removePoseTypes(PoseType.PORTRAIT, PoseType.PROFILE).withLook().withBlink().addQuirk("ground_quirk")
                        .addQuirk(
                                new PrimaryQuirk("idle_quirk", 1, 20, 40, "q.curve('symmetrical')")
                        ),
                AnimationData.walkingAnimation().withLook().withBlink().addPoseType(PoseType.SWIM).notTouchingWater(),
                AnimationData.sleepingAnimation().addQuirk("sleep_quirk").addNamedAnimation("cry", "q.bedrock_stateful('dummy', 'cry')"),
                AnimationData.hoveringAnimation().notBattle().withLook().withBlink(),
                AnimationData.flyingAnimation().setCondition("!q.is_gliding").withLook().withBlink().addQuirk("air_fly_quirk")
                        .addConditionalAnimation(new ConditionalAnimation("ride_air_look", "q.is_ridden")),
                AnimationData.surfaceFloatingAnimation().withLook().withBlink().clearAnimations().addAnimation("surfacewater_idle")
                        .setTransformedPartDataList(List.of(new TransformedPartData("body", new Vector3(0,22,0)))),
                AnimationData.surfaceSwimmingAnimation().withLook().withBlink().clearAnimations().addAnimation("surfacewater_swim")
                        .setTransformedPartDataList(List.of(new TransformedPartData("body", new Vector3(0,22,0))))
        ));
    }
}
