package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hallusage extends drai.dev.data.pokemon.Pokemon {
    public Hallusage(Stats stats) {
        super("Hallusage",
                Type.PSYCHIC, Type.FAIRY,
                stats,
                List.of(Ability.TRIAGE), Ability.PSYCHIC_SURGE,
                6, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.6,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hallusage");

    }


}
