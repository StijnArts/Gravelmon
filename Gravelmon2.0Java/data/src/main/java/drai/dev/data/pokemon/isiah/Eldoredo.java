package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Eldoredo extends drai.dev.data.pokemon.Pokemon {
    public Eldoredo() {
        super("Eldoredo",
                Type.ROCK, Type.STEEL,
                new Stats(92,
                        83,
                        100,
                        82,
                        128,
                        45),
                List.of(Ability.JACKPOT), Ability.JACKPOT,
                8, 165,
                new Stats(0,0,0,0,0,0),50,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Eldoredo");

    }


}
