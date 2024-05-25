package drai.dev.gravelmon.pokemon.rica;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Detritan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Detritan() {
        super("Detritan",
                Type.ROCK, Type.GHOST,
                new Stats(45,
                        105,
                        90,
                        115,
                        90,
                        95),
                List.of(Ability.FILTER,Ability.DRY_SKIN,Ability.CURSED_BODY), Ability.CURSED_BODY,
                8, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                189, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.WATER_3),
                List.of("With Barnub infesting the skeletal remains of an unknown Pokemon, Detritan live a life of stillness, acting as a giant vessel for other Barnub. Its decayed body is as tough and powerful as it is massive."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MEMENTO,1),
                        new MoveLearnSetEntry(Move.BIDE,6),
                        new MoveLearnSetEntry(Move.CURSE,11),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,15),
                        new MoveLearnSetEntry(Move.TICKLE,19),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,23),
                        new MoveLearnSetEntry(Move.PURIFY,26),
                        new MoveLearnSetEntry(Move.PROTECT,30),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,34),
                        new MoveLearnSetEntry(Move.TOMBSTONER,38),
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,41),
                        new MoveLearnSetEntry(Move.REEFBARRIER,46),
                        new MoveLearnSetEntry(Move.WRING_OUT,50),
                        new MoveLearnSetEntry(Move.MEMENTO,55),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.POLTERGEIST,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,"tm")                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 33, 51, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
