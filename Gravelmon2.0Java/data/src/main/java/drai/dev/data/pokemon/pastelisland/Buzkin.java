package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Buzkin extends drai.dev.data.pokemon.Pokemon {
    public Buzkin() {
        super("Buzkin",
                Type.ELECTRIC, Type.FLYING,
                new Stats(40,
                        35,
                        30,
                        60,
                        30,
                        50),
                List.of(Ability.STATIC,Ability.BIG_PECKS), Ability.GALE_WINGS,
                29, 27,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                49, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Buzkin generate a constant static shock, causing their fluffy feathers to be stuck to their heads at all times."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Buzkin");

    }


}
