package drai.dev.data.pokemon.okeno;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ferrosaur extends drai.dev.data.pokemon.Pokemon {
    public Ferrosaur() {
        super("TEYOU",
                Type.DRAGON,Type.STEEL,
                new Stats(55,
                        116,
                        95,
                        66,
                        66,
                        90),
                List.of(Ability.IRON_BARBS,Ability.TOUGH_CLAWS), Ability.SAND_RUSH,
                16, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("TEYOU");

    }


}
