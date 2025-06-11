package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Acheeva extends drai.dev.data.pokemon.Pokemon {
    public Acheeva() {
        super("Acheeva",
                Type.ELECTRIC, Type.FIRE,
                new Stats(70,
                        100,
                        56,
                        20,
                        70,
                        200),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Outrunning an Acheeva would be considered a new Pokémon World record. Reaching such high speed has an advantage when hunting down a slower foe, such as Blitzle and Blazelle."),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Acheeva");

    }


}
