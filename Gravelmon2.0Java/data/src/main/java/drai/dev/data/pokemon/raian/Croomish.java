package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Croomish extends drai.dev.data.pokemon.Pokemon {
    public Croomish(Stats stats) {
        super("Croomish",
                Type.GRASS,Type.PSYCHIC,
                stats,
                List.of(Ability.TELEPATHY,Ability.SYNCHRONIZE), null,
                14, 0,
                new Stats(0,0,0,0,0,0), 45,
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
    .setPool(SpawnPool.RARE)
    .setMinLevel(37)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MUSHROOM, Biome.IS_SPOOKY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        addAdditionalEvolution("gloom", new EvolutionEntry("Croomish", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"cobblemon:shiny_stone"));
           setLangFileName("Croomish");

    }


}
