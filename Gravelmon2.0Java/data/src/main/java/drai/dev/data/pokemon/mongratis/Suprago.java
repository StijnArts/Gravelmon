package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Suprago extends drai.dev.data.pokemon.Pokemon {
    public Suprago() {
        super("Suprago",
                Type.FIGHTING, Type.NORMAL,
                new Stats(73,
                        120,
                        110,
                        62,
                        65,
                        85),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 0,
                new Stats(0,2,1,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Suprago are often leaders of their communities. They have high moral values, and can often be found with a gaggle of smaller Pokémon in tow. Peaceful in nature, a Suprago will not attack unless it senses a threat to its charges."),
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
                        .setBiomes(Biome.IS_TUNDRA, Biome.IS_SNOWY_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        addAdditionalEvolution("stantler", new EvolutionEntry("suprago", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.SACRED_SWORD.getName()))));
           setLangFileName("Suprago");

    }


}
