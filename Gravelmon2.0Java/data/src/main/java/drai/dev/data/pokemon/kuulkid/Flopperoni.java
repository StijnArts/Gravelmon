package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flopperoni extends drai.dev.data.pokemon.Pokemon {
    public Flopperoni() {
        super("Flopperoni",
                Type.WATER,
                new Stats(70,
                        56,
                        72,
                        52,
                        63,
                        42),
                List.of(Ability.DAMP), Ability.LIMBER,
                11, 0,
                new Stats(0,0,2,0,0,0), 110,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 13, 45, 1.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Flopperoni");

    }


}
