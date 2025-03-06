package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chippunch extends drai.dev.data.pokemon.Pokemon {
    public Chippunch() {
        super("Chippunch",
                Type.FIGHTING,
                new Stats(80,
                        110,
                        80,
                        55,
                        75,
                        95),
                List.of(Ability.CHEEK_POUCH), Ability.IRON_FIST,
                16, 150,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Chippunch always store berries in their cheeks to give them an energy boost during battle. Their tail is incredibly strong often acting as a third fist."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Chippunch");

    }


}
