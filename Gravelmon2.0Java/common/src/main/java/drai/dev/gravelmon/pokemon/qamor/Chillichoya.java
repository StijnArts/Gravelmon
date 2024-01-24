package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Chillichoya extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chillichoya() {
        super("Chillichoya",
                Type.ICE,Type.GRASS,
                new Stats(62,
                        53,
                        70,
                        58,
                        55,
                        32),
                List.of(Ability.ROUGH_SKIN), Ability.DRY_SKIN,
                8, 165,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
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
           setLangFileName("Chillichoya");

    }


}
