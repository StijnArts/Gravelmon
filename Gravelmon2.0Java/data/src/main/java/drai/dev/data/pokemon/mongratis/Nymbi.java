package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nymbi extends drai.dev.data.pokemon.Pokemon {
    public Nymbi() {
        super("Nymbi",
                Type.FIRE, Type.LIGHT,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 240,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                56, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Concept, Name, Type by Smiley Fakemon Front sprite TheGreatZeKro Icon by Plouton These designs/sprites are originally from the Fakemon Festival Pack. Evo line: Complete"),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Nymbi");

    }


}
