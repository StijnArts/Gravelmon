package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sqworm extends drai.dev.data.pokemon.Pokemon {
    public Sqworm() {
        super("Sqworm",
                Type.BUG, Type.GROUND,
                new Stats(40,
                        50,
                        40,
                        30,
                        40,
                        50),
                List.of(Ability.EARTH_EATER), Ability.REGENERATOR,
                3, 10,
                new Stats(0,0,0,0,0,1), 240,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Gardener's love Sqworm for their ability to turn the soil, keeping it fresh and moist. The length of a Sqworm depends on the quality of soil they've been eating."),
                List.of(new EvolutionEntry("Tunnoworm", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NEAR_CROPS).build(),
                List.of());
           setLangFileName("Sqworm");

    }


}
