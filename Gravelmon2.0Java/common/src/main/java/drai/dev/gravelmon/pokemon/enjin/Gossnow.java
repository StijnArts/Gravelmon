package drai.dev.gravelmon.pokemon.enjin;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Gossnow extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gossnow() {
        super("Gossnow",
                Type.ICE, Type.DRAGON,
                new Stats(104,
                        76,
                        75,
                        71,
                        55,
                        59),
                List.of(Ability.SNOW_CLOAK,Ability.RATTLED), Ability.SNOWPLOW,
                12, 800,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                154, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Because this species of Pokémon prefers to live alone, it is quickly enraged when provoked. It is capable of breaking through thick ice and rocks with its pure strength."),
                List.of(new EvolutionEntry("frosstitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"52")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,8),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.MIST,15),
                        new MoveLearnSetEntry(Move.ICE_SHARD,18),
                        new MoveLearnSetEntry(Move.HEADBUTT,21),
                        new MoveLearnSetEntry(Move.ICE_BALL,24),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.WORK_UP,37),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,42),
                        new MoveLearnSetEntry(Move.MOUNTAIN_GALE,48),
                        new MoveLearnSetEntry(Move.THRASH,55),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.REVENGE,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 29, 45, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gossnow");

    }


}
