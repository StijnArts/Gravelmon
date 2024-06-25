package drai.dev.gravelmon.pokemon.blazingemerald.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;
import drai.dev.gravelmon.util.*;

import java.util.*;

public class HoennianMaractus extends Pokemon {
    public HoennianMaractus(String originalMon, Aspect aspect) {
        super(originalMon, aspect,"HoennianMaractus",
                Type.GRASS, Type.FIRE,
                new Stats(62, 36, 106, 86, 106, 93),
                List.of(Ability.CHLOROPHYLL), Ability.FLASH_FIRE,
                UnitConverter.feetToMeters(2, 11), UnitConverter.lbsToKg(529),
                new Stats(0,0,1,0,1,0), 255,
                0.5,
                161, ExperienceGroup.MEDIUM_FAST,
                70,
                51,  List.of(EggGroup.GRASS),
                List.of("Maractus were forced out of the desert due to competition with rival Cacturne. It's ability to survive nonetheless is a testament to its hardiness."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.UPROAR,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.ABSORB,9),
                        new MoveLearnSetEntry(Move.EMBER,12),
                        new MoveLearnSetEntry(Move.TORMENT,17),
                        new MoveLearnSetEntry(Move.SMOG,20),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,25),
                        new MoveLearnSetEntry(Move.KINDLESEED,28),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,33),
                        new MoveLearnSetEntry(Move.SCARY_FACE,36),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,41)
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN5),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 21, 46, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD, Biome.IS_TEMPERATE))),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Maractus");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
