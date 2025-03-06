package drai.dev.data.pokemon.mastenia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MastenianBreloom extends drai.dev.data.pokemon.Pokemon {
    public MastenianBreloom(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "Breloom",
                Type.DRAGON,Type.GRASS,
                stats,
                List.of(Ability.EFFECT_SPORE,Ability.OUTBURST), Ability.TECHNICIAN,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Breloom");

    }


}
