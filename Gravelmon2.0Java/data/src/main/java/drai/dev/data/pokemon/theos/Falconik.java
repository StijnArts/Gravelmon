package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Falconik extends drai.dev.data.pokemon.Pokemon {
    public Falconik() {
        super("Falconik",
                Type.FLYING, Type.ELECTRIC,
                new Stats(80,
                        100,
                        70,
                        75,
                        70,
                        105),
                List.of(Ability.LIGHTNING_ROD), Ability.NO_GUARD,
                13, 243,
                new Stats(0,1,0,0,0,2), 120,
                0.5,
                216, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Falconik love to fly through thunder storms where they can absorb electricity. In battle, they use their tail like a conductor to direct electric attacks."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Falconik");

    }


}
