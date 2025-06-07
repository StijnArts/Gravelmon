package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scaelicius extends drai.dev.data.pokemon.Pokemon {
    public Scaelicius() {
        super("Scaelicius",
                Type.FLYING, Type.DRAGON,
                new Stats(80,
                        130,
                        95,
                        145,
                        100,
                        120),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                73, 2000,
                new Stats(0,1,0,2,0,0), 5,
                0.0,
                300, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("- Smite Light - Holy Blessing Light"),
                List.of(),
                List.of(            ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SKY)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Scaelicius");

    }


}
