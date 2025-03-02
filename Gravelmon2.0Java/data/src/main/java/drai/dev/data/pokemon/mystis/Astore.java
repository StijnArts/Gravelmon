package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Astore extends drai.dev.data.pokemon.Pokemon {
    public Astore() {
        super("Astore",
                Type.STEEL,
                new Stats(70,
                        50,
                        105,
                        105,
                        40,
                        20),
                List.of(Ability.LEVITATE), Ability.ANALYTIC,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Astrore and the other members of its evolutionary line were discovered in a crater. Researchers are unsure of the composition of its body."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Astore");

    }


}
