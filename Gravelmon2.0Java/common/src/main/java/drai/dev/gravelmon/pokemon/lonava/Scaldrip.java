package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Scaldrip extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scaldrip() {
        super("Scaldrip",
                Type.FIRE,Type.WATER,
                new Stats(54,
                        55,
                        42,
                        65,
                        36,
                        30),
                List.of(Ability.STEAMPOWER), Ability.WATER_ABSORB,
                3, 165,
                new Stats(0,0,0,1,0,0), 180,
                0.5,
                48, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.MINERAL),
                List.of("Scaldrip are feisty and unpredictable, often transforming the landscape of their habitat by blasting a combination of blistering water and jagged rocks at the walls of their caves. Spas will often employ Scaldrip to regulate the humidity of their steam rooms."),
                List.of(new EvolutionEntry("dousear", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"29")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,6),
                        new MoveLearnSetEntry(Move.SINGE,8),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,13),
                        new MoveLearnSetEntry(Move.STOMP,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,19),
                        new MoveLearnSetEntry(Move.FLAME_BURST,22),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,24),
                        new MoveLearnSetEntry(Move.MIST,28),
                        new MoveLearnSetEntry(Move.SCALD,31),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,35),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,39),
                        new MoveLearnSetEntry(Move.EARTH_POWER,42),
                        new MoveLearnSetEntry(Move.STEAM_ERUPTION,46),
                        new MoveLearnSetEntry(Move.BURN_UP,51),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,"tm"),
                        new MoveLearnSetEntry(Move.HARDEN,"tm"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm")                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DRIPSTONE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scaldrip");

    }


}
