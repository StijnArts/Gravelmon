package drai.dev.gravelmon.pokemon.orbis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Zodiaking extends drai.dev.gravelmon.pokemon.Pokemon {
    public Zodiaking() {
        super("Zodiaking",
                Type.FIRE,Type.DRAGON,
                new Stats(88,
                        88,
                        88,
                        88,
                        88,
                        88),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                88, 8880,
                new Stats(0,0,0,0,0,0), 8,
                0.5,
                288, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Zodiaking");

    }


}
