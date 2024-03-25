package drai.dev.gravelmon.pokemon.olysos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Paddorn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Paddorn() {
        super("Paddorn",
                Type.GRASS,
                new Stats(62,
                        90,
                        55,
                        75,
                        43,
                        80),
                List.of(Ability.OVERGROW), Ability.WATER_ABSORB,
                10, 225,
                new Stats(0,2,0,0,0,0), 45,
                0.87,
                141, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("It could easily get along without water for several weeks. The less it has drunk, the sharper and harder the thorns are on its body."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Paddorn");

    }


}
