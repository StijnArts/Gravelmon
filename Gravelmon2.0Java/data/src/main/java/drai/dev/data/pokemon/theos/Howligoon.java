package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Howligoon extends drai.dev.data.pokemon.Pokemon {
    public Howligoon() {
        super("Howligoon",
                Type.FIGHTING,
                new Stats(40,
                        55,
                        40,
                        70,
                        40,
                        55),
                List.of(Ability.SOUNDPROOF,Ability.RIVALRY), Ability.COMPETITIVE,
                10, 215,
                new Stats(0,0,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Howligoon constantly fight for leadership, with the loudest howler being the Alpha of the tribe. When they're in a bad mood they will bang on their chest and go on a rampage."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Howligoon");

    }


}
