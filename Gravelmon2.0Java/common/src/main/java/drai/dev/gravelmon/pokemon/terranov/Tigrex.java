package drai.dev.gravelmon.pokemon.terranov;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Tigrex extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tigrex() {
        super("Tigrex",
                Type.FIGHTING, Type.GROUND,
                new Stats(80,
                        125,
                        80,
                        100,
                        70,
                        100),
                List.of(Ability.STRONG_JAW), Ability.STRONG_JAW,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tigrex");

    }


}
