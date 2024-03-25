package drai.dev.gravelmon.pokemon.ionos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cordachin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cordachin() {
        super("Cordachin",
                Type.GROUND,
                new Stats(50,
                        90,
                        92,
                        93,
                        85,
                        25),
                List.of(Ability.WATER_ABSORB,Ability.ARENA_TRAP), Ability.SAND_SPIT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Once part of a great ocean, Cordachin has adapted to life above the sea and is able to live without water for a long period of time. This Pokémon's tail mimics the motion of seagrass as it burrows its face underneath the sand; working as a camouflage. A camouflage that serves a lesser purpose today due to climate change. Cordachin has a great fear of getting eaten by a certain species of Pokémon. This may be one of many reasons for its great migration to South Ionos, away from the biting cold."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.SAND_TOMB,5),
                        new MoveLearnSetEntry(Move.AQUA_RING,9),
                        new MoveLearnSetEntry(Move.MUD_SHOT,14),
                        new MoveLearnSetEntry(Move.SANDSTORM,19),
                        new MoveLearnSetEntry(Move.CURSE,23),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,28),
                        new MoveLearnSetEntry(Move.DIG,32),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,37),
                        new MoveLearnSetEntry(Move.COUNTER,43),
                        new MoveLearnSetEntry(Move.EARTH_POWER,48),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,52),
                        new MoveLearnSetEntry(Move.SHORE_UP,56),
                        new MoveLearnSetEntry(Move.ROTOTILLER,60),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.FISSURE,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm")                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cordachin");

    }


}
