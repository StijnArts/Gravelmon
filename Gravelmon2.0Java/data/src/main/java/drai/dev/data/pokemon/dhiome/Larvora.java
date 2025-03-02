package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Larvora extends drai.dev.data.pokemon.Pokemon {
    public Larvora() {
        super("Larvora",
                Type.BUG, Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FILTER), Ability.SNIPER,
                4, 36,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_1),
                List.of("Its whiskers double as tubes that allow it to breathe underwater. It prefers shallow ponds to deep lakes."),
                List.of(),
                List.of(),
                List.of(Label.DHIOME),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Larvora");

    }


}
