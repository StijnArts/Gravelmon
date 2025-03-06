package drai.dev.data.pokemon.blazingemerald;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Slingray extends Pokemon {
    public Slingray() {
        super("Slingray",
                Type.WATER, Type.ROCK,
                new Stats(47, 121, 75, 82, 35, 134),
                List.of(Ability.ROCK_HEAD), Ability.SIEGE_DRIVE,
                UnitConverter.feetToMeters(6, 7), UnitConverter.lbsToKg(428),
                new Stats(0,1,0,0,0,2), 60,
                0.5,
                200, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("It fashions a slingshot-like apparatus to it's fins using kelp from the seafloor. Slingray hunt by leaping out of the ocean and flinging rocks at unsuspecting prey."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"egg"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"egg"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
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
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,7),
                        new MoveLearnSetEntry(Move.AQUA_JET,13),
                        new MoveLearnSetEntry(Move.ACCELEROCK,19),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,25),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,28),
                        new MoveLearnSetEntry(Move.ACCELEROCK,32),
                        new MoveLearnSetEntry(Move.STONE_SURGE,35),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,43),
                        new MoveLearnSetEntry(Move.RUBBLE_RUSH,46),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,50),
                        new MoveLearnSetEntry(Move.UTURN,53),
                        new MoveLearnSetEntry(Move.LOCKON,58),
                        new MoveLearnSetEntry(Move.REVENGE,62),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,67)
                        ),
                List.of(Label.BLAZING_EMERALD),
                0, List.of(),
                SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 34, 56, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());

        this.setPreEvolution("remoraid");
        addAdditionalEvolution("remoraid", new EvolutionEntry("slingray", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.ROCK_BLAST.getName()))));
    }
}
