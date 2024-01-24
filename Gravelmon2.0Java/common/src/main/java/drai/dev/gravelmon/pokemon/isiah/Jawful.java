package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Jawful extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jawful() {
        super("Jawful",
                Type.DARK,Type.ELECTRIC,
                new Stats(65,
                        85,
                        75,
                        85,
                        60,
                        105),
                List.of(Ability.INTIMIDATE), Ability.STRONG_JAW,
                8, 165,
                new Stats(0,0,0,0,0,2), 0,
                0.5,
                166, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Jawful");

    }


}
