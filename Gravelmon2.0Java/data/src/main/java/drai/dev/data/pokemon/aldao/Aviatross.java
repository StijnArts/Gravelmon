package drai.dev.data.pokemon.aldao;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Aviatross extends drai.dev.data.pokemon.Pokemon {
    public Aviatross() {
        super("Aviatross",
                Type.WATER,Type.FIGHTING,
                new Stats(83,
                        121,
                        71,
                        43,
                        79,
                        71),
                List.of(), null,
                UnitConverter.feetToMeters(4, 11), 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ALDAO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 54, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH, Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Aviatross");

    }


}
