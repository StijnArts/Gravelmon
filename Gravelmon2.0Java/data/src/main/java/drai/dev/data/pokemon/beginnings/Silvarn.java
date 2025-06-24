package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Silvarn extends drai.dev.data.pokemon.Pokemon {
    public Silvarn() {
        super("Silvarn",
                Type.STEEL,Type.DARK,
                new Stats(85,
                        80,
                        130,
                        80,
                        100,
                        25),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(25).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).atNight()
                        .setSpawnPreset(SpawnPreset.UNDERGROUND).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Silvarn");

    }


}
