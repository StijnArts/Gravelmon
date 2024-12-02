package drai.dev.data.pokemon.aristos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Goobae extends drai.dev.data.pokemon.Pokemon {
    public Goobae() {
        super("Goobae",
                Type.POISON,
                new Stats(44,
                        44,
                        43,
                        25,
                        44,
                        20),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                1, 30,
                new Stats(1,0,0,0,0,0), 190,
                0.5,
                42, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("S O O N"),
                List.of(new EvolutionEntry("grimer", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190")))),
                List.of(),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.COMMON, 3, 22, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.WATER_SURFACE),
                0.28, 0.3,
                List.of());
        setCanWalkOnWater(true);
           setLangFileName("Goobae");

    }


}
