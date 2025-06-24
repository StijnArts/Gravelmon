package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shrimpno extends drai.dev.data.pokemon.Pokemon {
    public Shrimpno() {
        super("Shrimpno",
                Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Shrimpno have a diet of only a strange colorful plant that grows on ocean floors. This plant is poisonous to most other Pokemon and humans. It's diet appears to have given Shrimpno colorful tail fins, which it uses to disorient predators."),
                List.of(new EvolutionEntry("shrimpadelic", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(11).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_WARM_OCEAN).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.REEF).build(),
                List.of());
        setAquatic();
           setLangFileName("Shrimpno");

    }


}
