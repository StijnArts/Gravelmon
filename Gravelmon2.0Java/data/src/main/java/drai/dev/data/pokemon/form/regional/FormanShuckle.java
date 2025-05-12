package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanShuckle extends drai.dev.data.pokemon.Pokemon {
    public FormanShuckle(String name, Aspect aspect) {
        super(name, aspect, "FormanShuckle",
                Type.BUG,Type.NUCLEAR,
                new Stats(63,
                        67,
                        130,
                        67,
                        130,
                        46),
                List.of(Ability.CONTRARY), null,
                12, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 43, 1.7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shuckle");

    }


}
