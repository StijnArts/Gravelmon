package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Tyragaan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tyragaan() {
        super("Tyragaan",
                Type.GRASS,Type.LIGHT,
                new Stats(91,
                        124,
                        90,
                        85,
                        64,
                        101),
                List.of(Ability.FLUORESCENCE), Ability.FLUORESCENCE,
                36, 1032,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                221, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tyragaan");

    }


}
