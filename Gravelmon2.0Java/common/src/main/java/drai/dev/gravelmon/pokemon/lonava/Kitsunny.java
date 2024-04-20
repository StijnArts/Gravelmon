package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Kitsunny extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kitsunny() {
        super("Kitsunny",
                Type.FIRE, Type.FAIRY,
                new Stats(65,
                        50,
                        50,
                        118,
                        135,
                        82),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("These Pokemon appear during droughts, summoning prevailing rains that rehydrate land deemed cruel by the sun. Originally discovered in Okeno, Kitsunny in Lonava are popular amongst doctors for their healing skills, but also because of their calming dispositions."),
                List.of(),
                List.of(                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kitsunny");

    }


}
