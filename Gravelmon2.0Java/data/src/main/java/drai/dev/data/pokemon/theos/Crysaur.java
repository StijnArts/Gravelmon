package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crysaur extends drai.dev.data.pokemon.Pokemon {
    public Crysaur() {
        super("Crysaur",
                Type.ROCK, Type.DRAGON,
                new Stats(65,
                        100,
                        80,
                        40,
                        80,
                        50),
                List.of(Ability.STURDY,Ability.ROUGH_SKIN), Ability.SHEER_FORCE,
                18, 860,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Crysaur love to consume precious stones. Tales tell of Crysaur often eating the entire treasure vaults of Kings back in ancient times."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Crysaur");

    }


}
