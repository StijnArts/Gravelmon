package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squiruff extends drai.dev.data.pokemon.Pokemon {
    public Squiruff() {
        super("Squiruff",
                Type.NORMAL,
                new Stats(35,
                        52,
                        48,
                        30,
                        40,
                        45),
                List.of(Ability.PICKUP,Ability.RUN_AWAY), Ability.FLUFFY,
                5, 41,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Squiruff are entirely scatterbrained 'Mons-- Often picking up things and losing them within the same moment. Often, Squiruff fight among themselves."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Squiruff");

    }


}
