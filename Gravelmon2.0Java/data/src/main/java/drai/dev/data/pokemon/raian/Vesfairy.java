package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vesfairy extends drai.dev.data.pokemon.Pokemon {
    public Vesfairy(Stats stats) {
        super("Vesfairy",
                Type.FAIRY,Type.WATER,
                stats,
                List.of(Ability.CUTE_CHARM), null,
                22, 0,
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
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        addAdditionalEvolution("Carvtoise", new EvolutionEntry("Vesfairy", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"minecraft:decorated_pot_sherds"));
           setLangFileName("Vesfairy");

    }


}
