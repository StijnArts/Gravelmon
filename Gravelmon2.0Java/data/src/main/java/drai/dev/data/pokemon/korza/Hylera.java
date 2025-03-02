package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hylera extends drai.dev.data.pokemon.Pokemon {
    public Hylera() {
        super("Hylera",
                Type.FAIRY,Type.STEEL,
                new Stats(88,
                        42,
                        64,
                        152,
                        161,
                        63),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                0, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A powerful creature from a different realm, where it is viewed as a Goddess. Hylera commands the elementals of its world, and has the power to warp time around itself."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hylera");

    }


}
