package drai.dev.data.pokemon.tokas.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TokassianMagby extends drai.dev.data.pokemon.Pokemon {
    public TokassianMagby(String name, Aspect aspect) {
        super(name, aspect, "Magby",
                Type.FIRE, Type.STEEL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FLAME_BODY), Ability.MAGMA_ARMOR,
                8, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("tokassianmagmar", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(),
                List.of(Label.TOKAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).belowY(0).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NEAR_LAVA).build(),
                List.of());
           setLangFileName("Magby");

    }


}
