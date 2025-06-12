package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bereolf extends drai.dev.data.pokemon.Pokemon {
    public Bereolf() {
        super("Bereolf",
                Type.BLOOD,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.LOSTCONTROL), null,
                6, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Werowulf", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night")))),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Bereolf");

    }


}
