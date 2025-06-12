package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochCorviknight extends drai.dev.data.pokemon.Pokemon {
    public EpochCorviknight(String name, Aspect aspect) {
        super(name, aspect, "EpochCorviknight",
                Type.DARK,Type.ELECTRIC,
                new Stats(75,
                        100,
                        86,
                        100,
                        39,
                        85),
                List.of(Ability.BIG_PECKS,Ability.CONDUCTOR), Ability.BLACKLIGHT,
                22, 750,
                new Stats(0,3,0,0,0,0), 90,
                0.5,
                248, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("In older times, a Corviknight was seen as a harbinger of thunderstorms and chaotic weather systems."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,26),
                        new MoveLearnSetEntry(Move.SHORTFUSE,7),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,35),
                        new MoveLearnSetEntry(Move.PURGE,20),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SWEEPINGTALON,32),
                        new MoveLearnSetEntry(Move.OBSTRUCT,44),
                        new MoveLearnSetEntry(Move.EXECUTION,51),
                        new MoveLearnSetEntry(Move.ELECTRIFY,1),
                        new MoveLearnSetEntry(Move.FALSE_SURRENDER,38),
                        new MoveLearnSetEntry(Move.BOLT_BEAK,55),
                        new MoveLearnSetEntry(Move.SPARK,14),
                        new MoveLearnSetEntry(Move.ENERGYSURGE,47),
                        new MoveLearnSetEntry(Move.TAUNT,23),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,41),
                        new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.NUZZLE,1),
                        new MoveLearnSetEntry(Move.TORMENT,1),
                        new MoveLearnSetEntry(Move.SPARKLE,9),
                        new MoveLearnSetEntry(Move.FAKE_OUT,4),
                        new MoveLearnSetEntry(Move.PROTONCRASH,29),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,17),
                        new MoveLearnSetEntry(Move.CHARGE,12),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.BOLT_BEAK,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DEAFEN,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.EXECUTION,"tm"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FLOCK,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FORTISSIMO,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.METEORDRIVE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PURGE,"tm"),
                        new MoveLearnSetEntry(Move.RAYOFLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.SWEEPINGWIND,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TORNADO,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TURBULENCE,"tm"),
                        new MoveLearnSetEntry(Move.VENDETTA,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(37)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_AUTUMN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Corviknight");

    }


}
