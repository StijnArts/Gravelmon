package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Delfine extends drai.dev.data.pokemon.Pokemon {
    public Delfine(Stats stats) {
        super("Delfine",
                Type.WATER, Type.PSYCHIC,
                stats,
                List.of(Ability.SWIFT_SWIM), Ability.HYDRATION,
                18, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.25,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
        addAdditionalEvolution("luvdisc", new EvolutionEntry("delfine", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"220"))));
           setLangFileName("Delfine");

    }


}
