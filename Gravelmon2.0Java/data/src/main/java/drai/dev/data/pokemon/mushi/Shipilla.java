package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shipilla extends drai.dev.data.pokemon.Pokemon {
    public Shipilla() {
        super("Shipilla",
                Type.POISON,Type.ELECTRIC,
                new Stats(45,
                        55,
                        78,
                        30,
                        57,
                        30),
                List.of(Ability.STATIC), Ability.POISON_POINT,
                5, 0,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("koucoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 2, 26, 4.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shipilla");

    }


}
