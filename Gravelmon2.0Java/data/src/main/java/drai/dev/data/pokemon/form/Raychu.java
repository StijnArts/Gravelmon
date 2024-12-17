package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Raychu extends drai.dev.data.pokemon.Pokemon {
    public Raychu() {
        super("Raychu",
                Type.NUCLEAR,
                new Stats(69,
                        37,
                        73,
                        105,
                        73,
                        125),
                List.of(Ability.ACTIVE), null,
                11, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Raychu");

    }


}
