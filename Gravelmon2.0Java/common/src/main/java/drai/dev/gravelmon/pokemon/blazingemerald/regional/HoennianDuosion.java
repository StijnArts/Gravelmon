package drai.dev.gravelmon.pokemon.blazingemerald.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;
import drai.dev.gravelmon.util.*;

import java.util.*;

public class HoennianDuosion extends Pokemon {
    public HoennianDuosion(int dexNo) {
        super(dexNo,"HoennianDuosion",
                Type.PSYCHIC, Type.GRASS,
                new Stats(65, 30, 70, 125, 60, 30),
                List.of(Ability.FRUITRITION), Ability.FRUITRITION,
                UnitConverter.feetToMeters(1, 8), UnitConverter.lbsToKg(236),
                new Stats(0,0,0,2,0,0), 100,
                0.5,
                130, ExperienceGroup.MEDIUM_SLOW,
                70,
                51,  List.of(EggGroup.AMORPHOUS),
                List.of("It constantly devours berries by absorbing them through it's jelly-like membrane. Their brilliant gold color glows brightly after they finish a meal."),
                List.of(new EvolutionEntry("hoennianreuniclus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"160"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "\"day\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,1),
                        new MoveLearnSetEntry(Move.POISON_POWDER,1),
                        new MoveLearnSetEntry(Move.CONFUSION,7),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,13),
                        new MoveLearnSetEntry(Move.RIPEN,20),
                        new MoveLearnSetEntry(Move.SYNTHESIS,28),
                        new MoveLearnSetEntry(Move.PSYBEAM,32),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,38),
                        new MoveLearnSetEntry(Move.RECOVER,42),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,48),
                        new MoveLearnSetEntry(Move.GROWTH,"egg"),
                        new MoveLearnSetEntry(Move.PSYLIGHT,"egg"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"egg")
                ),
                List.of(Label.BLAZING_EMERALD, Label.GEN5),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.RARE, 5, 30, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "day")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD, Biome.IS_TEMPERATE))),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Duosion");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
