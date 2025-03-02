package drai.dev.data.pokemon.okeno;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Searshore extends drai.dev.data.pokemon.Pokemon {
    public Searshore() {
        super("Searshore",
                Type.WATER,Type.FIRE,
                new Stats(50,
                        62,
                        190,
                        121,
                        60,
                        47),
                List.of(Ability.SHELL_ARMOR,Ability.FLAME_BODY), Ability.ANGER_SHELL,
                18, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Searshore");

    }


}
