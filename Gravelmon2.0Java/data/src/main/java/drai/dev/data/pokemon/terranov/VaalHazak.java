package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VaalHazak extends drai.dev.data.pokemon.Pokemon {
    public VaalHazak() {
        super("VaalHazak",
                Type.GHOST, Type.POISON,
                new Stats(90,
                        90,
                        90,
                        130,
                        130,
                        70),
                List.of(Ability.PATHOGENIC), Ability.PATHOGENIC,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A grotesque Elder Dragon, that inhabits the deepest part of the Rotten Vale. It uses the fatal vapor of the vale in what appears to be a symbiotic relationship."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Vaal Hazak");

    }


}
