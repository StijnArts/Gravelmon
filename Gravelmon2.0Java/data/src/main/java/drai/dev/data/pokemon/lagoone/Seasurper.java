package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Seasurper extends drai.dev.data.pokemon.Pokemon {
    public Seasurper() {
        super("Seasurper",
                Type.DARK,Type.POISON,
                new Stats(60,
                        99,
                        45,
                        65,
                        92,
                        89),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 270,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Due to its toxicity, it has no known natural predators other than Toxunken. It is so dangerous to the ecosystem that its evolution item is banned in several regions."),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_WARM_OCEAN).atNight()
                        .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.REEF).build(),
                List.of());
           setLangFileName("Seasurper");
        addAdditionalEvolution("goldeen", new EvolutionEntry("seasurper", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME, Biome.IS_WARM_OCEAN.getId() + ":" + Biome.IS_WARM_OCEAN.getName()))));
    }


}
