package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Typhitty extends drai.dev.data.pokemon.Pokemon {
    public Typhitty() {
        super("Typhitty",
                Type.GRASS,Type.WATER,
                new Stats(40,
                        65,
                        50,
                        40,
                        50,
                        65),
                List.of(Ability.LIMBER), Ability.LIMBER,
                9, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Typhitty can live in many rivers and ponds, and are good for whatever water they live in because their gills naturally filter and purify water"),
                List.of(new EvolutionEntry("typheline", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_FRESHWATER).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Typhitty");

    }


}
