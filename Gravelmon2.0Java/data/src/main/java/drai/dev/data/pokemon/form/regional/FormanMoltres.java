package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanMoltres extends drai.dev.data.pokemon.Pokemon {
    public FormanMoltres(String name, Aspect aspect) {
        super(name, aspect, "FormanMoltres",
                Type.GROUND,Type.FLYING,
                new Stats(102,
                        77,
                        87,
                        126,
                        97,
                        87),
                List.of(Ability.SAND_VEIL), null,
                21, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_SOUL_SAND)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Moltres");

    }


}
