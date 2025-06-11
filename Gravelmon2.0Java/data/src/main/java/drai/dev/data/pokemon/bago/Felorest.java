package drai.dev.data.pokemon.bago;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Felorest extends drai.dev.data.pokemon.Pokemon {
    public Felorest() {
        super("Felorest",
                Type.GRASS,
                new Stats(73,
                        111,
                        77,
                        39,
                        77,
                        131),
                List.of(Ability.OVERGROW), Ability.EFFECT_SPORE,
                UnitConverter.feetToMeters(5, 1), 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.BAGO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Felorest");

    }


}
