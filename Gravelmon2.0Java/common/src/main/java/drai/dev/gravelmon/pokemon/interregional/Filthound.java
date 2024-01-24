package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Filthound extends drai.dev.gravelmon.pokemon.Pokemon {
    public Filthound() {
        super("Filthound",
                Type.NORMAL,Type.GROUND,
                new Stats(130,
                        95,
                        100,
                        40,
                        85,
                        50),
                List.of(Ability.FLUFFY), Ability.STENCH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Filthound's fur is easily covered in mud and saliva if not groomed daily. They are often abandoned due to their natural odor and dirtiness."),
                List.of(),
                List.of(                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Filthound");

    }


}
