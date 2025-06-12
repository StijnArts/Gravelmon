package drai.dev.data.pokemon.raian.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TrizoranGarchomp extends drai.dev.data.pokemon.Pokemon {
    public TrizoranGarchomp(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "RaianianGarchompThree",
                Type.DRAGON,Type.ELECTRIC,
                stats,
                List.of(Ability.MOTOR_DRIVE), null,
                21, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .isThundering()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Garchomp");

    }


}
