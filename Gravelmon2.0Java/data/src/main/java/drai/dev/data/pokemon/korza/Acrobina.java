package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Acrobina extends drai.dev.data.pokemon.Pokemon {
    public Acrobina() {
        super("Acrobina",
                Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The graceful movement of Acrobina is always deliberate, poised, and powerful. They are extremely competitive in nature, and will never willingly quit a battle or otherwise, even if it's clearly outmatched."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Acrobina");

    }


}
