package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Doraiasu extends Pokemon {
    public Doraiasu() {
        super( "Doraiasu",
                Type.ICE, Type.DRAGON,
                new Stats(105	,110	,70	,65	,80	,80),
                List.of(Ability.ICE_BODY), Ability.SNOW_CLOAK,
                23, 894,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                184, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON, EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ICE_FANG,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.HAIL,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.MIST,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,6),
                        new MoveLearnSetEntry(Move.MIST,10),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,15),
                        new MoveLearnSetEntry(Move.AVALANCHE,19),
                        new MoveLearnSetEntry(Move.SUPERSONIC,24),
                        new MoveLearnSetEntry(Move.QUICK_TURN,28),
                        new MoveLearnSetEntry(Move.MINIMIZE,33),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,37),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,42),
                        new MoveLearnSetEntry(Move.HAZE,46),
                        new MoveLearnSetEntry(Move.CRYOSHOCK,51),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,55),
                        new MoveLearnSetEntry(Move.STARFREEZE,60),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,64),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.FROSTBITE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_ENTOMB,"tutor"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tutor"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ICICLE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PICK,"egg"),
                        new MoveLearnSetEntry(Move.HARDEN,"egg"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"egg"),
                        new MoveLearnSetEntry(Move.ICE_SHARD,"egg"),
                        new MoveLearnSetEntry(Move.CHROME_BALL,"egg"),
                        new MoveLearnSetEntry(Move.DYNASWORD,"egg"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,"egg"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,"egg"),
                        new MoveLearnSetEntry(Move.BLOCK,"egg"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg"),
                        new MoveLearnSetEntry(Move.BOULDER_BASH,"egg")
                ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 42, 56, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
        
        this.setBaseScale(1);
        this.setHitbox(1,2);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setPortraitData( 1f, new Vector3(0, 1.4, 0));
        getPosingFileData().setProfileData( .5f, new Vector3(0, 1, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().clearPoseTypes()
        ));
    }
}
