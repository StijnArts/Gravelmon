package drai.dev.data.pokemon.blazingemerald.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HoennianTangrowth extends Pokemon {
    public HoennianTangrowth(String name, Aspect aspect) {
        super(name, aspect,"HoennianTangrowth",
                Type.FIGHTING, Type.DARK,
                new Stats(100, 115, 105, 85, 50, 80),
                List.of(Ability.BARBED_NEST), Ability.BARBED_NEST,
                UnitConverter.feetToMeters(6, 11), UnitConverter.lbsToKg(2425),
                new Stats(0,1,1,0,0,0), 45,
                0.5,
                87, ExperienceGroup.MEDIUM_FAST,
                70,
                51,  List.of(EggGroup.GRASS),
                List.of("This Pokemon will resort to any means necessary to win in a fight. It stands upright on it's vines to appear larger and more menacing."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.HEAVY_PUNCH,4),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,10),
                        new MoveLearnSetEntry(Move.REVENGE,13),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,19),
                        new MoveLearnSetEntry(Move.BULK_UP,22),
                        new MoveLearnSetEntry(Move.BRAMBLE_BASH,28),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,32),
                        new MoveLearnSetEntry(Move.CHEAP_SHOT,37),
                        new MoveLearnSetEntry(Move.POISON_JAB,43),
                        new MoveLearnSetEntry(Move.FAKE_OUT,48),
                        new MoveLearnSetEntry(Move.SUBMISSION,54),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.VEILED_SKY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"egg"),
                        new MoveLearnSetEntry(Move.SNATCH,"egg")
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN4),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 34, 57, 0.18, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD, Biome.IS_TEMPERATE))),
                List.of(SpawnPreset.VILLAGE),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Tangrowth");

    }
}
