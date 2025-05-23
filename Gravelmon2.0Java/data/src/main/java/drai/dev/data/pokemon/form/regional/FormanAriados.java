package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanAriados extends drai.dev.data.pokemon.Pokemon {
    public FormanAriados(String name, Aspect aspect) {
        super(name, aspect, "FormanAriados",
                Type.BUG,Type.DARK,
                new Stats(70,
                        103,
                        60,
                        37,
                        67,
                        60),
                List.of(Ability.CURSED_BODY), null,
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 51, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ariados");

    }


}
