package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Mossloth extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mossloth() {
        super("Mossloth",
                Type.GRASS,
                new Stats(140,
                        85,
                        100,
                        70,
                        90,
                        20),
                List.of(Ability.GRASS_PELT), Ability.STALL,
                22, 800,
                new Stats(2,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mossloth conserves energy, appearing sluggish in battle to deceive opponents. When underestimated, it surprises with a powerful, rapid strike fueled by its stored energy."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mossloth");

    }


}
