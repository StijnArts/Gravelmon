package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class KuluYaKu extends drai.dev.data.pokemon.Pokemon {
    public KuluYaKu() {
        super("KuluYaKu",
                Type.NORMAL, Type.ROCK,
                new Stats(55,
                        75,
                        65,
                        75,
                        78,
                        92),
                List.of(Ability.PICKUP), Ability.SIMPLE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Kulu Ya Ku");

    }


}
