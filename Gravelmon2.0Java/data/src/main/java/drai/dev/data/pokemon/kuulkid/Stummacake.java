package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stummacake extends drai.dev.data.pokemon.Pokemon {
    public Stummacake() {
        super("Stummacake",
                Type.FAIRY,Type.DRAGON,
                new Stats(110,
                        90,
                        105,
                        120,
                        100,
                        75),
                List.of(Ability.SUGARCRASH), Ability.SUGARCRASH,
                30, 30000,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("This Pokémon makes its home in the fabled chocolate river of the Kuulkid region. It consumes unhealthy amounts of candy each day, causing it to have constant stomach pains."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Stummacake");

    }


}
