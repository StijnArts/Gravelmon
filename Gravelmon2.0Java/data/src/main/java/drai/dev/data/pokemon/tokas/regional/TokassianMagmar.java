package drai.dev.data.pokemon.tokas.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TokassianMagmar extends drai.dev.data.pokemon.Pokemon {
    public TokassianMagmar(Stats stats, String name, Aspect aspect) {
        super(name, aspect, "Magmar",
                Type.FIRE, Type.STEEL,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TOKAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(30).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).belowY(0).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NEAR_LAVA).build(),
                List.of());
           setLangFileName("Magmar");

    }


}
