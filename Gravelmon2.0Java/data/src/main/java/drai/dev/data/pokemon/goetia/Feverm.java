package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Feverm extends drai.dev.data.pokemon.Pokemon {
    public Feverm(Stats stats) {
        super("Feverm",
                Type.POISON, Type.FIRE,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Coming into contact with its burning hairs causes inflammation and fever. Those rendered delirious with high temperature claim to have seen it floating above them as if taunting them."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Feverm");

    }


}
