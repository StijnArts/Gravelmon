package drai.dev.data.pokemon.fabel.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FabelianGumshoos extends drai.dev.data.pokemon.Pokemon {
    public FabelianGumshoos(String name, Aspect aspect) {
        super(name, aspect, "FabelianGumshoos",
                Type.NORMAL,Type.STEEL,
                new Stats(91,
                        77,
                        107,
                        32,
                        70,
                        39),
                List.of(), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FABEL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gumshoos");

    }


}
