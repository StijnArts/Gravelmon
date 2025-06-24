package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bullake extends drai.dev.data.pokemon.Pokemon {
    public Bullake(Stats stats) {
        super("Bullake",
                Type.WATER,
                stats,
                List.of(Ability.THICK_FAT,Ability.OBLIVIOUS), Ability.HYDRATION,
                21, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Bullakes large body makes it hard to keep swimming for long periods of time, so it frequently rests at the bottom of lakes, and moss and underwater plants grow on its skin while it rests. It uses its large horns to attack ony predators attempting to eat its children."),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_WARM_OCEAN).setAntiBiomes(Biome.IS_DEEP_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setAquatic();
           setLangFileName("Bullake");

    }


}
