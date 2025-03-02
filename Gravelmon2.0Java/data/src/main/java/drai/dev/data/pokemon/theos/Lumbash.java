package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lumbash extends drai.dev.data.pokemon.Pokemon {
    public Lumbash() {
        super("Lumbash",
                Type.FIGHTING,
                new Stats(80,
                        120,
                        90,
                        55,
                        75,
                        70),
                List.of(Ability.SAP_SIPPER), Ability.TECHNICIAN,
                17, 850,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their constant chewing has strenthened their teeth, allowing them to bite through large trees with ease. They carry around said trees to use as a weapon."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lumbash");

    }


}
