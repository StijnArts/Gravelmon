package drai.dev.gravelmon.pokemon.xenoverse;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class ShulongXenoversal extends Pokemon {
    public ShulongXenoversal(int dexNo) {
        super(dexNo,"ShulongXenoversal",
                Type.WATER, Type.DRAGON,
                new Stats(118, 55, 110, 85, 110, 72),
                List.of(Ability.SWIFT_SWIM), Ability.DRAGON_ARMOR,
                22, 880,
                new Stats(0,0,0,0,0,2), 45,
                -1,
                64, ExperienceGroup.SLOW,
                70,
                41, List.of(EggGroup.UNDISCOVERED),
                List.of("Blue Energy has made it vicious and territorial. No one is able to take on it underwater."),
                List.of(new EvolutionEntry("shulong", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of()),
                        new EvolutionEntry("shulongterrestrial", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "\"gravelmon:terrestrial_ring\""))),
                        new EvolutionEntry("shulongastral", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "\"gravelmon:terrestrial_ring\""),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50"))),
                        new EvolutionEntry("shulongastral", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "\"gravelmon:xenoversal_ring\""),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50")))),
                List.of(
                        new MoveLearnSetEntry(Move.TIDAL_DRAGOON,1),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,1),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,1),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TWISTER,8),
                        new MoveLearnSetEntry(Move.HARDEN,13),
                        new MoveLearnSetEntry(Move.BIDE,17),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,21),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,25),
                        new MoveLearnSetEntry(Move.PROTECT,28),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,32),
                        new MoveLearnSetEntry(Move.TIDAL_DRAGOON,36),
                        new MoveLearnSetEntry(Move.DRAGON_ENDURANCE,38),
                        new MoveLearnSetEntry(Move.RECOVER,40),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,45),
                        new MoveLearnSetEntry(Move.VELVET_SCALES,48),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,51),
                        new MoveLearnSetEntry(Move.ACID_RAIN,54),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,56),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,61),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ACID_RAIN,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_ENDURANCE,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,"tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_CANNON,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.STAR_BURST,"tutor"),
                        new MoveLearnSetEntry(Move.VELVET_SCALES,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 3, 22, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.9, 1,
                List.of());
        this.setLangFileName("Shulong");
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);
    }
}
