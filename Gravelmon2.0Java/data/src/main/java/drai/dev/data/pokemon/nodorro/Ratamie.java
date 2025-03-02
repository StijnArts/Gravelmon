package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ratamie extends drai.dev.data.pokemon.Pokemon {
    public Ratamie() {
        super("Ratamie",
                Type.NORMAL,
                new Stats(100,
                        75,
                        65,
                        60,
                        55,
                        85),
                List.of(Ability.FRIEND_GUARD,Ability.HUGE_POWER), Ability.SIMPLE,
                7, 190,
                new Stats(0,1,0,0,0,1), 127,
                0.5,
                145, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Ratamies are never found in the wild Ratamie are known to be their trainers best friend."),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ratamie");

    }


}
