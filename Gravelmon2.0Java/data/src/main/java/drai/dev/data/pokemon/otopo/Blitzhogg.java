package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Blitzhogg extends drai.dev.data.pokemon.Pokemon {
    public Blitzhogg(Stats stats) {
        super("Blitzhogg",
                Type.ELECTRIC, Type.GROUND,
                stats,
                List.of(Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The top of its head has fur that works as a conductor. When it runs, this energy goes through its tusks, supercharging its speed. It is, however, difficult to halt once it has begun to run."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Blitzhogg");

    }


}
