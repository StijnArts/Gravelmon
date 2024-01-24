package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Claggy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Claggy() {
        super("Claggy",
                Type.FLYING,Type.GROUND,
                new Stats(50,
                        75,
                        70,
                        35,
                        70,
                        48),
                List.of(Ability.BIG_PECKS,Ability.OVERCOAT,Ability.WEAK_ARMOR), Ability.WEAK_ARMOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its shape and demeanor are very similar to Scraggy. It builds mud and sharp twigs into a nest around itself to feel protected and confident. If the nest is destroyed, it flees in a panic"),
                List.of(),
                List.of(                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Claggy");

    }


}
