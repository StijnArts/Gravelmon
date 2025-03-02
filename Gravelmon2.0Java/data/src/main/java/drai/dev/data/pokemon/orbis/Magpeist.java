package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Magpeist extends drai.dev.data.pokemon.Pokemon {
    public Magpeist() {
        super("Magpeist",
                Type.DARK, Type.FLYING,
                new Stats(60,
                        100,
                        60,
                        75,
                        50,
                        110),
                List.of(Ability.GOOD_AS_GOLD), Ability.GOOD_AS_GOLD,
                14, 690,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Magpeist who outrank the rest of its flock don the rarest of jewels and valuables."),
                List.of(),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Magpeist");

    }


}
