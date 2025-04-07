package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Moosid extends drai.dev.data.pokemon.Pokemon {
    public Moosid() {
        super("Moosid",
                Type.DARK, Type.NORMAL,
                new Stats(105,
                        73,
                        105,
                        62,
                        105,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                18, 0,
                new Stats(1,0,1,0,1,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Moosid are rarely involved in the affairs of other Pokémon, preferring to keep to themselves. Notoriously aggressive, a Moosid will pursue any perceived threat or prey relentlessly, until either they fall, or it does."),
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
                        .setBiomes(Biome.IS_TUNDRA, Biome.IS_SNOWY_FOREST).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        addAdditionalEvolution("stantler", new EvolutionEntry("moosid", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.CRUNCH.getName()))));
        setLangFileName("Moosid");
    }


}
