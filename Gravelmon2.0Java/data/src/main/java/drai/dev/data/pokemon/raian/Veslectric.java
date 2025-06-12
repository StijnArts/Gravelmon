package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Veslectric extends drai.dev.data.pokemon.Pokemon {
    public Veslectric(Stats stats) {
        super("Veslectric",
                Type.ELECTRIC,Type.FIGHTING,
                stats,
                List.of(Ability.LIGHTNING_ROD), null,
                26, 0,
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
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        addAdditionalEvolution("Fafreeze", new EvolutionEntry("veselectric", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"minecraft:decorated_pot_sherds"));
           setLangFileName("Veslectric");

    }


}
