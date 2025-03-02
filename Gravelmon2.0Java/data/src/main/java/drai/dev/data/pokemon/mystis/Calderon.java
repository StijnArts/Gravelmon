package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Calderon extends drai.dev.data.pokemon.Pokemon {
    public Calderon() {
        super("Calderon",
                Type.FIRE, Type.STEEL,
                new Stats(80,
                        60,
                        80,
                        60,
                        70,
                        40),
                List.of(Ability.FLAME_BODY,Ability.FLASH_FIRE), Ability.MAGIC_GUARD,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("People should be cautious when handling a Calderon! When tipped over, most of its contents will spill out and begin melting the ground."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Calderon");

    }


}
