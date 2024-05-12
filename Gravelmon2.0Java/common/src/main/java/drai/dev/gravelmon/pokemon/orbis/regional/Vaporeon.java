package drai.dev.gravelmon.pokemon.orbis.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Vaporeon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vaporeon(int dex) {
        super(dex, "Vaporeon",
                Type.WATER,
                new Stats(130,
                        65,
                        60,
                        110,
                        95,
                        65),
                List.of(Ability.WATER_ABSORB), Ability.HYDRATION,
                10, 290,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Vaporeon underwent a spontaneous mutation and grew fins and gills that allow them to live underwater. They have the ability to freely control water."),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vaporeon");

    }


}
