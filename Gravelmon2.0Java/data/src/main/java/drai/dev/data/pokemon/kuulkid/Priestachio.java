package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Priestachio extends drai.dev.data.pokemon.Pokemon {
    public Priestachio() {
        super("Priestachio",
                Type.GRASS,Type.PSYCHIC,
                new Stats(85,
                        76,
                        53,
                        96,
                        96,
                        74),
                List.of(Ability.HEALER), Ability.HEALER,
                18, 0,
                new Stats(0,0,0,0,2,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Priestachio");

    }


}
