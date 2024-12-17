package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Convice extends drai.dev.data.pokemon.Pokemon {
    public Convice() {
        super("Convice",
                Type.DARK,Type.NORMAL,
                new Stats(80,
                        105,
                        55,
                        45,
                        45,
                        95),
                List.of(Ability.RUN_AWAY,Ability.RATTLED), Ability.TECHNICIAN,
                13, 0,
                new Stats(0,1,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 42, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Convice");

    }


}
