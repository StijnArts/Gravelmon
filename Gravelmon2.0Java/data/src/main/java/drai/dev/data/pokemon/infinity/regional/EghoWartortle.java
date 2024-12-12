package drai.dev.data.pokemon.infinity.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class EghoWartortle extends Pokemon {
    public EghoWartortle(String name, Aspect aspect) {
        super(name, aspect,"EghoWartortle",
                Type.WATER, Type.FLYING,
                new Stats(59, 63, 80, 65, 80, 58),
                List.of(Ability.SERENE_GRACE, Ability.OVERCOAT), Ability.OVERCOAT,
                10, 200,
                new Stats(0,0,1,0,2,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.MONSTER),
                List.of("Wartortle's body starts to develop even more cloud forms, allowing it to temporarily hover sometimes. It uses the cloud as a cloak during foggy days."),
                List.of(new EvolutionEntry("eghoblastoise", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.FOGGY_STRIKE,1),
                        new MoveLearnSetEntry(Move.NIMBUS_FIST,1),
                        new MoveLearnSetEntry(Move.HAIL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,4),
                        new MoveLearnSetEntry(Move.BUBBLE,7),
                        new MoveLearnSetEntry(Move.WITHDRAW,10),
                        new MoveLearnSetEntry(Move.HOLD_BACK,13),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.GUST,16),
                        new MoveLearnSetEntry(Move.TAILWIND,18),
                        new MoveLearnSetEntry(Move.MIST,20),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,22),
                        new MoveLearnSetEntry(Move.PROTECT,24),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,26),
                        new MoveLearnSetEntry(Move.ICY_WIND,29),
                        new MoveLearnSetEntry(Move.WATER_PULSE,30),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,32),
                        new MoveLearnSetEntry(Move.ICE_SHARD,37),
                        new MoveLearnSetEntry(Move.TYPHOON,37),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,43),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,48),
                        new MoveLearnSetEntry(Move.HURRICANE,52),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_FLOOD,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ROOST,"tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"egg"),
                        new MoveLearnSetEntry(Move.BRINE,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg"),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,"egg")
                        ),
                List.of(Label.GEN1,Label.INFINITY),
                2, List.of(
                        new ItemDrop("minecraft:feather",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 29, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN, Biome.IS_HIGHLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_FREEZING))),
                List.of(SpawnPreset.NATURAL),
                0.36, 0.3,
                List.of());
        this.setLangFileName("Wartortle");
        this.setPortraitXYZ(0,1.8,0);
        
        this.setBaseScale(1);
        this.setCanSwim(false);
        this.setCanFly(true);
        this.setHitbox(1.0,1.5);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setPortraitData( 2.3f, new Vector3(-0.35, 1.1, 0));
        getPosingFileData().setProfileData( .8f, new Vector3(-0.0, .7, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().clearPoseTypes().withBlink().withLook()
        ));
        getPosingFileData().setAnimationFileName("wartortle_egho");
    }
}
