package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glacizard extends drai.dev.data.pokemon.Pokemon {
    public Glacizard() {
        super("Glacizard",
                Type.ICE,
                new Stats(115,
                        40,
                        89,
                        98,
                        137,
                        49),
                List.of(Ability.GLACIERS), null,
                17, 0,
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
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE,  16, 40, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GLACIAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Glacizard");

    }


}
