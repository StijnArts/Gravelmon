package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanJynx extends drai.dev.data.pokemon.Pokemon {
    public FormanJynx(String name, Aspect aspect) {
        super(name, aspect, "FormanJynx",
                Type.GHOST,Type.NORMAL,
                new Stats(80,
                        42,
                        69,
                        99,
                        94,
                        69),
                List.of(Ability.CURSED_BODY), null,
                16, 0,
                new Stats(0,0,0,0,0,0), 60,
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
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Jynx");

    }


}
