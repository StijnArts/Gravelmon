package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Buzzling extends drai.dev.data.pokemon.Pokemon {
    public Buzzling() {
        super("Buzzling",
                Type.BUG,
                new Stats(45,
                        45,
                        35,
                        20,
                        20,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                2, 10,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                56, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Often found in forests, Buzzling is often found on the top of leaves, nibbling through them. Whilst its cute, it can secrete a sticky fluid which slows its opponent down."),
                List.of(new EvolutionEntry("furrbee", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"day"))),
                        new EvolutionEntry("clonector", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.SCREECH,7),
                        new MoveLearnSetEntry(Move.BUG_BITE,12)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_TAIGA, Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Buzzling");

    }


}
