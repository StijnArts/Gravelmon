package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dormprey extends drai.dev.data.pokemon.Pokemon {
    public Dormprey() {
        super("Dormprey",
                Type.WATER,Type.DRAGON,
                new Stats(125,
                        60,
                        105,
                        95,
                        85,
                        65),
                List.of(Ability.ADAPTABILITY,Ability.HYDRATION), Ability.DREAMER,
                20, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                241, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Dormprey are stuck in a perpetual cycle of slumber, only waking up for a few minutes each day to eat. Sadly, this makes it an easy target for poachers who covet its priceless body parts."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Dormprey");

    }


}
