package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Betterfree extends drai.dev.data.pokemon.Pokemon {
    public Betterfree() {
        super("Betterfree",
                Type.BUG, Type.PSYCHIC,
                new Stats(72,
                        55,
                        65,
                        120,
                        91,
                        81),
                List.of(Ability.COMPOUND_EYES), Ability.TINTED_LENS,
                15, 350,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                178, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Betterfree");

    }


}
