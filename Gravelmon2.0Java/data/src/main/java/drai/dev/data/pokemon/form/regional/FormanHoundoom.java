package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanHoundoom extends drai.dev.data.pokemon.Pokemon {
    public FormanHoundoom(String name, Aspect aspect) {
        super(name, aspect, "FormanHoundoom",
                Type.DARK,Type.GHOST,
                new Stats(88,
                        46,
                        95,
                        109,
                        84,
                        75),
                List.of(Ability.BERSERK), null,
                15, 0,
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 24, 51, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_SOUL_SAND))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Houndoom");

    }


}
