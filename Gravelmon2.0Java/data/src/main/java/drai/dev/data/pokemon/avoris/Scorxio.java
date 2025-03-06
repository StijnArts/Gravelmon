package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Scorxio extends drai.dev.data.pokemon.Pokemon {
    public Scorxio() {
        super("Scorxio",
                Type.FIRE,
                new Stats(40,
                        60,
                        40,
                        65,
                        50,
                        60),
                List.of(Ability.BLAZE), Ability.POISON_TOUCH,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Scorxio are tricksters that love to scare their trainers. The smoke and flames released from their ears and tail can be toxic if it feels threatened."),
                List.of(),
                List.of(),
                List.of(Label.AVORIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Scorxio");

    }


}
