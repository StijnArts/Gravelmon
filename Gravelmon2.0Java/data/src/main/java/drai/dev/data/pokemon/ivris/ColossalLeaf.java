package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class ColossalLeaf extends drai.dev.data.pokemon.Pokemon {
    public ColossalLeaf() {
        super("ColossalLeaf",
                Type.GRASS,Type.DRAGON,
                new Stats(166,
                        39,
                        139,
                        120,
                        82,
                        20),
                List.of(Ability.PROTOSYNTHESIS), null,
                41, 0,
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
                        .setBiomes(Biome.IS_OLD_GROWTH_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Colossal Leaf");

    }


}
