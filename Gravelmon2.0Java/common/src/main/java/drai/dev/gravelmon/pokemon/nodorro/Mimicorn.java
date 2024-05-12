package drai.dev.gravelmon.pokemon.nodorro;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Mimicorn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mimicorn() {
        super("Mimicorn",
                Type.GRASS,
                new Stats(80,
                        40,
                        70,
                        50,
                        60,
                        50),
                List.of(Ability.HARVEST,Ability.LEAF_GUARD), Ability.NATURAL_CURE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Mimicorn's tail has a strong sweet aroma, this attracts bugs to come near it. When a bug is in range it attacks."),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mimicorn");

    }


}
