package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Blobish extends drai.dev.data.pokemon.Pokemon {
    public Blobish() {
        super("Blobish",
                Type.WATER, Type.GHOST,
                new Stats(130,
                        75,
                        70,
                        75,
                        110,
                        65),
                List.of(Ability.STICKY_HOLD,Ability.DRY_SKIN), Ability.REGENERATOR,
                0, 0,
                new Stats(2,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Not much is known about Blobish as they're not often seen in the wild. Their appearance often turns people away from catching them."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Blobish");

    }


}
