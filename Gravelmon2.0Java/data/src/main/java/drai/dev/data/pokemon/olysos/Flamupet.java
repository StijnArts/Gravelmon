package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flamupet extends drai.dev.data.pokemon.Pokemon {
    public Flamupet() {
        super("Flamupet",
                Type.BUG, Type.FIRE,
                new Stats(50,
                        20,
                        35,
                        20,
                        55,
                        30),
                List.of(Ability.SHED_SKIN), Ability.SHED_SKIN,
                4, 34,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                70, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("As they fear the bird-like Pokémon and are not capable of running away from the predators, they tend to hide inside tree trunks until they would evolve."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Flamupet");

    }


}
