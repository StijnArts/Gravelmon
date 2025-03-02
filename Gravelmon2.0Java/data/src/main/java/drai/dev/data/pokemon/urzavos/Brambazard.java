package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Brambazard extends drai.dev.data.pokemon.Pokemon {
    public Brambazard(Stats stats) {
        super("Brambazard",
                Type.GRASS, Type.DARK,
                stats,
                List.of(Ability.LIMBER), Ability.OVERGROW,
                18, 998,
                new Stats(0,0,0,0,0,0), 90,
                0.7,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.GRASS),
                List.of("This mon has full control of the thorny vines that hang from its head, and often uses them to both attack and intimidate enemies."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Brambazard");

    }


}
