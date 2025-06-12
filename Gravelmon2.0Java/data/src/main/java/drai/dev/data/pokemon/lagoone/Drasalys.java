package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Drasalys extends drai.dev.data.pokemon.Pokemon {
    public Drasalys() {
        super("Drasalys",
                Type.BUG,Type.DRAGON,
                new Stats(50,
                        48,
                        90,
                        101,
                        94,
                        27),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 211,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                144, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("dralytra", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(24)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Drasalys");

    }


}
