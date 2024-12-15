package drai.dev.data.pokemon.insurgence.delta;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DeltaRalts extends Pokemon {
    public DeltaRalts(String name, Aspect aspect) {
        super(name, aspect,"DeltaRalts",
                Type.ELECTRIC, Type.ICE,
                new Stats(28, 25, 25, 45, 35, 40),
                List.of(Ability.LIGHTNING_ROD, Ability.CLEAR_BODY), Ability.SNOW_CLOAK,
                4, 66,
                new Stats(0,0,0,1,0,0), 235,
                0.5,
                40, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("A Delta Species discovered by EchoTheThird and Zero_Breaker. It uses its own ice and electricity to help make its trainer's life easier."),
                List.of(new EvolutionEntry("deltakirlia", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,6),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,10),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,12),
                        new MoveLearnSetEntry(Move.NUZZLE,17),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,21),
                        new MoveLearnSetEntry(Move.ICE_SHARD,23),
                        new MoveLearnSetEntry(Move.CALM_MIND,28),
                        new MoveLearnSetEntry(Move.ICE_BEAM,32),
                        new MoveLearnSetEntry(Move.IMPRISON,34),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,39),
                        new MoveLearnSetEntry(Move.CHARM,43),
                        new MoveLearnSetEntry(Move.BLIZZARD,45),
                        new MoveLearnSetEntry(Move.THUNDER,50),
                        new MoveLearnSetEntry(Move.SHEER_COLD,54),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.LIVEWIRE,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.ACHILLES_HEEL,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.PERMAFROST,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ACID,"tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tutor"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tutor"),
                        new MoveLearnSetEntry(Move.MIMIC,"tutor"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.TRICK,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor")
                        ),
                List.of(Label.GEN3,Label.INSURGENCE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 18.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.IS_THUNDERING, "true"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Ralts");
        
        this.setBaseScale(1);
        this.setHitbox(0.5,0.9);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setPortraitData( 2.7f, new Vector3(0.1, -1.8, 0));
        getPosingFileData().setProfileData( .9f, new Vector3(0, 0.4, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().clearPoseTypes().withLook(),
                AnimationData.walkingAnimation().withLook(),
                AnimationData.sleepingAnimation()
        ));
        getPosingFileData().setFaint("bedrock("+this.getCleanName()+", faint)");
    }
}
