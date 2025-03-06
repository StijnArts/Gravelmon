package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Phosos extends drai.dev.data.pokemon.Pokemon {
    public Phosos() {
        super("Phosos",
                Type.LIGHT, Type.FLYING,
                new Stats(110,
                        80,
                        90,
                        120,
                        90,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                64, 2527,
                new Stats(1,0,0,1,1,0), 3,
                0.0,
                220, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Its wings are said to possess the colors of the rainbow, and it is revered for its ability to heal and soothe with its mystical fire. Legends tell of its appearance being an omen of hope during times of crisis, as it descends from the skies to aid those in need."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Phosos");

    }


}
