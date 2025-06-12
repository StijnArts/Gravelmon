package drai.dev.data.pokemon.rica;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Cyton extends drai.dev.data.pokemon.Pokemon {
    public Cyton() {
        super("Cyton",
                Type.WATER,
                new Stats(45,
                        40,
                        70,
                        45,
                        45,
                        40),
                List.of(Ability.STICKY_HOLD,Ability.SHELL_ARMOR,Ability.HYDRATION), Ability.HYDRATION,
                3, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                57, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Cyton have tough shells that protect them from attacks. They live among rocks on the coast, where they can withstand powerful waves breaking."),
                List.of(new EvolutionEntry("kaidon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.BUBBLE,5),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,9),
                        new MoveLearnSetEntry(Move.MUD_SHOT,13),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,17),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,20),
                        new MoveLearnSetEntry(Move.RECOVER,24),
                        new MoveLearnSetEntry(Move.MUD_BOMB,27),
                        new MoveLearnSetEntry(Move.BRINE,30),
                        new MoveLearnSetEntry(Move.TICKLE,34),
                        new MoveLearnSetEntry(Move.AQUA_RING,38),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,43),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,47),
                        new MoveLearnSetEntry(Move.WRING_OUT,51),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,55),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,"tm"),
                        new MoveLearnSetEntry(Move.BELCH,"tm")                        ),
                List.of(Label.RICA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_COAST)
    .setAntiBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
