package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Barbeetle extends drai.dev.data.pokemon.Pokemon {
    public Barbeetle() {
        super("Barbeetle",
                Type.BUG,Type.FAIRY,
                new Stats(60,
                        80,
                        85,
                        60,
                        95,
                        105),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 122,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                169, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BIRCH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Barbeetle");

    }


}
