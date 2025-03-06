package drai.dev.data.pokemon.panjaea;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Toxeon extends drai.dev.data.pokemon.Pokemon {
    public Toxeon() {
        super("Toxeon",
                Type.POISON,
                new Stats(95,
                        65,
                        130,
                        65,
                        110,
                        60),
                List.of(Ability.POISON_TOUCH), Ability.CORROSION,
                10, 239,
                new Stats(0,0,2,0,0,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PANJAEA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Toxeon");

    }


}
