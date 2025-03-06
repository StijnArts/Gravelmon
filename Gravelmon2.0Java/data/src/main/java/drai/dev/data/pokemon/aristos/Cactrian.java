package drai.dev.data.pokemon.aristos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cactrian extends drai.dev.data.pokemon.Pokemon {
    public Cactrian() {
        super("Cactrian",
                Type.GRASS,Type.GROUND,
                new Stats(70,
                        100,
                        70,
                        105,
                        75,
                        40),
                List.of(Ability.MAGMA_ARMOR,Ability.SOLID_ROCK), Ability.ANGER_POINT,
                19, 2200,
                new Stats(0,1,0,1,0,0), 150,
                0.5,
                161, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The cacti on their backs are filled with water reserves, making them very hardy and capable of going a long time without food or water. If angered, they flail their necks around in an attempt to hit anyone around them with their thorns."),
                List.of(),
                List.of(),
                List.of(Label.ARISTOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Cactrian");

    }


}
