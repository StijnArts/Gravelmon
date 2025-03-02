package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Phanther extends drai.dev.data.pokemon.Pokemon {
    public Phanther() {
        super("Phanther",
                Type.GRASS, Type.GHOST,
                new Stats(82,
                        110,
                        80,
                        92,
                        64,
                        102),
                List.of(Ability.OVERGROW), Ability.TOUGH_CLAWS,
                19, 118,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("All that is left of Phanther's mortal self is its pelt, which it carries with it. Despite its ruthless battle style, it is a loyal to its trainer and loves to sleep in moonbeams."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Phanther");

    }


}
