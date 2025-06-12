package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Veswater extends drai.dev.data.pokemon.Pokemon {
    public Veswater(Stats stats) {
        super("Veswater",
                Type.WATER,Type.DRAGON,
                stats,
                List.of(Ability.MOLD_BREAKER), null,
                25, 0,
                new Stats(0,0,0,0,0,0), 20,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
        addAdditionalEvolution("Aegiking", new EvolutionEntry("Veswater", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"minecraft:decorated_pot_sherds"));
           setLangFileName("Veswater");

    }


}
