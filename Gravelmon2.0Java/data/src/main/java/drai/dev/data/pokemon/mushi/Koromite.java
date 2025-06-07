package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Koromite extends drai.dev.data.pokemon.Pokemon {
    public Koromite() {
        super("Koromite",
                Type.GROUND,
                new Stats(65,
                        120,
                        135,
                        40,
                        70,
                        20),
                List.of(Ability.SAND_STREAM,Ability.SAP_SIPPER), Ability.WATER_ABSORB,
                18, 0,
                new Stats(0,1,2,0,0,0), 90,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(25).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DESERT).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Koromite");

    }


}
