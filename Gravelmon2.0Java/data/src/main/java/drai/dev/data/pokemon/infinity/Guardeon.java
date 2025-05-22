package drai.dev.data.pokemon.infinity;

import com.cobblemon.mod.common.entity.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Guardeon extends Pokemon {
    public Guardeon() {
        super("Guardeon",
                Type.STEEL,
                new Stats(65, 60, 130, 110, 95, 65),
                List.of(Ability.BULLETPROOF), Ability.HEATPROOF,
                12, 585,
                new Stats(0,0,2,1,0,0), 45,
                0.5,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                35, List.of(EggGroup.FIELD),
                List.of("If Eevees in a pack evolve, the combination of Guardeon and Champeon can be volatile. Guardeon have an eternal rivalry with any Champeon they meet, even if related."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,1),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,6),
                        new MoveLearnSetEntry(Move.METAL_BURST,10),
                        new MoveLearnSetEntry(Move.CONFUSION,12),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,15),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,17),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,20),
                        new MoveLearnSetEntry(Move.PSYBEAM,24),
                        new MoveLearnSetEntry(Move.KINGS_SHIELD,26),
                        new MoveLearnSetEntry(Move.TAUNT,28),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,35),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,38),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,41),
                        new MoveLearnSetEntry(Move.UPROAR,45),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,52),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,55),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,63),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,70),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DETECT,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"egg"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"egg"),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg"),
                        new MoveLearnSetEntry(Move.WISH,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg")
                        ),
                List.of(Label.INFINITY),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 44, 56, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "day"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.27, 0.3,
                List.of());
        
        
        this.setBaseScale(0.8);
        this.setPreEvolution("eevee");
        addAdditionalEvolution("eevee", new EvolutionEntry("guardeon", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.IRON_DEFENSE, "")),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"cobblemon:metal_coat"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night"))));
        getSpeciesFileData().addBasicVariation("Drai");
        getPosingFileData().setPortraitData( 1.9f, new Vector3(-0.4, -0.3, 0));
        getPosingFileData().setProfileData( .9f, new Vector3(0, .35, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withBlink().addPoseType(PoseType.FLOAT).addPoseType(PoseType.HOVER).withLook(),
                AnimationData.walkingAnimation().withBlink().addPoseType(PoseType.SWIM).addPoseType(PoseType.FLY).withLook()
        ));
    }
}
