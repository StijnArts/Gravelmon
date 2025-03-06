package drai.dev.data.pokemon.tokas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Toadrule extends drai.dev.data.pokemon.Pokemon {
    public Toadrule(Stats stats) {
        super("Toadrule",
                Type.GRASS, Type.POISON,
                stats,
                List.of(Ability.POISON_TOUCH), Ability.POISON_TOUCH,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Toadrules have been measured to have leapt 300 ft in the air, capable of defense in more ways than their weaker poison. Their four arms also operate independently from one another."),
                List.of(),
                List.of(),
                List.of(Label.TOKAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Toadrule");

    }


}
