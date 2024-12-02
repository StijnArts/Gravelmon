package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Desteros extends drai.dev.data.pokemon.Pokemon {
    public Desteros() {
        super("Desteros",
                Type.FAIRY,
                new Stats(100,
                        100,
                        100,
                        100,
                        100,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 42,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                270, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Said to use the strings from its twin tails to tie people's destinies together. Korza has a special holiday dedicated to Desteros, celebrating the bonds we share with each other."),
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
           setLangFileName("Desteros");

    }


}
