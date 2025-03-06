package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kedon extends drai.dev.data.pokemon.Pokemon {
    public Kedon() {
        super("Kedon",
                Type.FIGHTING,Type.NORMAL,
                new Stats(82,
                        78,
                        74,
                        54,
                        50,
                        52),
                List.of(Ability.MAGIC_BOUNCE), Ability.FINALE,
                4, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                137, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Kedon smack their bellies to create loud beats, intense enough to shake the ground. They practice often in order to develop a perfect rhythm."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Kedon");

    }


}
