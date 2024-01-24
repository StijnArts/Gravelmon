package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Foaloch extends drai.dev.gravelmon.pokemon.Pokemon {
    public Foaloch() {
        super("Foaloch",
                Type.WATER,Type.GRASS,
                new Stats(55,
                        55,
                        50,
                        45,
                        55,
                        50),
                List.of(Ability.GRASS_PELT,Ability.HYDRATION,Ability.RUN_AWAY), Ability.RUN_AWAY,
                8, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("It walks uneasily due to its young legs, so it spends most of its time in the water while its body strengthens. The lily pad on its back is buoyant and allows it to tread water without fear of drowning, though it tends to drift off if unattended."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Foaloch");

    }


}
