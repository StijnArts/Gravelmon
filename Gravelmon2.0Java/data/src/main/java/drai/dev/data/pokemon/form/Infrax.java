package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Infrax extends drai.dev.data.pokemon.Pokemon {
    public Infrax() {
        super("Infrax",
                Type.FIRE,Type.NUCLEAR,
                new Stats(120,
                        175,
                        103,
                        63,
                        114,
                        103),
                List.of(Ability.BURNINGENTRANCE), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Infrax");

    }


}
