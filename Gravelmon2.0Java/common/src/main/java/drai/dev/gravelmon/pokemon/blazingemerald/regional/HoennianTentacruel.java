package drai.dev.gravelmon.pokemon.blazingemerald.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;
import drai.dev.gravelmon.util.*;

import java.util.*;

public class HoennianTentacruel extends Pokemon {
    public HoennianTentacruel(int dexNo) {
        super(dexNo,"HoennianTentacruel",
                Type.WATER, Type.ELECTRIC,
                new Stats(80, 110, 83, 65, 75, 102),
                List.of(Ability.LEVISH_SKIN), Ability.RAIN_DISH,
                UnitConverter.feetToMeters(3, 7), UnitConverter.lbsToKg(904),
                new Stats(0,1,0,0,0,1), 90,
                0.5,
                161, ExperienceGroup.SLOW,
                70,
                51, List.of(EggGroup.WATER_3),
                List.of("Despite being smaller than Tentacruel in other regions, this variant is far more aggressive, It can administer deadly jolts of electricity when aggravated."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.SPARK,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,6),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,12),
                        new MoveLearnSetEntry(Move.ACID,19),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,25),
                        new MoveLearnSetEntry(Move.THUNDERCLAP,30),
                        new MoveLearnSetEntry(Move.LIQUIDATION,38),
                        new MoveLearnSetEntry(Move.OVERCHARGE,47),
                        new MoveLearnSetEntry(Move.POISON_JAB,55),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,"egg"),
                        new MoveLearnSetEntry(Move.MOONRAZER,"egg")
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN1),
                0, List.of(),
                SpawnContext.SUBMERGED, SpawnPool.COMMON, 30, 52, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.MAXY, "48")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD, Biome.IS_FREEZING))),
                List.of(SpawnPreset.UNDERWATER),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Tentacruel");
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);
        this.setAvoidsLand(true);
    }
}
