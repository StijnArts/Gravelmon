package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lizquent extends drai.dev.data.pokemon.Pokemon {
    public Lizquent() {
        super("Lizquent",
                Type.DARK, Type.FIGHTING,
                new Stats(60,
                        120,
                        60,
                        30,
                        40,
                        115),
                List.of(Ability.DEFIANT), Ability.IRON_FIST,
                12, 544,
                new Stats(0,1,0,0,0,1), 45,
                0.5,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.HUMAN_LIKE),
                List.of("With its 'special' fist, it can punch at mach speeds and prefers one hit KOs. Despite the intimidating looks, it has a heart of gold."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lizquent");

    }


}
