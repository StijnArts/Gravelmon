package drai.dev.data.pokemon.novrai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cognisalis extends drai.dev.data.pokemon.Pokemon {
    public Cognisalis() {
        super("Cognisalis",
                Type.BUG,
                new Stats(45,
                        20,
                        50,
                        35,
                        70,
                        30),
                List.of(Ability.UNNERVE,Ability.TELEPATHY,Ability.SIMPLE), Ability.SIMPLE,
                2, 165,
                new Stats(0,0,0,0,2,0), 200,
                0.5,
                87, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Training a Cognisalis for too long without evolving it can cause memory loss. In some cases, one may even forget that it has an evolution at all."),
                List.of(new EvolutionEntry("memosquito", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.AMNESIA,1),
                        new MoveLearnSetEntry(Move.STORED_POWER,20)                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(10)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
           setLangFileName("Cognisalis");

    }


}
