package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Leviathrus extends drai.dev.data.pokemon.Pokemon {
    public Leviathrus() {
        super("Leviathrus",
                Type.WATER, Type.DRAGON,
                new Stats(80,
                        120,
                        100,
                        150,
                        120,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                68, 2600,
                new Stats(0,1,0,2,1,0), 5,
                -1.0,
                300, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Leviathrus");

    }


}
