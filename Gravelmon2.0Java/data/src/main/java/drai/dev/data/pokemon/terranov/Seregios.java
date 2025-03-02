package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Seregios extends drai.dev.data.pokemon.Pokemon {
    public Seregios() {
        super("Seregios",
                Type.FLYING,
                new Stats(54,
                        121,
                        88,
                        72,
                        88,
                        127),
                List.of(Ability.MARVEL_SCALE), Ability.MARVEL_SCALE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is hyper-aggressive and known to invade and kick potential rivals out of their own territory. It can shoot out its scales at foes which are sharp enough to cut through armor and cause severe bleeding."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Seregios");

    }


}
