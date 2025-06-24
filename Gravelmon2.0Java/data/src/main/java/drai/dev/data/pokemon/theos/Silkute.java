package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Silkute extends drai.dev.data.pokemon.Pokemon {
    public Silkute() {
        super("Silkute",
                Type.BUG, Type.PSYCHIC,
                new Stats(70,
                        30,
                        70,
                        60,
                        75,
                        30),
                List.of(Ability.SWARM), Ability.FILTER,
                7, 40,
                new Stats(1,0,0,0,0,0), 180,
                0.5,
                118, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("flutterfly", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(12).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Silkute");

    }


}
