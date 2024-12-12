package drai.dev.data.pokemon.insurgence.delta;

import com.cobblemon.mod.common.entity.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DeltaChinchou extends Pokemon {
    public DeltaChinchou(String name, Aspect aspect) {
        super(name, aspect,"DeltaChinchou",
                Type.GHOST, Type.FIRE,
                new Stats(75, 38,38,56,56,67),
                List.of(Ability.FLASH_FIRE, Ability.UNNERVE), Ability.LEVITATE,
                7, 168,
                new Stats(1,0,0,0,0,0), 190,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("A Delta Species discovered by CommanderPhoenix. When it senses danger, it emits bright flames and fades into the shadows."),
                List.of(new EvolutionEntry("deltalanturn", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.HAZE,6),
                        new MoveLearnSetEntry(Move.EMBER,9),
                        new MoveLearnSetEntry(Move.SMOG,12),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,17),
                        new MoveLearnSetEntry(Move.INCINERATE,20),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,23),
                        new MoveLearnSetEntry(Move.WILLOWISP,28),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,31),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,34),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,39),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,42),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,45),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,47),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,50),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.NEW_MOON,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.ACHILLES_HEEL,"tm"),
                        new MoveLearnSetEntry(Move.LUNAR_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.WILDFIRE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_MATTER,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ACID,"tutor"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tutor"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tutor"),
                        new MoveLearnSetEntry(Move.MIMIC,"tutor"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"tutor"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SPITE,"tutor"),
                        new MoveLearnSetEntry(Move.TRICK,"tutor"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tutor")
                        ),
                List.of(Label.GEN2,Label.INSURGENCE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_DESERT, Biome.IS_NETHER_WASTELAND))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.25, 0.3,
                List.of());
        this.setLangFileName("Chinchou");
        this.setPortraitXYZ(0,1.8,0);

        this.setHitbox(0.7, 0.6);
        this.setBaseScale(0.6);
        this.setCanFly(true);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setAnimationFileName("chinchou_delta");
        getPosingFileData().setPortraitData( 1.6f, new Vector3(-0.2, -.7, 0));
        getPosingFileData().setProfileData( .6f, new Vector3(0, .5, 0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().clearPoseTypes().withBlink(),
                AnimationData.hoveringAnimation().withBlink()
        ));
    }
}
