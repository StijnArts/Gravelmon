package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class ShogunCeanataur extends drai.dev.data.pokemon.Pokemon {
    public ShogunCeanataur() {
        super("ShogunCeanataur",
                Type.WATER, Type.STEEL,
                new Stats(75,
                        110,
                        100,
                        60,
                        65,
                        85),
                List.of(Ability.TOUGH_CLAWS), Ability.TOUGH_CLAWS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When threatened it is capable of unfolding its pincers into sharp sickle-like appendages. When Shogun Ceanataur's shell is damaged in combat, it will simple dig out another one, sometimes large creatures skulls too."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Shogun Ceanataur");

    }


}
