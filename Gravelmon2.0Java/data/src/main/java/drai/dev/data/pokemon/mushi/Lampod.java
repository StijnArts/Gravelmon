package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lampod extends drai.dev.data.pokemon.Pokemon {
    public Lampod() {
        super("Lampod",
                Type.BUG, Type.PSYCHIC,
                new Stats(63,
                        45,
                        55,
                        95,
                        100,
                        37),
                List.of(Ability.TINTED_LENS,Ability.OBLIVIOUS), Ability.PSYCHIC_SURGE,
                0, 0,
                new Stats(0,0,0,1,1,0), 80,
                0.5,
                123, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lampod");

    }


}
