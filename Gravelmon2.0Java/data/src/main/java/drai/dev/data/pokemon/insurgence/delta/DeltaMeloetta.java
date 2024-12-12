package drai.dev.data.pokemon.insurgence.delta;

import com.cobblemon.mod.common.entity.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import java.util.*;

import java.util.*;

public class DeltaMeloetta extends Pokemon {
    public DeltaMeloetta(String name, Aspect aspect) {
        super(name, aspect,"DeltaMeloetta",
                Type.DARK, Type.FAIRY,
                new Stats(100, 128, 90, 77, 77, 128),
                List.of(Ability.FILTER), Ability.FILTER,
                6, 65,
                new Stats(0,0,0,1,1,1), 90,
                -1,
                300, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("A Delta Species discovered by mushgloom. It became a mime after finding itself without a voice, but it is suspected that finding its voice would unlock its powers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THIEF,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.SWITCHEROO,11),
                        new MoveLearnSetEntry(Move.HYPNOSIS,16),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,21),
                        new MoveLearnSetEntry(Move.MIMIC,26),
                        new MoveLearnSetEntry(Move.STORED_POWER,31),
                        new MoveLearnSetEntry(Move.ASSURANCE,36),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,43),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,50),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,57),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,64),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,71),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,78),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,85),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.NEW_MOON,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.ACHILLES_HEEL,"tm"),
                        new MoveLearnSetEntry(Move.LUNAR_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_MATTER,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ACID,"tutor"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tutor"),
                        new MoveLearnSetEntry(Move.BLOCK,"tutor"),
                        new MoveLearnSetEntry(Move.COUNTER,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tutor"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tutor"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tutor"),
                        new MoveLearnSetEntry(Move.MIMIC,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                        new MoveLearnSetEntry(Move.RELIC_SONG,"tutor"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SPITE,"tutor"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.TRICK,"tutor"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor")
                        ),
                List.of(Label.GEN5,Label.INSURGENCE, Label.MYTHICAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 50, 70, 0.0002, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.22, 0.3,
                List.of(new PokemonForm(
                        "Magician", true,
                        Type.DARK, Type.PSYCHIC,
                        new Stats(100, 77, 77, 128, 128, 90),
                        List.of(Ability.FILTER), Ability.FILTER,
                        6, 65,
                        new Stats(0,0,0,1,1,1), 90,
                        -1,
                        300, ExperienceGroup.SLOW,
                        70,
                        50, List.of(EggGroup.DELTA),
                        List.of(Aspect.MAGICIAN),
                        List.of(),
                        List.of(),
                        List.of(),
                        List.of(Label.INSURGENCE),
                        0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 32, 45, 0, List.of(
                ), List.of(),
                        List.of(),
                        0.48, 0.3
                )));
        this.setLangFileName("Meloetta");
        this.setPortraitXYZ(0,1.8,0);
        
        this.setHitbox(0.5,1.3);
        this.setBaseScale(0.7);
        this.setCanFly(true);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setPortraitData( 1.7f, new Vector3(0, 1, 0));
        getPosingFileData().setProfileData( .6f, new Vector3(0, .8, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().clearPoseTypes(),
                AnimationData.flyingAnimation().withLook().addPoseType(PoseType.HOVER).addPoseType(PoseType.WALK)
        ));
    }
}
