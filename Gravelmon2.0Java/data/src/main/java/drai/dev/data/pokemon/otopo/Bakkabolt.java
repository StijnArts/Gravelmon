package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bakkabolt extends drai.dev.data.pokemon.Pokemon {
    public Bakkabolt(Stats stats) {
        super("Pteronize",
                Type.ELECTRIC, Type.DARK,
                stats,
                List.of(Ability.STATIC), Ability.STATIC,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("It glides freely over the sky during stormy days, blending in with the clouds. When enraged, it employs its piercing shriek to confuse attackers."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pteronize");

    }


}
