package drai.dev.data.pokemon.ruskow;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Catopact extends drai.dev.data.pokemon.Pokemon {
    public Catopact() {
        super("Catopact",
                Type.GHOST, Type.STEEL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 0,
                new Stats(0,0,0,0,0,0), 210,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("spectreflek", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(),
                List.of(Label.RUSKOW),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.MANSION).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Catopact");

    }


}
