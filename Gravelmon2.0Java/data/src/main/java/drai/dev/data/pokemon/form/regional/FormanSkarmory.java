package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanSkarmory extends drai.dev.data.pokemon.Pokemon {
    public FormanSkarmory(String name, Aspect aspect) {
        super(name, aspect, "FormanSkarmory",
                Type.STEEL,Type.ELECTRIC,
                new Stats(124,
                        35,
                        55,
                        73,
                        148,
                        20),
                List.of(Ability.LEVITATE), null,
                19, 0,
                new Stats(0,0,0,0,0,0), 25,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 51, 2.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Skarmory");

    }


}
