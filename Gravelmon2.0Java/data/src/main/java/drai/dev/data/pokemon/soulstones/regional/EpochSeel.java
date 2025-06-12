package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochSeel extends drai.dev.data.pokemon.Pokemon {
    public EpochSeel(String name, Aspect aspect) {
        super(name, aspect, "EpochSeel",
                Type.WATER,Type.GROUND,
                new Stats(85,
                        40,
                        60,
                        25,
                        45,
                        75),
                List.of(Ability.UNAWARE,Ability.SOUNDPROOF), Ability.THICK_FAT,
                11, 1800,
                new Stats(1,0,0,0,0,0), 190,
                0.5,
                65, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("It lazes about on small islands when it tires of diving for food. It spends most of its day eating and sleeping."),
                List.of(new EvolutionEntry("epochdewgong", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_PULSE,13),
                        new MoveLearnSetEntry(Move.ENCORE,7),
                        new MoveLearnSetEntry(Move.CONTINENTALRIFT,58),
                        new MoveLearnSetEntry(Move.FLIP_TURN,23),
                        new MoveLearnSetEntry(Move.SLACK_OFF,34),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,4),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,37),
                        new MoveLearnSetEntry(Move.STUFF_CHEEKS,10),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SPIT_UP,41),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,54),
                        new MoveLearnSetEntry(Move.STOCKPILE,41),
                        new MoveLearnSetEntry(Move.MEGAHORN,51),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.YAWN,19),
                        new MoveLearnSetEntry(Move.SWALLOW,41),
                        new MoveLearnSetEntry(Move.BODY_PRESS,44),
                        new MoveLearnSetEntry(Move.MUDSHACKLES,16),
                        new MoveLearnSetEntry(Move.EARTH_POWER,47),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,26),
                        new MoveLearnSetEntry(Move.MUDSLIDE,30),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CATAPULT,"tm"),
                        new MoveLearnSetEntry(Move.DUNEBLAST,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.MUDSHACKLES,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,"tm"),
                        new MoveLearnSetEntry(Move.OCEANWRATH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.QUICKSAND,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SOAK,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WAIL,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"egg"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"egg"),
                        new MoveLearnSetEntry(Move.REST,"egg"),
                        new MoveLearnSetEntry(Move.SNORE,"egg"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"egg"),
                        new MoveLearnSetEntry(Move.SHORE_UP,"egg"),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,"egg"),
                        new MoveLearnSetEntry(Move.MUDBLAST,"egg"),
                        new MoveLearnSetEntry(Move.BOUNCE,"egg"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.QUAKESLAM,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_COAST)
    .setAntiBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Seel");

    }


}
