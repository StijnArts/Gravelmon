package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lavat extends drai.dev.data.pokemon.Pokemon {
    public Lavat() {
        super("Lavat",
                Type.FIRE,
                new Stats(40,
                        41,
                        47,
                        75,
                        47,
                        70),
                List.of(Ability.BLAZE), Ability.BOMBARDIER,
                0, 0,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lavat");

    }


}
