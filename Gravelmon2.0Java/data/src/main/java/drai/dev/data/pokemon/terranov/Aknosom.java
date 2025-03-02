package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Aknosom extends drai.dev.data.pokemon.Pokemon {
    public Aknosom(Stats stats) {
        super("Aknosom",
                Type.FIRE, Type.FLYING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tending to stand on one leg, this monster somewhat resembles an umbrella. The Aknosom is highly territorial; it will spread out its wings and show off its characteristic comb to scare off threats. It also bears flammable venom that burns fiercely and lingers on the ground when lit."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Aknosom");

    }


}
