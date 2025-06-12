package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Taurion extends drai.dev.data.pokemon.Pokemon {
    public Taurion(Stats stats) {
        super("Taurion",
                Type.STEEL, Type.ICE,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                26, 0,
                new Stats(0,0,0,0,0,0), 10,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_OCEAN))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Taurion");

    }


}
