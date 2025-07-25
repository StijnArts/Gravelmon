package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Miralide extends drai.dev.data.pokemon.Pokemon {
    public Miralide() {
        super("Miralide",
                Type.GRASS, Type.FAIRY,
                new Stats(126,
                        62,
                        70,
                        92,
                        108,
                        75),
                List.of(Ability.OVERGROW), Ability.PIXILATE,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Miralide is proud of its appearance and is not afraid to show it. A walk on a field or in the forest will leave a trail of flowers full of vibrant colors."),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Miralide");

    }


}
