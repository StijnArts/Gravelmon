package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Draligne extends drai.dev.data.pokemon.Pokemon {
    public Draligne() {
        super("Draligne",
                Type.POISON, Type.DRAGON,
                new Stats(70,
                        106,
                        72,
                        70,
                        67,
                        100),
                List.of(Ability.NIGHTSTALKER,Ability.MARVEL_SCALE), Ability.INTIMIDATE,
                0, 0,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                153, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.DRAGON),
                List.of("Astronomers have long used this pokemon to predict the movements of heavenly bodies. It is more animated beneath the stars."),
                List.of(),
                List.of(                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Draligne");

    }


}
