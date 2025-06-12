package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Exovision extends drai.dev.data.pokemon.Pokemon {
    public Exovision() {
        super("Exovision",
                Type.ROCK,Type.GHOST,
                new Stats(62,
                        93,
                        142,
                        72,
                        74,
                        52),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 272,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 36, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Exovision");

    }


}
