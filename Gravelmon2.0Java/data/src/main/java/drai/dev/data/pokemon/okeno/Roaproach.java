package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Roaproach extends drai.dev.data.pokemon.Pokemon {
    public Roaproach() {
        super("Roaproach",
                Type.BUG, Type.DARK,
                new Stats(55,
                        99,
                        55,
                        56,
                        80,
                        100),
                List.of(Ability.ADAPTABILITY,Ability.PICKUP,Ability.SWARMINGSURGE), Ability.SWARMINGSURGE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Roaproach");

    }


}
