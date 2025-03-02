package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wicky extends drai.dev.data.pokemon.Pokemon {
    public Wicky() {
        super("Wicky",
                Type.NORMAL,
                new Stats(21,
                        18,
                        32,
                        46,
                        21,
                        37),
                List.of(Ability.PRANKSTER,Ability.MAGICIAN), Ability.FLARE_BOOST,
                3, 37,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                35, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Able to teleport at will, tending to appear to people on their birthday. If you light the tip of its head, Wicky explode like a firecracker and teleport you to a random place in the world."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CELEBRATE,1),
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,1)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Wicky");

    }


}
