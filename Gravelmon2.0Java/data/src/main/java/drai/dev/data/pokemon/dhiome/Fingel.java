package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fingel extends drai.dev.data.pokemon.Pokemon {
    public Fingel() {
        super("Fingel",
                Type.WATER, Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SNIPER), Ability.RATTLED,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("The leader of the trio is the most important. The other two will risk their lives to defend it."),
                List.of(),
                List.of(),
                List.of(Label.DHIOME),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Fingel");

    }


}
