package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Airadaga extends drai.dev.data.pokemon.Pokemon {
    public Airadaga() {
        super("Airadaga",
                Type.DARK,Type.GRASS,
                new Stats(56,
                        111,
                        62,
                        78,
                        62,
                        111),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(32).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Airadaga");

    }


}
