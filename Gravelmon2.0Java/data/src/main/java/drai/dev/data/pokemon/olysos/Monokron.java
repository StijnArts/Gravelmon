package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Monokron extends drai.dev.data.pokemon.Pokemon {
    public Monokron() {
        super("Monokron",
                Type.STEEL, Type.PSYCHIC,
                new Stats(85,
                        200,
                        120,
                        115,
                        100,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                93, 10160,
                new Stats(0,2,1,0,0,0), 3,
                1.0,
                340, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It's energy source streams from it's back. The environment around itself disorts into very simplified geometric shapes. The colours evaporate and everything becomes one."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Monokron");

    }


}
