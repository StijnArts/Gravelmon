package drai.dev.data.pokemon.bago;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Silkenfly extends drai.dev.data.pokemon.Pokemon {
    public Silkenfly() {
        super("Silkenfly",
                Type.BUG,Type.FLYING,
                new Stats(61,
                        32,
                        65,
                        93,
                        65,
                        111),
                List.of(), null,
                UnitConverter.feetToMeters(3, 11), 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.BAGO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 11, 25, 1.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Silkenfly");

    }


}
