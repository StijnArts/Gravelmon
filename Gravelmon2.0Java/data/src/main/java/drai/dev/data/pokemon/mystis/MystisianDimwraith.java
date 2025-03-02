package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MystisianDimwraith extends drai.dev.data.pokemon.Pokemon {
    public MystisianDimwraith(String name, Aspect aspect) {
        super(name, aspect,"Dimwraith",
                Type.DARK,Type.GHOST,
                new Stats(60,
                        80,
                        60,
                        40,
                        10,
                        90),
                List.of(Ability.INTIMIDATE,Ability.UNNERVE), Ability.STAKEOUT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Dimwraith like to play pranks to scare people. According to researchers, there are theoretically unlimited ways to evolve Dimwraith, although only a few have been discovered."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Dimwraith");

    }


}
