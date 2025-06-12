package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bansenbu extends drai.dev.data.pokemon.Pokemon {
    public Bansenbu(Stats stats) {
        super("Bansenbu",
                Type.DARK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Bansebu hold a stick of Bamboo, which they munch on constantly. If someone attempts to steal it, Bansebu goes into a blind rage which does not end until it is holding Bamboo again."),
                List.of(),
                List.of(),
                List.of(Label.CYARE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BAMBOO)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Bansenbu");

    }


}
