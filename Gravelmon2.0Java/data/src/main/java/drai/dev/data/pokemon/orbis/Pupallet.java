package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pupallet extends drai.dev.data.pokemon.Pokemon {
    public Pupallet() {
        super("Pupallet",
                Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SHELL_ARMOR), Ability.SHELL_ARMOR,
                3, 40,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("- Harden Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pupallet");

    }


}
