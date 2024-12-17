package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Luminlux extends drai.dev.data.pokemon.Pokemon {
    public Luminlux() {
        super("Luminlux",
                Type.ROCK,Type.ELECTRIC,
                new Stats(50,
                        60,
                        95,
                        120,
                        70,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A towering colony of Luminlite become Luminlux - It has not yet harmonized all of its disparate parts, and thus skitters around erratically. Its many faces will flicker on and off randomly, disturbing those around it."),
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
           setLangFileName("Luminlux");

    }


}
