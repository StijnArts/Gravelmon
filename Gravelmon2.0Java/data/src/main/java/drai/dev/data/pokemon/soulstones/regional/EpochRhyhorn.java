package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochRhyhorn extends drai.dev.data.pokemon.Pokemon {
    public EpochRhyhorn(String name, Aspect aspect) {
        super(name, aspect, "EpochRhyhorn",
                Type.WATER,Type.DRAGON,
                new Stats(80,
                        65,
                        95,
                        25,
                        30,
                        50),
                List.of(Ability.INTIMIDATE,Ability.NOBILITY), Ability.SWIFT_SWIM,
                160, 2850,
                new Stats(0,0,1,0,0,0), 120,
                0.5,
                69, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("It is found deep in the ocean and emerges during thunderstorms. It is said to be a harbinger of destruction."),
                List.of(new EvolutionEntry("epochrhydon", EvolutionType.LEVEL_UP, List.of(), 
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.DRACOSHRED,42),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,45),
                        new MoveLearnSetEntry(Move.SUPERPOWER,57),
                        new MoveLearnSetEntry(Move.WYRMSRAGE,12),
                        new MoveLearnSetEntry(Move.OUTRAGE,60),
                        new MoveLearnSetEntry(Move.DRAGONFURY,1),
                        new MoveLearnSetEntry(Move.SURGING_STRIKES,51),
                        new MoveLearnSetEntry(Move.WATERPRESSURE,54),
                        new MoveLearnSetEntry(Move.POWERWASH,15),
                        new MoveLearnSetEntry(Move.SURGINGBLOW,27),
                        new MoveLearnSetEntry(Move.TRAMPLE,4),
                        new MoveLearnSetEntry(Move.RIPTIDE,39),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,21),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,24),
                        new MoveLearnSetEntry(Move.TORRENT,1),
                        new MoveLearnSetEntry(Move.OVERFLOW,8),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,33),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,36),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,18),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,48),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,30),
                        new MoveLearnSetEntry(Move.ANCIENTGLARE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.CASCADE,"tm"),
                        new MoveLearnSetEntry(Move.CATAPULT,"tm"),
                        new MoveLearnSetEntry(Move.CHIDORI,"tm"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.COSMICAVATAR,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.COUPDEGRACE,"tm"),
                        new MoveLearnSetEntry(Move.CRUELWHIP,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.DEADLYREACH,"tm"),
                        new MoveLearnSetEntry(Move.DEAFEN,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DRACARYS,"tm"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm"),
                        new MoveLearnSetEntry(Move.DRAGONBLOOD,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGONMAGIC,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.EXECUTION,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FANTASYSEAL,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FORTISSIMO,"tm"),
                        new MoveLearnSetEntry(Move.GAMMA_RAY,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.GEOMANCY,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.MAGNETICCANNON,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_MASH,"tm"),
                        new MoveLearnSetEntry(Move.MINERALWAVE,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.MOONSTONERAY,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.NAGASKIN,"tm"),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,"tm"),
                        new MoveLearnSetEntry(Move.OCEANWRATH,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOAK,"tm"),
                        new MoveLearnSetEntry(Move.STEAM_ERUPTION,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.SWEEPINGWIND,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENDETTA,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"egg"),
                        new MoveLearnSetEntry(Move.SUBMERGE,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_HAMMER,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.THRASH,"egg"),
                        new MoveLearnSetEntry(Move.BRUTEFORCE,"egg"),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,"egg"),
                        new MoveLearnSetEntry(Move.DRILL_RUN,"egg"),
                        new MoveLearnSetEntry(Move.TREMOR,"egg"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.CLAMP,"egg"),
                        new MoveLearnSetEntry(Move.DRACONICMIGHT,"egg")),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(23).setPool(SpawnPool.ULTRA_RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_DEEP_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanBreathUnderwater(true);
           setLangFileName("Rhyhorn");

    }


}
