package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanDelibird extends drai.dev.data.pokemon.Pokemon {
    public FormanDelibird(String name, Aspect aspect) {
        super(name, aspect, "FormanDelibird",
                Type.FIRE,Type.FLYING,
                new Stats(58,
                        30,
                        50,
                        85,
                        55,
                        50),
                List.of(Ability.FLAME_BODY), null,
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 45, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC, Biome.IS_NETHER_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Delibird");

    }


}
