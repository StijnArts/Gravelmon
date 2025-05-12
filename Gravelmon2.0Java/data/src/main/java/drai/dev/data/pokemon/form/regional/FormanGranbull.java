package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanGranbull extends drai.dev.data.pokemon.Pokemon {
    public FormanGranbull(String name, Aspect aspect) {
        super(name, aspect, "FormanGranbull",
                Type.ICE,Type.FAIRY,
                new Stats(79,
                        116,
                        68,
                        42,
                        75,
                        68),
                List.of(Ability.THICK_FAT), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 27, 51, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Granbull");

    }


}
