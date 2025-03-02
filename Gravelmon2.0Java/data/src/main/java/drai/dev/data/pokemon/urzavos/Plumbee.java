package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Plumbee extends drai.dev.data.pokemon.Pokemon {
    public Plumbee() {
        super("Plumbee",
                Type.BUG, Type.GRASS,
                new Stats(0,0,0,0,0,0),
                List.of(Ability.DRY_SKIN), Ability.DRY_SKIN,
                2, 9,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("These soft-bodied 'Mons are a prized treat among its predators. They often stay hidden under logs and in bushes as harsh sunlight can hurt them."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Plumbee");

    }


}
