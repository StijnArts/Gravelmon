package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Divernaut extends drai.dev.data.pokemon.Pokemon {
    public Divernaut() {
        super("Divernaut",
                Type.WATER,
                new Stats(90,
                        75,
                        85,
                        53,
                        70,
                        38),
                List.of(Ability.TORRENT), Ability.HYDRATION,
                0, 0,
                new Stats(2,0,0,0,0,0), 0,
                0.875,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Divernaut");

    }


}
