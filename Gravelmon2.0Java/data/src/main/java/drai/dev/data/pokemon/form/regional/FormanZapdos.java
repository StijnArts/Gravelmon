package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanZapdos extends drai.dev.data.pokemon.Pokemon {
    public FormanZapdos(String name, Aspect aspect) {
        super(name, aspect, "FormanZapdos",
                Type.GHOST,Type.FLYING,
                new Stats(155,
                        44,
                        68,
                        91,
                        184,
                        25),
                List.of(Ability.CURSED_BODY), null,
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
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Zapdos");

    }


}
