package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ragtoc extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ragtoc() {
        super("Ragtoc",
                Type.ROCK,Type.PSYCHIC,
                new Stats(30,
                        45,
                        78,
                        70,
                        100,
                        20),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 200,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It rhythmically shifts from side to side. If its rhythm is somehow interrupted, it can no longer maintain its energy. | Speed is bad, but I'd say it has a base special attack of 100 with special defense of 120 as well as defense."),
                List.of(),
                List.of(                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ragtoc");

    }


}
