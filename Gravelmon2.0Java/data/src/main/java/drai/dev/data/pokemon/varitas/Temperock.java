package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Temperock extends drai.dev.data.pokemon.Pokemon {
    public Temperock() {
        super("Temperock",
                Type.ROCK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.STURDY,Ability.SOLID_ROCK,Ability.WEAK_ARMOR), Ability.WEAK_ARMOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The core is even stronger than before and the outside has also hardened but become somewhat brittle. They harden themselves both physically and mentally by secluding themselves deep in cramped caves."),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Temperock");

    }


}
