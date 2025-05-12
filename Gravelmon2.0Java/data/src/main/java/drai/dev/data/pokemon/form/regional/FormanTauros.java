package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanTauros extends drai.dev.data.pokemon.Pokemon {
    public FormanTauros(String name, Aspect aspect) {
        super(name, aspect, "FormanTauros",
                Type.FIRE,Type.GROUND,
                new Stats(106,
                        110,
                        106,
                        37,
                        82,
                        45),
                List.of(Ability.FLAME_BODY), null,
                18, 0,
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 43, 1.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT))
                ), List.of(),
                List.of(SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Tauros");

    }


}
