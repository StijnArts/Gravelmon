package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Topazeon extends drai.dev.data.pokemon.Pokemon {
    public Topazeon(Stats stats) {
        super("Opazeon",
                Type.ROCK,
                stats,
                List.of(Ability.GLOWING), null,
                15, 0,
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
    .eeveelution()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.AMETHYST_GEODE)
    .build(), List.of());
	
        addAdditionalEvolution("eevee", new EvolutionEntry("Topazeon", EvolutionType.ITEM_INTERACT, false, List.of(new MoveLearnSetEntry(Move.CURSE, "")),
                List.of(),List.of(),"cobblemon:shiny_stone"));
           setLangFileName("Topazeon");

    }


}
