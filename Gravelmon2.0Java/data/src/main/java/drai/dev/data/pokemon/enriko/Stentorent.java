package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Stentorent extends drai.dev.data.pokemon.Pokemon {
    public Stentorent() {
        super("Stentorent",
                Type.STEEL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.75,
                234, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.DITTO),
                List.of("(steel/grease) It eats all matter in its wake, every atom being used to create more Anexcell. Groups of them can consume entire cities."),
                List.of(),
                List.of(),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Stentorent");

    }


}
