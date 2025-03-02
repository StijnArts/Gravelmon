package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Wibble extends drai.dev.data.pokemon.Pokemon {
    public Wibble() {
        super("Wibble",
                Type.BUG,
                new Stats(62,
                        40,
                        40,
                        40,
                        40,
                        33),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Wibble are very adaptive Pokemon, although they prefer to avoid conflict whenever they can manage to. They have a very hard outer shell and their horn attack can hold quite a punch."),
                List.of(),
                List.of(),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Wibble");

    }


}
