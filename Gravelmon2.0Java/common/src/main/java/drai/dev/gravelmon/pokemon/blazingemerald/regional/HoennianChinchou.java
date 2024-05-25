package drai.dev.gravelmon.pokemon.blazingemerald.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;
import drai.dev.gravelmon.util.*;

import java.util.*;

public class HoennianChinchou extends Pokemon {
    public HoennianChinchou(int dexNo) {
        super(dexNo,"HoennianChinchou",
                Type.WATER, Type.GHOST,
                new Stats(55, 38, 38, 100, 66, 57),
                List.of(Ability.CLEAR_BODY), Ability.LIQUID_OOZE,
                UnitConverter.feetToMeters(2, 0), UnitConverter.lbsToKg(66),
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                66, ExperienceGroup.SLOW,
                70,
                51, List.of(EggGroup.WATER_2),
                List.of("It lives in depth beyond sunlight's reach, waiting patiently for prey to swim by. The lights on its antennae can cause intense hallucinations."),
                List.of(new EvolutionEntry("hoennianlanturn", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPOUT,"egg"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.VEILED_SKY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,5),
                        new MoveLearnSetEntry(Move.HYPNOSIS,13),
                        new MoveLearnSetEntry(Move.WATER_PULSE,17),
                        new MoveLearnSetEntry(Move.WILLOWISP,17),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,29),
                        new MoveLearnSetEntry(Move.ABYSSAL_LURE,37),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,41),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,46)
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN2),
                0, List.of(),
                SpawnContext.SUBMERGED, SpawnPool.COMMON, 9, 31, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.MAXY, "48")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Chinchou");
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);
        this.setAvoidsLand(true);
    }
}
