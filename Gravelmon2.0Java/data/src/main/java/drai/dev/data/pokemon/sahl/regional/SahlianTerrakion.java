package drai.dev.data.pokemon.sahl.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class SahlianTerrakion extends drai.dev.data.pokemon.Pokemon {
    public SahlianTerrakion(String name, Aspect aspect) {
        super(name, aspect, "SahlianTerrakion",
                Type.FIRE,Type.FIGHTING,
                new Stats(120,
                        38,
                        120,
                        130,
                        120,
                        48),
                List.of(), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.SAHL),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Terrakion");

    }


}
