package drai.dev.gravelmon.pokemon.nodorro;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Terranguis extends drai.dev.gravelmon.pokemon.Pokemon {
    public Terranguis() {
        super("Terranguis",
                Type.GRASS,Type.DRAGON,
                new Stats(100,
                        150,
                        120,
                        100,
                        103,
                        97),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                100, 6048,
                new Stats(0,3,1,0,0,0), 5,
                0.0,
                300, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Terranguis");

    }


}
