package drai.dev.data.pokemon.insurgence.delta;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DeltaLombre extends Pokemon {
    public DeltaLombre(String name, Aspect aspect) {
        super(name, aspect,"DeltaLombre",
                Type.PSYCHIC, Type.WATER,
                new Stats(60, 50, 50, 60, 70, 50),
                List.of(Ability.MAGIC_BOUNCE, Ability.SYNCHRONIZE), Ability.UNAWARE,
                12, 325,
                new Stats(0,0,0,0,2,0), 120,
                0.5,
                119, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("From morning until night, it trains and practices its magic. During the evening it puts on magic shows for large crowds."),
                List.of(new EvolutionEntry("deltaludicolo", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:water_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.TELEKINESIS,3),
                        new MoveLearnSetEntry(Move.PSYWAVE,6),
                        new MoveLearnSetEntry(Move.WATER_GUN,9),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,12),
                        new MoveLearnSetEntry(Move.FAKE_OUT,16),
                        new MoveLearnSetEntry(Move.PSYBEAM,20),
                        new MoveLearnSetEntry(Move.WATER_PULSE,24),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,28),
                        new MoveLearnSetEntry(Move.PSYSHOCK,32),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,36),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,40),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,44),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.ACHILLES_HEEL,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.PERMAFROST,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.ACID,"tutor"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tutor"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tutor"),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tutor"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tutor"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tutor"),
                        new MoveLearnSetEntry(Move.MIMIC,"tutor"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.TRICK,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tutor"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor")
                        ),
                List.of(Label.GEN3,Label.INSURGENCE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(18)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL, Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Lombre");
        setBaseScale(0.75);
        setHitbox(1,1);
        getSpeciesFileData().addBasicVariation("Disaster Lesbian");
        getPosingFileData().setPortraitData(2.26f, new Vector3(0.01, -0.22, 0));
        getPosingFileData().setProfileData(.85f, new Vector3(0.01, 0.52, 0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().markAsBackupPose()
        ));
    }
}
