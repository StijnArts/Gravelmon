package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chameleos extends drai.dev.data.pokemon.Pokemon {
    public Chameleos(Stats stats) {
        super("Chameleos",
                Type.POISON, Type.DRAGON,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Precious few sightings of this elder dragon have been recorded, leading to claims it can vanish into its environment like a chameleon. Witnesses report that it can spew a fog-like breath, which seems to come out of nowhere."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Chameleos");

    }


}
