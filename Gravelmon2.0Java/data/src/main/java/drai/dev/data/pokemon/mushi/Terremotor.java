package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Terremotor extends drai.dev.data.pokemon.Pokemon {
    public Terremotor() {
        super("Terremotor",
                Type.GROUND, Type.ELECTRIC,
                new Stats(90,
                        130,
                        135,
                        43,
                        57,
                        70),
                List.of(Ability.HEATPROOF,Ability.MOLD_BREAKER), Ability.EARTH_EATER,
                0, 0,
                new Stats(0,2,2,0,0,0), 50,
                0.5,
                178, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Terremotor");

    }


}
