package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dunrada extends drai.dev.data.pokemon.Pokemon {
    public Dunrada() {
        super("Dunrada",
                Type.WATER,Type.DRAGON,
                new Stats(131,
                        39,
                        85,
                        94,
                        111,
                        47),
                List.of(Ability.WATER_ABSORB), null,
                34, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(37)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Dunrada");

    }


}
