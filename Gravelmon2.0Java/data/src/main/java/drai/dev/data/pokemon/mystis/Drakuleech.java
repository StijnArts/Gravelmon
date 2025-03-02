package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Drakuleech extends drai.dev.data.pokemon.Pokemon {
    public Drakuleech() {
        super("Drakuleech",
                Type.DRAGON, Type.DARK,
                new Stats(60,
                        55,
                        75,
                        80,
                        55,
                        65),
                List.of(Ability.POWERLEECH,Ability.NOCTURNAL), Ability.UNDERLING,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                78, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It lives in dark caves, feasting on the lifeforce of unsuspecting passersby to grow stronger. Those it feasts on are reported to become very sick, looking almost lifeless."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Drakuleech");

    }


}
