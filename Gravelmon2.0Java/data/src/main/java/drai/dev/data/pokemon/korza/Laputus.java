package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Laputus extends drai.dev.data.pokemon.Pokemon {
    public Laputus() {
        super("Laputus",
                Type.FLYING,Type.GRASS,
                new Stats(123,
                        53,
                        56,
                        70,
                        136,
                        97),
                List.of(Ability.GRASS_PELT), Ability.OVERGROW,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Laputus");

    }


}
