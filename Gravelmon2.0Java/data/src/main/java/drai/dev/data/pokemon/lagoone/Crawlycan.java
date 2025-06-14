package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crawlycan extends drai.dev.data.pokemon.Pokemon {
    public Crawlycan() {
        super("Crawlycan",
                Type.DARK,Type.BUG,
                new Stats(50,
                        65,
                        45,
                        42,
                        42,
                        58),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 150,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                60, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("webbewulf", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Crawlycan");

    }


}
