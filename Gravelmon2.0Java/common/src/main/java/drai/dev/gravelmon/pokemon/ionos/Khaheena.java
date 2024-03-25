package drai.dev.gravelmon.pokemon.ionos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Khaheena extends drai.dev.gravelmon.pokemon.Pokemon {
    public Khaheena() {
        super("Khaheena",
                Type.GROUND,Type.FIGHTING,
                new Stats(79,
                        100,
                        88,
                        88,
                        60,
                        100),
                List.of(Ability.SAND_RUSH,Ability.KEEN_EYE), Ability.MOXIE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Unlike its pre-evolution Spothyena and its male counterpart Gormhyena, Khaheena are solitary hunters. Even though they blend in perfectly in a sandstorm, Khaheena thrives during full moon."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Khaheena");

    }


}
