package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochDonphan extends drai.dev.data.pokemon.Pokemon {
    public EpochDonphan(String name, Aspect aspect) {
        super(name, aspect, "EpochDonphan",
                Type.ICE,Type.GROUND,
                new Stats(90,
                        100,
                        120,
                        50,
                        40,
                        100),
                List.of(Ability.SNOW_CLOAK,Ability.OBLIVIOUS), Ability.THICK_FAT,
                11, 1200,
                new Stats(0,1,0,0,0,0), 123,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Their woolly coat is highly sought after in the fashion world, but this has driven them to the point of near extinction because of irresponsible poachers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,36),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,44),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ENDURE,10),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,40),
                        new MoveLearnSetEntry(Move.ICE_BALL,1),
                        new MoveLearnSetEntry(Move.TRAMPLE,4),
                        new MoveLearnSetEntry(Move.GLACIAL_LANCE,52),
                        new MoveLearnSetEntry(Move.AVALANCHE,28),
                        new MoveLearnSetEntry(Move.TREMOR,17),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,32),
                        new MoveLearnSetEntry(Move.BODY_PRESS,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,24),
                        new MoveLearnSetEntry(Move.HEADBUTT,14),
                        new MoveLearnSetEntry(Move.STAMPEDE,48),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,20),
                        new MoveLearnSetEntry(Move.STEAMROLLER,7),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.CATAPULT,"tm"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DUNEBLAST,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.EXECUTION,"tm"),
                        new MoveLearnSetEntry(Move.FABLEDRUSH,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FROSTBITE,"tm"),
                        new MoveLearnSetEntry(Move.GOLDRUSH,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPOTHERMIA,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.METEORDRIVE,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.MOONSTONERAY,"tm"),
                        new MoveLearnSetEntry(Move.MUDSHACKLES,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.QUICKSAND,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENDETTA,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(26)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .setAntiBiomes(Biome.IS_DECIDUOUS_FOREST, Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Donphan");

    }


}
