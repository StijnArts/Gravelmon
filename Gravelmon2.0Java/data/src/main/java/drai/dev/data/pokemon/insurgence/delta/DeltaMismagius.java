package drai.dev.data.pokemon.insurgence.delta;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DeltaMismagius extends Pokemon {
    public DeltaMismagius(String name, Aspect aspect) {
        super(name, aspect,"DeltaMismagius",
                Type.ICE, Type.FAIRY,
                new Stats(60, 60,60,105,105,105),
                List.of(Ability.MAGIC_GUARD), Ability.WINTER_JOY,
                9, 44,
                new Stats(0,0,0,0,1,0), 45,
                0.5,
                173, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("This Pokemon loves making snow-ghosts with humans. It has an unquenchable love for the holidays."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FREEZEDRY,1),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,1),
                        new MoveLearnSetEntry(Move.FLY,1),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.CHATTER,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.MIST,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.PRESENT,50),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.JET_STREAM,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.ACHILLES_HEEL,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.SILVER_WIND,"tm"),
                        new MoveLearnSetEntry(Move.LUNAR_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DROP,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.PERMAFROST,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.ACID,"tutor"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tutor"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"tutor"),
                        new MoveLearnSetEntry(Move.CELEBRATE,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tutor"),
                        new MoveLearnSetEntry(Move.MIMIC,"tutor"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tutor"),
                        new MoveLearnSetEntry(Move.TRICK,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tutor")
                        ),
                List.of(Label.GEN4,Label.INSURGENCE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD)
    .setAntiBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Mismagius");
        this.setCanFly(true);
        setBaseScale(1.0);
        setHitbox(1.0, 2.0);
        
        getSpeciesFileData().addBasicVariation("IZetyXX");
        getPosingFileData().setPortraitData( 2f, new Vector3(-1, 2.5, 0));
        getPosingFileData().setProfileData( .6f, new Vector3(0, 1.25, 0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withBlink().markAsBackupPose(),
                AnimationData.walkingAnimation().withBlink(),
                AnimationData.flyingAnimation().withBlink(),
                AnimationData.hoveringAnimation().withBlink()
        ));
    }
}
