package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Covkoon extends drai.dev.data.pokemon.Pokemon {
    public Covkoon() {
        super("Maskoon",
                Type.BUG,
                new Stats(52,
                        42,
                        72,
                        62,
                        42,
                        32),
                List.of(Ability.SHED_SKIN), Ability.SHED_SKIN,
                6, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It wraps itself into its own silk preparing for a metamorphosis. The silk's properties causes it to be in a semi-asleep state."),
                List.of(new EvolutionEntry("mesmoth", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Maskoon");

    }


}
