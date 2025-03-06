package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vermob extends drai.dev.data.pokemon.Pokemon {
    public Vermob() {
        super("Vermob",
                Type.DARK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.IMMUNITY), Ability.IMMUNITY,
                2, 30,
                new Stats(0,1,0,0,0,0), 235,
                0.75,
                51, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Vermob are a common sight in alleyways where they work together in groups to steal food to give to their leaders."),
                List.of(),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Vermob");

    }


}
