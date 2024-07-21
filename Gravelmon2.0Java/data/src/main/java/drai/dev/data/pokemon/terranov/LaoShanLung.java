package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LaoShanLung extends drai.dev.data.pokemon.Pokemon {
    public LaoShanLung(Stats stats) {
        super("LaoShanLung",
                Type.DRAGON,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A giant dragon that has only been rarely sighted. It periodically prowls close to inhabited areas, and the damage it causes is comparable to that wreaked by a natural disaster. Its habits are a mystery, and no one knows why it occasionally wanders. The Guild has built defensive barricades where they appear, but to what effect."),
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
           setLangFileName("Lao Shan Lung");

    }


}
