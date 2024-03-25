package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Peaf extends drai.dev.gravelmon.pokemon.Pokemon {
    public Peaf() {
        super("Peaf",
                Type.GRASS,Type.FLYING,
                new Stats(40,
                        72,
                        71,
                        81,
                        67,
                        59),
                List.of(Ability.BERRYPLUMAGE), Ability.BERRYPLUMAGE,
                4, 40,
                new Stats(0,0,0,1,0,0), 45,
                0.125,
                86, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FLYING),
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
           setLangFileName("Peaf");

    }


}
