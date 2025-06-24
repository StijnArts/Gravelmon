package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tundrimp extends drai.dev.data.pokemon.Pokemon {
    public Tundrimp() {
        super("Tundrimp",
                Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("It has a smart but ferocious demeanour. It waits until the parents have left their nests before sneaking in and stealing their eggs."),
                List.of(new EvolutionEntry("gigice", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"))),
                        new EvolutionEntry("froskijo", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FREEZING).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Tundrimp");

    }


}
