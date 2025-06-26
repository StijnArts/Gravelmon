package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class DemonicChains extends drai.dev.data.pokemon.Pokemon {
    public DemonicChains() {
        super("DemonicChains",
                Type.DARK,Type.POISON,
                new Stats(93,
                        185,
                        78,
                        45,
                        88,
                        78),
                List.of(Ability.PROTOSYNTHESIS), null,
                21, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IVRIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .abnormality()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_NETHER_SOUL_SAND).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Demonic Chains");

    }


}
