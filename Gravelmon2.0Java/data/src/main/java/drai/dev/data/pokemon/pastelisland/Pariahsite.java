package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pariahsite extends drai.dev.data.pokemon.Pokemon {
    public Pariahsite() {
        super("Pariahsite",
                Type.DRAGON, Type.DARK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.INTIMIDATE,Ability.SUCTION_CUPS), Ability.OVERCOAT,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("haebidon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"55")))),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .pseudoLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Pariahsite");

    }


}
