package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lakalf extends drai.dev.data.pokemon.Pokemon {
    public Lakalf() {
        super("Lakalf",
                Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.THICK_FAT,Ability.OBLIVIOUS), Ability.HYDRATION,
                12, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Lakalfs have large amounts of body fat that allow it take stay warm in the cold waters of the lakes it lives in."),
                List.of(new EvolutionEntry("bullake", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_WARM_OCEAN).setAntiBiomes(Biome.IS_DEEP_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setAquatic();
           setLangFileName("Lakalf");

    }


}
