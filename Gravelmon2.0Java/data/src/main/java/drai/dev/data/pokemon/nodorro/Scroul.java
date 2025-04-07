package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scroul extends drai.dev.data.pokemon.Pokemon {
    public Scroul() {
        super("Scroul",
                Type.GHOST,
                new Stats(30,
                        40,
                        35,
                        80,
                        45,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("magisbook", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night"))),
                        new EvolutionEntry("prudexwell", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME, Biome.IS_MOUNTAIN.getId() + ":" + Biome.IS_MOUNTAIN.getName())))),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.VERY_COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.MANSION, SpawnPreset.NEAR_BOOKSHELVES).build(),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Scroul");

    }


}
