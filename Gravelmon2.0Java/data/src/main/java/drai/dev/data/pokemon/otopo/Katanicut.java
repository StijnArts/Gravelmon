package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Katanicut extends drai.dev.data.pokemon.Pokemon {
    public Katanicut() {
        super("Katanicut",
                Type.WATER, Type.STEEL,
                new Stats(65,
                        95,
                        63,
                        77,
                        61,
                        89),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Its fins are so powerful that they can sever metal. Katanicut flies past opponents with its fins outstretched, delivering a deadly blow."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Katanicut");

    }


}
