package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crowfer extends drai.dev.data.pokemon.Pokemon {
    public Crowfer() {
        super("Crowfer",
                Type.DARK,Type.ICE,
                new Stats(32,
                        54,
                        47,
                        50,
                        44,
                        58),
                List.of(Ability.PICKPOCKET,Ability.PICKUP), Ability.FRISK,
                5, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                57, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Crowfer will relentlessly pursue anything shiny, even resorting to breaking and entering houses. Often seen in groups led by a single Nemerder."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Crowfer");

    }


}
