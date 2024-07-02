package drai.dev.gravelmon.pokemon.blazingemerald.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;
import drai.dev.gravelmon.util.*;

public class HoennianTangela extends Pokemon {
    public HoennianTangela(String name, Aspect aspect) {
        super(name, aspect,"HoennianTangela",
                Type.FIGHTING,
                new Stats(65, 115, 85, 50, 45, 45),
                List.of(Ability.BARBED_NEST), Ability.BARBED_NEST,
                UnitConverter.feetToMeters(3, 7), UnitConverter.lbsToKg(681),
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                87, ExperienceGroup.MEDIUM_FAST,
                70,
                51,  List.of(EggGroup.GRASS),
                List.of("It's body is covered in pointy, dead vines that it collects at a young age. If anyone attempts to peer into it's nest to view it's real body, it becomes highly aggressive."),
                List.of(new EvolutionEntry("hoenniantangrowth", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\"needlearm\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.UTURN,"egg"),
                        new MoveLearnSetEntry(Move.SNATCH,"egg"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.HEAVY_PUNCH,4),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,10),
                        new MoveLearnSetEntry(Move.REVENGE,13),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,19),
                        new MoveLearnSetEntry(Move.BULK_UP,22),
                        //TODO change the evolution requirement to be bramble bash instead of needle arm.
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,28),
                        new MoveLearnSetEntry(Move.BRAMBLE_BASH,34),
                        new MoveLearnSetEntry(Move.POISON_JAB,37),
                        new MoveLearnSetEntry(Move.FAKE_OUT,40),
                        new MoveLearnSetEntry(Move.SUBMISSION,47)
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN1),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 19, 44, 1.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD, Biome.IS_TEMPERATE))),
                List.of(SpawnPreset.VILLAGE),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Tangela");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
