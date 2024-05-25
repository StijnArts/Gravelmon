package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Foreiphin extends Pokemon {
    public Foreiphin() {
        super( "Foreiphin",
                Type.ROCK, Type.WATER,
                new Stats(51	,47	,68,	77,	53,	59),
                List.of(Ability.SWIFT_SWIM), Ability.PRESSURE,
                11, 178,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                125, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL, EggGroup.WATER_1),
                List.of(""),
                List.of(new EvolutionEntry("Travelphin", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,21),
                        new MoveLearnSetEntry(Move.COUNTER,30),
                        new MoveLearnSetEntry(Move.JAW_LOCK,39),
                        new MoveLearnSetEntry(Move.LIQUIDATION,48),
                        new MoveLearnSetEntry(Move.BODY_SLAM,57),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,66),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CHILLING_WATER,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.ICE_SPINNER,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"egg"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.SUBMERGED, SpawnPool.RARE, 22, 34, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.4, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
    }
}
