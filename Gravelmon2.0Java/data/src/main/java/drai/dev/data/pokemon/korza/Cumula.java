package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cumula extends drai.dev.data.pokemon.Pokemon {
    public Cumula() {
        super("Cumula",
                Type.FLYING,
                new Stats(50,
                        35,
                        35,
                        35,
                        35,
                        35),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 12,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Cumula travels where the wind takes it. When the wind dies down, it tethers itself to high places, waiting for the wind to pick back up and carry it away again."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cumula");

    }


}
