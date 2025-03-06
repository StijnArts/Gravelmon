package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Warringbird extends drai.dev.data.pokemon.Pokemon {
    public Warringbird() {
        super("Warringbird",
                Type.STEEL,Type.FLYING,
                new Stats(30,
                        127,
                        42,
                        52,
                        36,
                        113),
                List.of(Ability.ANGER_POINT,Ability.PRESSURE), Ability.HUSTLE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Solitary by nature, but will form groups to push others out of their territory. These groups never last long, as the group ends up fighting each other for the territory."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Warringbird");

    }


}
