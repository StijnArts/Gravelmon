package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bonafant extends drai.dev.data.pokemon.Pokemon {
    public Bonafant() {
        super("Bonafant",
                Type.NORMAL, Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.PICKUP,Ability.SUPER_LUCK), Ability.UNAWARE,
                10, 400,
                new Stats(1,2,0,0,0,0), 220,
                0.5,
                77, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.HUMAN_LIKE),
                List.of("The bell at the tip of its tail makes an eerie, primal sound that aids focus. Because of this, they are kept in places of peace and meditation."),
                List.of(),
                List.of(),
                List.of(Label.DHIOME),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bonafant");

    }


}
