package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vesghost extends drai.dev.data.pokemon.Pokemon {
    public Vesghost(Stats stats) {
        super("Vesghost",
                Type.GHOST,Type.WATER,
                stats,
                List.of(Ability.CURSED_BODY), null,
                18, 0,
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
	
        addAdditionalEvolution("Drauking", new EvolutionEntry("Vesghost", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"minecraft:decorated_pot_sherds"));
           setLangFileName("Vesghost");

    }


}
