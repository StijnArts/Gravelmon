package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Brassear extends drai.dev.data.pokemon.Pokemon {
    public Brassear() {
        super("Brassear",
                Type.FIRE, Type.STEEL,
                new Stats(100,
                        85,
                        125,
                        75,
                        85,
                        65),
                List.of(Ability.BLAZE), Ability.HEAVY_METAL,
                19, 8100,
                new Stats(0,0,3,0,0,0), 45,
                0.75,
                241, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Brassear's horns are extremely strong, capable of piercing massive boulders and lifting them with ease. When angry, their horns will light up and sizzle."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Brassear");

    }


}
