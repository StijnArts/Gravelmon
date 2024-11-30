package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dradrio extends drai.dev.data.pokemon.Pokemon {
    public Dradrio() {
        super("Dradrio",
                Type.DRAGON,Type.ICE,
                new Stats(75,
                        40,
                        80,
                        115,
                        80,
                        136),
                List.of(Ability.ICE_BODY), null,
                32, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 40, 58, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GLACIAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dradrio");

    }


}
