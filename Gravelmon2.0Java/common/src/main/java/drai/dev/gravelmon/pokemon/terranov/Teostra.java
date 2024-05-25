package drai.dev.gravelmon.pokemon.terranov;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Teostra extends drai.dev.gravelmon.pokemon.Pokemon {
    public Teostra() {
        super("Teostra",
                Type.FIRE, Type.DRAGON,
                new Stats(90,
                        95,
                        108,
                        127,
                        100,
                        80),
                List.of(Ability.DROUGHT), Ability.DROUGHT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Brutal elder dragons wreathed in flames that spew blazing fire. Teostra are of such a fierce and deadly nature that the Guild closely monitors their movements."),
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
           setLangFileName("Teostra");

    }


}
