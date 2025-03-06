package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Formidet extends drai.dev.data.pokemon.Pokemon {
    public Formidet() {
        super("Formidet",
                Type.FIRE, Type.BUG,
                new Stats(56,
                        65,
                        70,
                        90,
                        60,
                        70),
                List.of(Ability.BLAZE), Ability.FLASH_FIRE,
                0, 0,
                new Stats(0,0,0,2,0,0), 0,
                0.5,
                144, ExperienceGroup.MEDIUM_SLOW,
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
           setLangFileName("Formidet");

    }


}
