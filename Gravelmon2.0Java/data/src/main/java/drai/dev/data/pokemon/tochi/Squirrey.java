package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squirrey extends drai.dev.data.pokemon.Pokemon {
    public Squirrey() {
        super("Squirrey",
                Type.NORMAL,
                new Stats(45,
                        55,
                        40,
                        35,
                        40,
                        35),
                List.of(Ability.GLUTTONY), Ability.GLUTTONY,
                5, 0,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("raspberrel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(1).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NEAR_BERRY_BUSH).build(),
                List.of());
           setLangFileName("Squirrey");

    }


}
