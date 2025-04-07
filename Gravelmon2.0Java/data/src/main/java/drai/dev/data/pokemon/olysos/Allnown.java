package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Allnown extends drai.dev.data.pokemon.Pokemon {
    public Allnown() {
        super("Allnown",
                Type.PSYCHIC,
                new Stats(90,
                        70,
                        70,
                        150,
                        100,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                33, 1600,
                new Stats(0,0,0,2,1,0), 15,
                0.5,
                1250, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It appeared as the maker of the Unown and stores all their knowledge that they learn outside like an encyclopedia. It uses these to communicate with humans."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .subLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DESERT).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.DESERT_PYRAMID).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Allnown");

    }


}
