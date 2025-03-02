package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Moccreek extends drai.dev.data.pokemon.Pokemon {
    public Moccreek() {
        super("Moccreek",
                Type.POISON,Type.WATER,
                new Stats(46,
                        112,
                        62,
                        48,
                        69,
                        148),
                List.of(Ability.WIMP_OUT,Ability.SWIFT_SWIM), Ability.CORROSION,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Much more dangerous after evolution, with fangs containing powerful venom. Despite this, Moccreek are still timid, preferring to bask on warm rocks by the shore."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Moccreek");

    }


}
