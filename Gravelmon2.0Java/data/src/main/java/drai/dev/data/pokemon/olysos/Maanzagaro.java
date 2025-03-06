package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Maanzagaro extends drai.dev.data.pokemon.Pokemon {
    public Maanzagaro() {
        super("Maanzagaro",
                Type.GRASS, Type.DARK,
                new Stats(80,
                        145,
                        70,
                        90,
                        50,
                        90),
                List.of(Ability.OVERGROW), Ability.WATER_ABSORB,
                20, 1445,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                236, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("Grizzlash have affection for their friends and fury for their enemies. One fierce punch can lead to major injuries and destruction."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Maanzagaro");

    }


}
