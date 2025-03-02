package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Contamaggot extends drai.dev.data.pokemon.Pokemon {
    public Contamaggot() {
        super("Contamaggot",
                Type.POISON, Type.BUG,
                new Stats(50,
                        50,
                        45,
                        50,
                        45,
                        60),
                List.of(Ability.COMPOUND_EYES), Ability.CONTAMINATE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Contamaggot");

    }


}
