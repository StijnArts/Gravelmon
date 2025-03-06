package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Yuheffo extends drai.dev.data.pokemon.Pokemon {
    public Yuheffo() {
        super("Yuheffo",
                Type.STEEL, Type.ELECTRIC,
                new Stats(51,
                        51,
                        51,
                        51,
                        51,
                        51),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                0, 460,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Yuheffo");

    }


}
