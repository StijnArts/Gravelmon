package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanSmeargle extends drai.dev.data.pokemon.Pokemon {
    public FormanSmeargle(String name, Aspect aspect) {
        super(name, aspect, "FormanSmeargle",
                Type.ELECTRIC,Type.NORMAL,
                new Stats(85,
                        20,
                        40,
                        20,
                        40,
                        30),
                List.of(Ability.ARTBLOCK), null,
                14, 0,
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 38, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Smeargle");

    }


}
