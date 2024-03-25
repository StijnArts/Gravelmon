package drai.dev.gravelmon.pokemon.mushi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Brahmbash extends drai.dev.gravelmon.pokemon.Pokemon {
    public Brahmbash() {
        super("Brahmbash",
                Type.DARK,
                new Stats(65,
                        95,
                        45,
                        45,
                        35,
                        30),
                List.of(Ability.HUSTLE), Ability.ANGER_POINT,
                0, 0,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Brahmbash");

    }


}
