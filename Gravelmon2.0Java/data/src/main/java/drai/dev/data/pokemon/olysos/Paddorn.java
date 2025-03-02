package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Paddorn extends drai.dev.data.pokemon.Pokemon {
    public Paddorn() {
        super("Paddorn",
                Type.GRASS,
                new Stats(62,
                        90,
                        55,
                        75,
                        43,
                        80),
                List.of(Ability.OVERGROW), Ability.WATER_ABSORB,
                10, 225,
                new Stats(0,2,0,0,0,0), 45,
                0.87,
                141, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("It could easily get along without water for several weeks. The less it has drunk, the sharper and harder the thorns are on its body."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Paddorn");

    }


}
