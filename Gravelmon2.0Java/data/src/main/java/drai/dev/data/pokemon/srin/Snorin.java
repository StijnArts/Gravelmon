package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snorin extends drai.dev.data.pokemon.Pokemon {
    public Snorin() {
        super("Snorin",
                Type.FAIRY,Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.COMATOSE,Ability.UNAWARE), Ability.WATER_BUBBLE,
                12, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.125,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Snorin is in a constant battle between courage and doubt. Half of it is always asleep while its other half is looking for an opportunity to chase its inner dreams."),
                List.of(new EvolutionEntry("soarinne", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .pseudoLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Snorin");

    }


}
