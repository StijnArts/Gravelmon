package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class GossHarag extends drai.dev.data.pokemon.Pokemon {
    public GossHarag(Stats stats) {
        super("GossHarag",
                Type.ICE, Type.DARK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Covered in fur so thick it keeps out the harsh frost, it roams the snowy plains in search of prey. It can inhale the cold air to freeze its own bodily fluids and then spit them out to create icy blades on its arms. When riled up, the Goss Harag turns red and becomes exceedingly dangerous."),
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
           setLangFileName("Goss Harag");

    }


}
