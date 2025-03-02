package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Psyguana extends drai.dev.data.pokemon.Pokemon {
    public Psyguana() {
        super("Psyguana",
                Type.DRAGON, Type.PSYCHIC,
                new Stats(70,
                        120,
                        100,
                        70,
                        70,
                        90),
                List.of(Ability.RIVALRY), Ability.POISON_HEAL,
                18, 1200,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their horn is said to be the source of their psychic power. Be wary of Psyguana as know they're known to be very aggressive if they feel at all threatened."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Psyguana");

    }


}
