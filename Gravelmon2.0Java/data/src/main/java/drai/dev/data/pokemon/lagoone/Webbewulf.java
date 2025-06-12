package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Webbewulf extends drai.dev.data.pokemon.Pokemon {
    public Webbewulf() {
        super("Webbewulf",
                Type.DARK,Type.BUG,
                new Stats(91,
                        101,
                        90,
                        58,
                        52,
                        101),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 930,
                new Stats(0,2,0,0,0,0), 65,
                0.5,
                184, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(36)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Webbewulf");

    }


}
