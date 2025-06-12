package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanLugia extends drai.dev.data.pokemon.Pokemon {
    public FormanLugia(String name, Aspect aspect) {
        super(name, aspect, "FormanLugia",
                Type.GHOST,Type.DRAGON,
                new Stats(148,
                        153,
                        148,
                        52,
                        114,
                        63),
                List.of(Ability.CURSEDAIR), null,
                58, 0,
                new Stats(0,0,0,0,0,0), 3,
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
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Lugia");

    }


}
