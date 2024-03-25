package drai.dev.gravelmon.pokemon.mushi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Polvite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Polvite() {
        super("Polvite",
                Type.GROUND,
                new Stats(34,
                        69,
                        78,
                        32,
                        32,
                        55),
                List.of(Ability.SAND_FORCE,Ability.SAP_SIPPER), Ability.INFILTRATOR,
                0, 0,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
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
           setLangFileName("Polvite");

    }


}
