package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bawlmire extends drai.dev.data.pokemon.Pokemon {
    public Bawlmire() {
        super("Bawlmire",
                Type.GROUND, Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 23,
                new Stats(0,0,0,0,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MINERAL),
                List.of("The pitiful whimpers these 'Mons make while laying in the mud first led many to believe they were haunted piles of earth."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bawlmire");

    }


}
