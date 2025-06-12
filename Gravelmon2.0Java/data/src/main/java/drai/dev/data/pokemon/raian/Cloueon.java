package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cloueon extends drai.dev.data.pokemon.Pokemon {
    public Cloueon(Stats stats) {
        super("Cloueon",
                Type.FLYING,
                stats,
                List.of(), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
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
    .eeveelution()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Cloueon");
            addAdditionalEvolution("eevee", new EvolutionEntry("cloueon", EvolutionType.ITEM_INTERACT, false, List.of(),
                    List.of(),List.of(),"cobblemon:shiny_stone"));
    }


}
