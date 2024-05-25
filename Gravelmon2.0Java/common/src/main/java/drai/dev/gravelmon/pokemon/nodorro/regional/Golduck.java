package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Golduck extends drai.dev.gravelmon.pokemon.Pokemon {
    public Golduck(int dex) {
        super(dex, "Golduck",
                Type.WATER,
                new Stats(80,
                        82,
                        78,
                        95,
                        80,
                        85),
                List.of(Ability.DAMP,Ability.CLOUD_NINE), Ability.SWIFT_SWIM,
                17, 766,
                new Stats(0,0,0,2,0,0), 75,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its long, slim limbs end in broad flippers. They are used for swimming gracefully in lakes. - Placeholder"),
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
           setLangFileName("Golduck");

    }


}
