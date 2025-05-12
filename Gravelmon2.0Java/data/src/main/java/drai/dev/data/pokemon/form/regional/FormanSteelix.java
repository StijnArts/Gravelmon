package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanSteelix extends drai.dev.data.pokemon.Pokemon {
    public FormanSteelix(String name, Aspect aspect) {
        super(name, aspect, "FormanSteelix",
                Type.STEEL,Type.FIRE,
                new Stats(111,
                        59,
                        128,
                        111,
                        77,
                        22),
                List.of(Ability.FLAME_BODY), null,
                51, 0,
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 39, 67, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_BASALT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Steelix");

    }


}
