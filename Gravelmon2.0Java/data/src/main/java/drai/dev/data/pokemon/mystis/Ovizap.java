package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ovizap extends drai.dev.data.pokemon.Pokemon {
    public Ovizap() {
        super("Ovizap",
                Type.ELECTRIC, Type.DRAGON,
                new Stats(45,
                        40,
                        55,
                        60,
                        55,
                        45),
                List.of(Ability.THICK_FAT,Ability.LIGHTNING_ROD), Ability.TANTRUM,
                6, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Ovizap aren't as good as hunting as their evolutions, so they tend to stick together in a small den. Their eggshell protects them from the elements."),
                List.of(new EvolutionEntry("zaptor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .pseudoLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BADLANDS).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Ovizap");

    }


}
