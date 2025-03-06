package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Slitheroot extends drai.dev.data.pokemon.Pokemon {
    public Slitheroot() {
        super("Slitheroot",
                Type.GRASS, Type.POISON,
                new Stats(70,
                        40,
                        65,
                        40,
                        65,
                        40),
                List.of(Ability.FLOWER_VEIL,Ability.CHLOROPHYLL), Ability.SCAVENGE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Slitheroot");

    }


}
