package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scubug extends drai.dev.data.pokemon.Pokemon {
    public Scubug() {
        super("Scubug",
                Type.WATER,Type.BUG,
                new Stats(60,
                        60,
                        70,
                        61,
                        102,
                        79),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(18).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SEAFLOOR)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Scubug");

    }


}
