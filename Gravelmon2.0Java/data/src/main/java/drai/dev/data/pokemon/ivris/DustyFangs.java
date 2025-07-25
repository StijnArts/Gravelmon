package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class DustyFangs extends drai.dev.data.pokemon.Pokemon {
    public DustyFangs() {
        super("DustyFangs",
                Type.GROUND,Type.DRAGON,
                new Stats(81,
                        124,
                        86,
                        43,
                        86,
                        147),
                List.of(Ability.PROTOSYNTHESIS), null,
                19, 0,
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
                        .setBiomes(Biome.IS_DESERT).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Dusty Fangs");

    }


}
