package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanTinkaton extends drai.dev.data.pokemon.Pokemon {
    public LagoonanTinkaton(String name, Aspect aspect) {
        super(name, aspect, "LAGOONEnianTinkaton",
                Type.GRASS,Type.STEEL,
                new Stats(85,
                        75,
                        77,
                        70,
                        105,
                        94),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 1128,
                new Stats(0,0,0,0,3,0), 45,
                0.0,
                253, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("They share a symbiotic relationship with Dhelmise who takes over the seaweed in its body. In trade they are allowed to use its heavy anchor as a makeshift hammer."),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(38)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH, Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.SHIP_WRECK)
    .build(), List.of());
	
           setLangFileName("Tinkaton");

    }


}
