package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chemisquito extends drai.dev.data.pokemon.Pokemon {
    public Chemisquito() {
        super("Chemisquito",
                Type.POISON,Type.BUG,
                new Stats(41,
                        67,
                        50,
                        85,
                        62,
                        86),
                List.of(Ability.CORROSION), Ability.CORROSION,
                8, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 16, 41, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Chemisquito");

    }


}
