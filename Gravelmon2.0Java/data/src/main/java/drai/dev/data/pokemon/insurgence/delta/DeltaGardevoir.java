package drai.dev.data.pokemon.insurgence.delta;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DeltaGardevoir extends Pokemon {
    public DeltaGardevoir(String name, Aspect aspect) {
        super(name, aspect,"DeltaGardevoir",
                Type.ELECTRIC, Type.ICE,
                new Stats(68, 65, 65, 125, 115, 80),
                List.of(Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                16, 484,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                259, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("To protect its trainer, it can drop the temperature of itself and its surroundings to 0°K. It discharges sparks when nuzzling trainers to keep them from freezing."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.MOONBLAST,1),
                        new MoveLearnSetEntry(Move.THUNDER,1),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,1),
                        new MoveLearnSetEntry(Move.ICE_BEAM,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BLIZZARD,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,6),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,10),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,12),
                        new MoveLearnSetEntry(Move.NUZZLE,17),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,22),
                        new MoveLearnSetEntry(Move.ICE_SHARD,25),
                        new MoveLearnSetEntry(Move.CALM_MIND,33),
                        new MoveLearnSetEntry(Move.ICE_BEAM,40),
                        new MoveLearnSetEntry(Move.IMPRISON,45),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,53),
                        new MoveLearnSetEntry(Move.CHARM,60),
                        new MoveLearnSetEntry(Move.BLIZZARD,65),
                        new MoveLearnSetEntry(Move.THUNDER,73),
                        new MoveLearnSetEntry(Move.SHEER_COLD,80),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,85),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.LIVEWIRE,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
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
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tutor"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tutor"),
                        new MoveLearnSetEntry(Move.MIMIC,"tutor"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.TRICK,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor")
                        ),
                List.of(Label.GEN1,Label.INSURGENCE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .isThundering()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Gardevoir");
        
        this.setBaseScale(0.9);
        this.setHitbox(0.6,2.2);
        this.setNeedsRemodel("Updated model in cobblemon model repo");
        getSpeciesFileData().addBasicVariation("Maliant").addLayer(
                SimpleTextureLayerData.glowLayer(this)
        );
        getPosingFileData().setPortraitData( 2.6f, new Vector3(-0.2, 1.6, 0));
        getPosingFileData().setProfileData( .65f, new Vector3(0, 0.7, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().markAsBackupPose(),
                AnimationData.walkingAnimation().withLook(),
                AnimationData.sleepingAnimation()
        ));
        getPosingFileData().setFaint("bedrock("+this.getCleanName()+", faint)");
    }
}
