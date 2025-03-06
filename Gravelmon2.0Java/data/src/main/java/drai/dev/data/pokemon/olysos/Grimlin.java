package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grimlin extends drai.dev.data.pokemon.Pokemon {
    public Grimlin() {
        super("Grimlin",
                Type.DARK,
                new Stats(45,
                        40,
                        35,
                        40,
                        35,
                        60),
                List.of(Ability.PICKPOCKET,Ability.MOODY), Ability.RIVALRY,
                5, 50,
                new Stats(0,0,0,0,0,1), 200,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Its oversized nose is a keen sensor, allowing it to sniff out potential prey or hidden treasures. Known for its aggressive nature, Grimlin is often spotted ambushing unsuspecting targets, stealing items, or playfully hurling rocks at travelers and reveling in their reactions."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Grimlin");

    }


}
