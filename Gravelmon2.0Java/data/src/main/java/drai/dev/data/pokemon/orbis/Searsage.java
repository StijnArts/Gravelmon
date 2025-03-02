package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Searsage extends drai.dev.data.pokemon.Pokemon {
    public Searsage() {
        super("Searsage",
                Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FLASH_FIRE,Ability.RUN_AWAY), Ability.PICKUP,
                5, 190,
                new Stats(0,1,0,0,0,0), 180,
                0.5,
                82, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Searsage");

    }


}
