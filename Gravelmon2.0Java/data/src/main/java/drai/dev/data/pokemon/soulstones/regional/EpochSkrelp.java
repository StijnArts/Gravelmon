package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochSkrelp extends drai.dev.data.pokemon.Pokemon {
    public EpochSkrelp(String name, Aspect aspect) {
        super(name, aspect, "EpochSkrelp",
                Type.GRASS,Type.WATER,
                new Stats(60,
                        50,
                        30,
                        70,
                        60,
                        60),
                List.of(Ability.OVERGROW,Ability.TORRENT), Ability.PROTEAN,
                5, 73,
                new Stats(0,0,0,0,1,0), 225,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.DRAGON),
                List.of("It is able to change its pigment colour to camouflage within beds of seaweed so that it is able to easily harvest and feed on algae on the sea floor."),
                List.of(new EvolutionEntry("epochdragalge", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.WATER_PULSE,17),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,4),
                        new MoveLearnSetEntry(Move.OCEANBLAST,33),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,54),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,40),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,29),
                        new MoveLearnSetEntry(Move.EDENFRUIT,36),
                        new MoveLearnSetEntry(Move.TIDALWAVE,47),
                        new MoveLearnSetEntry(Move.LEAF_STORM,51),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,11),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,14),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,7),
                        new MoveLearnSetEntry(Move.GROWTH,21),
                        new MoveLearnSetEntry(Move.BRINE,25),
                        new MoveLearnSetEntry(Move.SYNTHESIS,44),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CASCADE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.MUDSHACKLES,"tm"),
                        new MoveLearnSetEntry(Move.NAGASKIN,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.NATURESWRATH,"tm"),
                        new MoveLearnSetEntry(Move.OCEANWRATH,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SOAK,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,"egg"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"egg"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"egg"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.HYPERTORRENT,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OCEAN)
    .setSpawnPreset(SpawnPreset.FOLIAGE, SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Skrelp");

    }


}
