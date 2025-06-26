package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Peafuddle extends drai.dev.data.pokemon.Pokemon {
    public Peafuddle() {
        super("Peafuddle",
                Type.PSYCHIC, Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.UNNERVE,Ability.CUTE_CHARM), Ability.RATTLED,
                7, 191,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Peafuddle are erratic creatures, often making chirping sounds to simply chase away the silence. They also like to startle other 'Mons by squawking loudly."),
                List.of(new EvolutionEntry("peadazzled", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male"))),
                        new EvolutionEntry("peaknighted", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female")))),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(18).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Peafuddle");

    }


}
