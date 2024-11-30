package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bulblotel extends drai.dev.data.pokemon.Pokemon {
    public Bulblotel() {
        super("Bulblotel",
                Type.ELECTRIC,Type.DRAGON,
                new Stats(75,
                        40,
                        65,
                        93,
                        72,
                        82),
                List.of(Ability.STATIC), null,
                13, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 21, 45, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bulblotel");

    }


}
