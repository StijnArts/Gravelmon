package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Newtint extends drai.dev.data.pokemon.Pokemon {
    public Newtint() {
        super("Newtint",
                Type.WATER, Type.POISON,
                new Stats(70,
                        60,
                        80,
                        100,
                        80,
                        90),
                List.of(Ability.WATER_ABSORB,Ability.PRANKSTER), Ability.CORROSION,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It sneaks through alleyways, marking its territory with a spray of poisonous paint from its mouth. The composition varies from individual to individual, and it often causes metal to rust."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,1),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,1),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Newtint");

    }


}
