package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kyopir extends drai.dev.data.pokemon.Pokemon {
    public Kyopir() {
        super("Kyopir",
                Type.DARK, Type.FAIRY,
                new Stats(80,
                        86,
                        63,
                        75,
                        67,
                        79),
                List.of(Ability.INNER_FOCUS,Ability.FOREWARN), Ability.UNDERLING,
                14, 0,
                new Stats(1,1,0,0,0,0), 90,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Crime syndicates utilise Kyopir to construct blockades and hinder police involvement. It is quite obstinate and will only fight if they are given something in return."),
                List.of(new EvolutionEntry("piroyata", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"56")))),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Kyopir");

    }


}
