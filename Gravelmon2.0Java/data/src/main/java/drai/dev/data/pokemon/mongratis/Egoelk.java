package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Egoelk extends drai.dev.data.pokemon.Pokemon {
    public Egoelk() {
        super("Egoelk",
                Type.PSYCHIC, Type.NORMAL,
                new Stats(73,
                        85,
                        62,
                        130,
                        65,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                19, 0,
                new Stats(0,1,0,2,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Egoelk are eternally calm, rarely seen to react to external provocation unless absolutely necessary. It is said that, if befriended, it is possible to see the future by looking through the space between its horns."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"tm"),
                        new MoveLearnSetEntry(Move.THRASH,"tm"),
                        new MoveLearnSetEntry(Move.BITE,"tm"),
                        new MoveLearnSetEntry(Move.DISABLE,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"tm"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"tm"),
                        new MoveLearnSetEntry(Move.ME_FIRST,"tm")                        ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(30).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TUNDRA, Biome.IS_SNOWY_FOREST).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        addAdditionalEvolution("stantler", new EvolutionEntry("egoelk", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.CALM_MIND.getName()))));
           setLangFileName("Egoelk");

    }


}
