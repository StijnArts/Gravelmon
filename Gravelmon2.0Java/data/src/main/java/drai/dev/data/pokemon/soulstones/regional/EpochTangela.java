package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochTangela extends drai.dev.data.pokemon.Pokemon {
    public EpochTangela(String name, Aspect aspect) {
        super(name, aspect, "EpochTangela",
                Type.GROUND,Type.GRASS,
                new Stats(65,
                        75,
                        115,
                        90,
                        50,
                        40),
                List.of(Ability.SAND_RUSH,Ability.STORM_DRAIN), Ability.WATER_ABSORB,
                10, 100,
                new Stats(0,0,1,0,0,0), 100,
                0.5,
                87, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Despite its appearance, it is very lightweight. It is very susceptible to strong breezes and can be knocked around easily."),
                List.of(new EvolutionEntry("epochtangrowth", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.SANDSTORM,46),
                        new MoveLearnSetEntry(Move.SAND_TOMB,4),
                        new MoveLearnSetEntry(Move.THORNPRISON,14),
                        new MoveLearnSetEntry(Move.DIG,23),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,1),
                        new MoveLearnSetEntry(Move.ROTOTILLER,1),
                        new MoveLearnSetEntry(Move.BOUNCE,36),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.SANDJET,10),
                        new MoveLearnSetEntry(Move.ACROBATICS,30),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,43),
                        new MoveLearnSetEntry(Move.POWER_WHIP,49),
                        new MoveLearnSetEntry(Move.BULLDOZE,20),
                        new MoveLearnSetEntry(Move.BODY_SLAM,40),
                        new MoveLearnSetEntry(Move.VINE_WHIP,7),
                        new MoveLearnSetEntry(Move.SEED_BOMB,33),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,27),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,17),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,55),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CATAPULT,"tm"),
                        new MoveLearnSetEntry(Move.DUNEBLAST,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.GEOMANCY,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GOLDRUSH,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.MUDSHACKLES,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.NATURESWRATH,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.QUICKSAND,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"egg"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"egg"),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,"egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"egg"),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,"egg"),
                        new MoveLearnSetEntry(Move.SPIKES,"egg"),
                        new MoveLearnSetEntry(Move.MUDSHACKLES,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tangela");

    }


}
