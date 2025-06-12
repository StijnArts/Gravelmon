package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gobblelisk extends drai.dev.data.pokemon.Pokemon {
    public Gobblelisk() {
        super("Gobblelisk",
                Type.BUG,
                new Stats(44,
                        60,
                        52,
                        67,
                        62,
                        35),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 131,
                new Stats(0,0,0,1,0,0), 75,
                0.5,
                64, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("drasalys", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Gobblelisk");

    }


}
