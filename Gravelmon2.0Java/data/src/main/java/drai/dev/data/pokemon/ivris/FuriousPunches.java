package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FuriousPunches extends drai.dev.data.pokemon.Pokemon {
    public FuriousPunches() {
        super("FuriousPunches",
                Type.FIGHTING,Type.DARK,
                new Stats(120,
                        147,
                        120,
                        39,
                        92,
                        49),
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
                        .setBiomes(Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Furious Punches");

    }


}
