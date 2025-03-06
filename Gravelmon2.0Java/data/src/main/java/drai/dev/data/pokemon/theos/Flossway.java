package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flossway extends drai.dev.data.pokemon.Pokemon {
    public Flossway() {
        super("Flossway",
                Type.FAIRY,
                new Stats(65,
                        50,
                        60,
                        60,
                        55,
                        50),
                List.of(Ability.SWEET_VEIL), Ability.LINGERING_AROMA,
                4, 35,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Flossway are kind and gentle Pokémon. Whenever you smell a sweet scent in the air, it's likely that a Flossway is nearby."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Flossway");

    }


}
