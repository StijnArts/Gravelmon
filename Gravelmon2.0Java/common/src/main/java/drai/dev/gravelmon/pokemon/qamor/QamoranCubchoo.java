package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class QamoranCubchoo extends drai.dev.gravelmon.pokemon.Pokemon {
    public QamoranCubchoo() {
        super("Cubchoo",
                Type.GHOST,Type.POISON,
                new Stats(55,
                        60,
                        40,
                        70,
                        40,
                        40),
                List.of(Ability.GOOEY), Ability.GOOEY,
                8, 165,
                new Stats(0,0,0,1,0,0), 120,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cubchoo");

    }


}
