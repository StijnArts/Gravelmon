package drai.dev.data.pokemon.fabel;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lorderace extends drai.dev.data.pokemon.Pokemon {
    public Lorderace() {
        super("Lorderace",
                Type.FIRE,Type.DARK,
                new Stats(110,
                        119,
                        110,
                        35,
                        83,
                        70),
                List.of(Ability.ROYALORDER), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FABEL),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lorderace");

    }


}
