package drai.dev.gravelmon.pokemon.mushi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Kawaiiko extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kawaiiko() {
        super("Kawaiiko",
                Type.NORMAL,
                new Stats(45,
                        40,
                        55,
                        35,
                        40,
                        20),
                List.of(Ability.OVERCOAT), Ability.FLUFFY,
                0, 0,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                51, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kawaiiko");

    }


}
