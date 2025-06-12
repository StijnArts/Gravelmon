package drai.dev.data.pokemon.ionos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IonosianGranbull extends drai.dev.data.pokemon.Pokemon {
    public IonosianGranbull(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "Granbull",
                Type.FAIRY, Type.DARK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.12,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(32)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
            addAdditionalEvolution("snubbull", new EvolutionEntry("granbull ionosian", EvolutionType.LEVEL_UP, List.of(),
                    List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_BADLANDS.getId() + ":" + Biome.IS_BADLANDS.getName()))));
           setLangFileName("Granbull");

    }


}
