package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanCorsola extends drai.dev.data.pokemon.Pokemon {
    public FormanCorsola(String name, Aspect aspect) {
        super(name, aspect, "FormanCorsola",
                Type.POISON,Type.ROCK,
                new Stats(110,
                        64,
                        130,
                        31,
                        31,
                        17),
                List.of(Ability.POISON_TOUCH), null,
                6, 0,
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
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 23, 43, 1.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
           setLangFileName("Corsola");

    }


}
