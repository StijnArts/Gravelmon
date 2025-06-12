package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanKangaskhan extends drai.dev.data.pokemon.Pokemon {
    public FormanKangaskhan(String name, Aspect aspect) {
        super(name, aspect, "FormanKangaskhan",
                Type.ROCK,
                new Stats(106,
                        106,
                        74,
                        45,
                        82,
                        74),
                List.of(Ability.STURDY), null,
                22, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 32, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kangaskhan");

    }


}
