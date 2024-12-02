package drai.dev.data.pokemon.urzavos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Chompupi extends drai.dev.data.pokemon.Pokemon {
    public Chompupi() {
        super("Chompupi",
                Type.STEEL,Type.GHOST,
                new Stats(40,
                        60,
                        80,
                        55,
                        30,
                        35),
                List.of(Ability.ROUGH_SKIN,Ability.FILTER), Ability.STRONG_JAW,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setLangFileName("Chompupi");

    }
}
