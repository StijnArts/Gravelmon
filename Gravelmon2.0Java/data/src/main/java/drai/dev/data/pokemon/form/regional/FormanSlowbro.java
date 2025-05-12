package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanSlowbro extends drai.dev.data.pokemon.Pokemon {
    public FormanSlowbro(String name, Aspect aspect) {
        super(name, aspect, "FormanSlowbro",
                Type.GHOST,Type.WATER,
                new Stats(106,
                        37,
                        126,
                        106,
                        90,
                        21),
                List.of(Ability.MOISTMIST), null,
                17, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 37, 57, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_SOUL_SAND))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Slowbro");

    }


}
