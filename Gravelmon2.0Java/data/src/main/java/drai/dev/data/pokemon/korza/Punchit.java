package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Punchit extends drai.dev.data.pokemon.Pokemon {
    public Punchit() {
        super("Punchit",
                Type.FIGHTING,
                new Stats(34,
                        64,
                        43,
                        23,
                        31,
                        60),
                List.of(Ability.INNER_FOCUS), Ability.GUTS,
                10, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Often found wearing heavy bands on the wrists and ankles for weight training. Becoming stronger is Punchit's goal, but the small mon becomes overexerted easily."),
                List.of(),
                List.of(                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Punchit");

    }


}
