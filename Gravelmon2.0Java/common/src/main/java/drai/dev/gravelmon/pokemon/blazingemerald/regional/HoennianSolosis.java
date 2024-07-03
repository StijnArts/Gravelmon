package drai.dev.gravelmon.pokemon.blazingemerald.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;
import drai.dev.gravelmon.util.*;

import java.util.*;

public class HoennianSolosis extends Pokemon {
    public HoennianSolosis(String name, Aspect aspect) {
        super(name, aspect,"HoennianSolosis",
                Type.PSYCHIC, Type.GRASS,
                new Stats(45, 25, 50, 105, 50, 20),
                List.of(Ability.FRUITRITION), Ability.FRUITRITION,
                UnitConverter.feetToMeters(0, 4), UnitConverter.lbsToKg(13),
                new Stats(0,0,0,1,0,0), 200,
                0.5,
                58, ExperienceGroup.MEDIUM_SLOW,
                70,
                51,  List.of(EggGroup.AMORPHOUS),
                List.of("Solosis in Hoenn have adapted on a cellular level to resemble common berries. They avoid unwanted attention by hiding within fruit trees."),
                List.of(new EvolutionEntry("hoennianduosion", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
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
                        new MoveLearnSetEntry(Move.GROWTH,"egg"),
                        new MoveLearnSetEntry(Move.PSYLIGHT,"egg"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"egg")
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN5),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.RARE, 5, 30, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "day")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD, Biome.IS_TEMPERATE))),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Solosis");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
