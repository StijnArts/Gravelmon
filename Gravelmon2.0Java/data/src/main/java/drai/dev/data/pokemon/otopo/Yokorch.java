package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Yokorch extends drai.dev.data.pokemon.Pokemon {
    public Yokorch() {
        super("Yokorch",
                Type.FIRE, Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FLARE_BOOST), Ability.FLARE_BOOST,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It is thought that the spirits of children who go missing at festivals led them to come to life when they were once just a simple paper lantern."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Yokorch");

    }


}
