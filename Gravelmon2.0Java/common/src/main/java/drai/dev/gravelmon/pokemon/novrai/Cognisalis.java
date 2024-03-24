package drai.dev.gravelmon.pokemon.novrai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cognisalis extends drai.dev.gravelmon.pokemon.Pokemon {
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 10, 17, 1.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Cognisalis");

    }


}
