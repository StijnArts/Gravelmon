package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bubbeldam extends drai.dev.data.pokemon.Pokemon {
    public Bubbeldam() {
        super("Bubbeldam",
                Type.POISON, Type.PSYCHIC,
                new Stats(60,
                        60,
                        80,
                        120,
                        65,
                        40),
                List.of(Ability.CURIOUS_MEDICINE), Ability.POWER_OF_ALCHEMY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.125,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The cauldron it lives in is constantly heated, although no one knows how. Anything that goes into a Bubbeldam's sludge comes out completely different, if given enough time."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bubbeldam");

    }


}
