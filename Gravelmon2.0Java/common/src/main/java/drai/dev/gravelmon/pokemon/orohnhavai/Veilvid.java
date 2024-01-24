package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Veilvid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Veilvid() {
        super("Veilvid",
                Type.WATER,Type.GRASS,
                new Stats(60,
                        50,
                        60,
                        70,
                        100,
                        80),
                List.of(Ability.WATER_ABSORB), Ability.WATER_VEIL,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Veilvid can only be found in freshwater streams and lakes. They feed on aquatic plants. Their leafy fins help it to camouflage in the water, hidden out of sight from predators. Their fins are actually almost plant-like. They swim near the surface to absorb sunlight to convert into energy."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Veilvid");

    }


}
