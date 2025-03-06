package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Larbor extends drai.dev.data.pokemon.Pokemon {
    public Larbor() {
        super("Larbor",
                Type.GRASS, Type.BUG,
                new Stats(90,
                        50,
                        75,
                        85,
                        85,
                        40),
                List.of(Ability.OVERGROW), Ability.TRIAGE,
                0, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Larbor");

    }


}
