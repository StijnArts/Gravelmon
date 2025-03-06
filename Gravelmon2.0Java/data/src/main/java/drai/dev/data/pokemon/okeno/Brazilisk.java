package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Brazilisk extends drai.dev.data.pokemon.Pokemon {
    public Brazilisk() {
        super("Brazilisk",
                Type.FIRE, Type.ROCK,
                new Stats(82,
                        123,
                        106,
                        110,
                        94,
                        85),
                List.of(Ability.ROUGH_SKIN,Ability.DRY_SKIN,Ability.DROUGHT), Ability.DROUGHT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("This Pokemon cannot be encountered in the wild because it has been led to extinction."),
                List.of(),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Brazilisk");

    }


}
