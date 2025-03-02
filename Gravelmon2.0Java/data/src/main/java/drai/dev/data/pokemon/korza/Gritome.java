package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gritome extends drai.dev.data.pokemon.Pokemon {
    public Gritome() {
        super("Gritome",
                Type.GHOST,Type.DARK,
                new Stats(40,
                        32,
                        45,
                        40,
                        57,
                        21),
                List.of(Ability.PERISH_BODY), Ability.BAD_DREAMS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A book eater, Gritome leisurely feeds off of old, forgotten tomes. It hides using old book covers, to move around for more books to eat."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Gritome");

    }


}
